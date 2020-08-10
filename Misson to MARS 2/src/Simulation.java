import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation{

    public ArrayList<Item> loadItems(String path) throws Exception
    {
        File file = new File(path);
        Scanner fileScanner = new Scanner(file);
        ArrayList<Item> list = new ArrayList();
        Item item;
        while (fileScanner.hasNextLine())
        {
            String tmpStr = fileScanner.nextLine();
            item = new Item();
            item.inPutName(String.copyValueOf(tmpStr.toCharArray(),0, tmpStr.indexOf('=')));
            item.inPutWeight(Integer.valueOf(String.copyValueOf(tmpStr.toCharArray(),tmpStr.indexOf('=') + 1, tmpStr.length() - tmpStr.indexOf('=') - 1)));
            list.add(item);
        }
        return list;
    }

    public ArrayList<U1> loadU1(ArrayList<Item> items)
    {
        ArrayList<U1> listOfRockets = new ArrayList();
        U1 rocket;
        Item tmpItem = new Item();
        while (items.size() != 0)
        {
            rocket = new U1();
            items.remove(0);
            int i = 0;
            while (i < items.size())
            {
                if (rocket.canCarry(items.get(i)))
                {
                    rocket.carry(items.get(i));
                    items.remove(i);
                }
                else
                {
                    i++;
                }
            }
            listOfRockets.add(rocket);
        }
        return listOfRockets;
    }

    public ArrayList<U2> loadU2(ArrayList<Item> items)
    {
        ArrayList<U2> listOfRockets = new ArrayList();
        U2 rocket;
        //Item tmpItem = new Item();
        while (items.size() != 0)
        {
            rocket = new U2();
            items.remove(0);
            int i = 0;
            while (i < items.size())
            {
                if (rocket.canCarry(items.get(i)))
                {
                    rocket.carry(items.get(i));
                    items.remove(i);
                }
                else
                {
                    i++;
                }
            }
            listOfRockets.add(rocket);
        }
        return listOfRockets;
    }

    public int runSimulationU1(ArrayList<U1> rockets)
    {
        int totalCost = 0;
        for (int i = 0; i < rockets.size(); i++)
        {
            Rocket rocket = rockets.get(i);
            while ( !rocket.launch())
            {
                totalCost += rocket.cost;
            }

            while ( !rocket.land())
            {
                totalCost += rocket.cost;
            }
            totalCost += rocket.cost;
        }
        return totalCost;
    }

    public int runSimulationU2(ArrayList<U2> rockets)
    {
        int totalCost = 0;
        for (int i = 0; i < rockets.size(); i++)
        {
            Rocket rocket = rockets.get(i);
            while ( !rocket.launch())
            {
                totalCost += rocket.cost;
            }

            while ( !rocket.land())
            {
                totalCost += rocket.cost;
            }
            totalCost += rocket.cost;
        }
        return totalCost;
    }
}

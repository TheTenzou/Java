import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception
    {
        File file = new File("phase-1.txt");
        Scanner fileScanner = new Scanner(file);
        ArrayList<Item> list = new ArrayList();
        Item item;
        while (fileScanner.hasNextLine())
        {
            String tmpStr = fileScanner.nextLine();
            //System.out.println(tmpStr);
            item = new Item();
            item.inPutName(String.copyValueOf(tmpStr.toCharArray(),0, tmpStr.indexOf('=')));
            item.inPutWeight(Integer.valueOf(String.copyValueOf(tmpStr.toCharArray(),tmpStr.indexOf('=') + 1, tmpStr.length() - tmpStr.indexOf('=') - 1)));
            list.add(item);
        }
        System.out.println();
        Item test;
        for (int k = 0; k < list.size(); k++)
        {
            test = list.get(k);
            System.out.println(test.name());
            System.out.println(test.weight());
        }
    }
}

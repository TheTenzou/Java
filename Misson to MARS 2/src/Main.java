import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception
    {
        Simulation sim = new Simulation();
        ArrayList<Item> items = sim.loadItems("phase-1.txt");
        ArrayList<U1> rocketU1 = sim.loadU1(items);
        items = sim.loadItems("phase-1.txt");
        ArrayList<U2> rocketU2 = sim.loadU2(items);
        System.out.println("Total cost of phase one using rockets U1: " + sim.runSimulationU1(rocketU1) + "Million");
        System.out.println("Total cost of phase one using rockets U2: " + sim.runSimulationU2(rocketU2) + "Million");

        items = sim.loadItems("phase-2.txt");
        rocketU1 = sim.loadU1(items);
        items = sim.loadItems("phase-1.txt");
        rocketU2 = sim.loadU2(items);
        System.out.println("Total cost of phase two using rockets U1: " + sim.runSimulationU1(rocketU1) + "Million");
        System.out.println("Total cost of phase two using rockets U2: " + sim.runSimulationU2(rocketU2) + "Million");

    }
}

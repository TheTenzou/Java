public class U2 extends Rocket
{
    public U2()
    {
        rocketWeight =  18000;
        maxWeight =     29000;
        cargoWeight =   0;
        cost =          120;
    }

    public boolean launch()
    {
        return (Math.random() * 100 + 1) > (4 * (float)cargoWeight / maxWeight);
    }

    public boolean land()
    {
        return (Math.random() * 100 + 1) > (8 * (float)cargoWeight / maxWeight);
    }
}

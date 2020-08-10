public class U1 extends Rocket
{
    public U1()
    {
        rocketWeight =  10000;
        maxWeight =     18000;
        cargoWeight =   0;
        cost =          100;
    }

    public boolean launch()
    {
        return (Math.random() * 100 + 1) > (5 * (float)cargoWeight / maxWeight);
    }

    public boolean land()
    {
        return (Math.random() * 100 + 1) > ((float)cargoWeight / maxWeight);
    }
}

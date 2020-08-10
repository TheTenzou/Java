public class Rocket implements SpaceShip
{
    int rocketWeight;
    int maxWeight;
    int cargoWeight;
    int cost;

    public boolean launch()
    {
        return true;
    }

    public boolean land()
    {
        return true;
    }

    public boolean canCarry(Item item)
    {
        if (item.weight() + cargoWeight + rocketWeight <= maxWeight)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void carry(Item item)
    {
        cargoWeight += item.weight();
    }
}

interface WildAnimal
{
    void makesound();
}
class Lion implements WildAnimal
{
    @Override
    public void makesound()
    {
        System.out.println("Lion braks");
    }
}

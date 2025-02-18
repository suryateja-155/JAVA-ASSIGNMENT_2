public class Domestic
{
    void makesound()
    {
        System.out.println("Animal makes a sound");
    }
}
class DOG extends Domestic
{
    @Override
    void makesound() {
        System.out.println("DOG meows");
    }
}
class Cat extends Domestic
{
    @Override
    void makesound() {
        System.out.println("Cat meows");
    }
}

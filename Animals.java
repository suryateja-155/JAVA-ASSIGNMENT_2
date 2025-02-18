class Animals
{
    void eat()
    {
        System.out.println("eating.....");
    }
}
class dog extends Animals
{
    void bark()
    {
        System.out.println("barking.....");
    }
}
class BabyDog extends dog
{
    void weep()
    {
        System.out.println("weeping....");
    }
}
class TestInheritance2
{
    public static void main(String args[])
    {
        BabyDog d= new BabyDog();
        d.weep();
        d.eat();
        d.bark();
    }
}
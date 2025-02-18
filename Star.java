abstract class Star
{
    abstract void printInfo();
}
class  Labour extends Star
{
    void printInfo()
    {
        String name="Avinash";
        int age = 21;
        float salary = 222.2f;
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

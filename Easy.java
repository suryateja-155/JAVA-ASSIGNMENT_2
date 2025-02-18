class Easy
{
    static int count =0;
    Easy()
    {
        count++;
    }
    void displaycount()
    {
        System.out.println("Count :"+count);
    }
    public static void main(String[] args)
    {
        Easy obj1=new Easy();
        Easy obj2=new Easy();
        obj1.displaycount();
        obj2.displaycount();
    }
}

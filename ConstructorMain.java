public class ConstructorMain
{
        int x;
        public ConstructorMain(int y)
        {
            x=y;
        }
        public static void main(String[]arg)
        {
            ConstructorMain myobj=new ConstructorMain(5);
            System.out.println(myobj.x);
        }
}

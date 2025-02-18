public class Area
{
    private int l;
    private int b;
    public void setLength(int l)
    {
        this.l=l;
    }
    public void setBreadth(int b)
    {
        this.b=b;
    }
    public int getLength()
    {
        return l;
    }
    public int getBreadth()
    {
        return b;
    }
    public int getArea()
    {
        return l*b;
    }
}

abstract class AbstractFirst{
    int x;
    int y;
    void show(int x,int y)
    {
        System.out.println(x);
        System.out.println(y);
    }
    abstract void display();
}
class MyRegister{
    void register(AbstractFirst b)
    {
        b.display();
    }
}
class child extends AbstractFirst{
    void show(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println("Display");
    }
    public static void main(String arg[])
    {
        child c=new child();
        MyRegister mr=new MyRegister();
        mr.register(c);
    }
}

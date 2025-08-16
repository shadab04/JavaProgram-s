class FunctionOverloading {
    static void show()
        {
            System.out.println("zero arguments");
        }
    static void show(int x)
        {
            System.out.println("one argument");
        }
    static void show(int x,int y)
    {
        System.out.println("two arguments");
    }
     static void show(int x,int y,int z)
    {
        System.out.println("three arguments");
    }
    public static void main(String[] args) {
        show();
    }
    
}
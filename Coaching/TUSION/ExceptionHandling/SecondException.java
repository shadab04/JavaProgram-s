package TUSION.ExceptionHandling;
class SecondException {
    public static void main(String[] args) {
        doStuff();
    }
    public static void doStuff() {
        doStuff();
    }
    public static void doMoreStuff() {
        System.out.println(10/0);
    }
}

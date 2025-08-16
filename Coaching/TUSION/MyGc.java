package TUSION;

public class MyGc {
    int x = 12;

    public void finalize() throws Throwable {
        System.out.println("finalize method");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        int z = 1024 * 1024;
        Runtime rt = Runtime.getRuntime();
        System.out.println(rt.totalMemory() / z);
        System.out.println(rt.freeMemory() / z);
        MyGc m = new MyGc();
        try {
            m.finalize();
        } catch (Throwable e) {

        }
        System.out.println(m.x);
        m = null;
        for (int i = 1; i < 2000; i++) {
            System.gc();
        }
    }
}

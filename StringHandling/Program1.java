package StringHandling;

public class Program1 {

    // This method will create strings from a char array
    void stringApp(char[] ch, int position, int numberOfElement) {
        // Full char array as String
        String s = new String(ch);
        System.out.println("Full String: " + s);

        // Partial String from given position and length
        String s1 = new String(ch, position, numberOfElement);
        System.out.println("Partial String: " + s1);
    }

    public static void main(String[] args) {
        Program1 p = new Program1();

        char[] ch = {'A', 'P', 'P', 'S', 'Q', 'A', 'D', 'Z'};

        // Call method with char array, start position, and length
        p.stringApp(ch, 2, 3);
    }
}

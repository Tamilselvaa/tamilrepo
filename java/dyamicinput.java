import java.util.Scanner;
public class dyamicinput {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a byte value: ");
        byte byteVal = sc.nextByte();

        System.out.print("Enter a short value: ");
        short shortVal = sc.nextShort();

        System.out.print("Enter an int value: ");
        int intVal = sc.nextInt();

        System.out.print("Enter a long value: ");
        long longVal = sc.nextLong();

        System.out.print("Enter a float value: ");
        float floatVal = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double doubleVal = sc.nextDouble();

        System.out.print("Enter a character: ");
        char charVal = sc.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean boolVal = sc.nextBoolean();
        sc.nextLine();
        System.out.print("Enter a string: ");
        String strVal = sc.nextLine();

        System.out.println("\n===== You Entered =====");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
        System.out.println("String: " + strVal);
      
    }
}
import java.util.Scanner;

public class Hextal {
    public static void main(String[] args) {
        System.out.println("Skriv in hexadecimala tal här (åtminstone ett): ");
        Scanner sn = new Scanner(System.in);
        String hextal = sn.nextLine();
        if (hextal.contains("0x")) {
            System.out.println(hextal);
        } else {
            System.exit(0);
        }
    }
}

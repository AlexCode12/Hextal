import java.util.ArrayList;
import java.util.Scanner;

public class Hextal {
    public static void main(String[] args) {
        System.out.println("Skriv in hexadecimala tal här (åtminstone ett): ");
        Scanner sn = new Scanner(System.in);
        String hextal = sn.nextLine();
        int length = hextal.length();
        String ja = "";
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        for (int i = 0; i<length; i++) {
            char s = hextal.charAt(i);
            String g = Character.toString(s);
            switch (Character.toString(s)) {
                case "0": case "1": case "2": case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "x": case "a": case "b": case "c": case "d": case "e": case "f": case "A": case "B": case "C": case "D": case "E": case "F":
            ja += s;
            break;
            }
            ArrayList<String> ar = new ArrayList<String>();
            String[] arrSplit = ja.split("0x");
            for (int x=1; x < arrSplit.length; x++)
            {
                String thenumbers = arrSplit[x];
                System.out.println(thenumbers);
                System.out.println(""+Integer.valueOf(thenumbers,16));
            }
        }
    }
}

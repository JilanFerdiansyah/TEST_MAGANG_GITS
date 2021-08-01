import java.util.*;
public class soal5 {
    public static void main(String[] args) {
        // BY JILAN HAFIZH FERDIANSYAH
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.println("===========================================");
        System.out.println("========APLIKASI PENENTU PALINDROME========");
        System.out.println("===========================================");

        System.out.print("MASUKAN KALIMAT : ");
        string = scan.nextLine();

        String reverse = new StringBuffer(string).reverse().toString();

        System.out.println(string+" => "+reverse);
        if(reverse.equals(string)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Bukan Palindrome");
        }

        
    }
}

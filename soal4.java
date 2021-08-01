import java.util.*;

class soal4 {
    public static void main(String[] args) {
        // BY JILAN HAFIZH FERDIANSYAH
        String string;
        Scanner scan = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("========APLIKASI PEMBALIK KALIMAT========");
        System.out.println("=========================================");
        System.out.print("MASUKAN KALIMAT : ");
        string = scan.nextLine();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(string+" => "+reverse);
    }
}
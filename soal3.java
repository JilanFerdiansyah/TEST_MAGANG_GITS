import java.util.*;

public class soal3 {
    // BY JILAN HAFIZH FERDIANSYAH
    public static void main(String[] args) {
        int jam;
        int menit;
        int detik;
        String waktu;

        Scanner scan = new Scanner(System.in);

        System.out.println("============================= ");
        System.out.println("KONVERSI 12 JAM KE 24 JAM");
        System.out.println("============================= ");
        System.out.print("MASUKAN JAM : ");
        jam = scan.nextInt();
        System.out.print("MASUKAN MENIT : ");
        menit = scan.nextInt();
        System.out.print("MASUKAN DETIK : ");
        detik = scan.nextInt();
        scan.nextLine();
        System.out.print("AM ATAU PM : ");
        waktu = scan.nextLine();

        if (waktu.equals("AM") || waktu.equals("am")) {
            if (jam==12) {
                int jambaru;
                jambaru = jam - 12;
                System.out.println("============================= ");
                System.out.println(
                        jam + ":" + menit + ":" + detik + " AM"  + " => " + jambaru + ":" + menit + ":" + detik);
                System.out.println("============================= ");
            } else if(jam<=11){
                System.out.println("============================= ");
                System.out.println(
                        jam + ":" + menit + ":" + detik + " AM"  + " => " + jam + ":" + menit + ":" + detik);
                System.out.println("============================= ");
            }else{
                System.out.println("MOHON INPUTKAN FORMAT 12 JAM ");
            }
        } else if (waktu.equals("PM") || waktu.equals("pm")) {
            if (jam==12) {
                System.out.println("============================= ");
                System.out.println(
                        jam + ":" + menit + ":" + detik + " PM" + " => " + jam + ":" + menit + ":" + detik);
                System.out.println("============================= ");
            } else if(jam<=11){
                int jambaru;
                jambaru = jam + 12;
                System.out.println("============================= ");
                System.out.println(
                        jam + ":" + menit + ":" + detik + " PM" + waktu + " => " + jambaru + ":" + menit + ":" + detik);
                System.out.println("============================= ");
            }else{
                System.out.println("MOHON INPUTKAN FORMAT 12 JAM ");
            }
        }
    }
}

import java.util.*;

class soal1 {
    public static void main(String[] args) {
        // BY JILAN HAFIZH FERDIANSYAH
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("========================");
        System.out.print("Masukan Sebuah Bilangan : ");
        a = scan.nextInt();
        System.out.println("========================");
       

        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println(" Hello World");
        } else if(a % 5 == 0){
            System.out.println(" World");
        }else if(a % 3 == 0 ){
            System.out.println(" Hello ");
        }else{
            System.out.println("Harap masukan angka yang bisa di bagi 3 atau 5");
        }
    }
}
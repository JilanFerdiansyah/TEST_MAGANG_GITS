import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class soal2 {
   // BY JILAN HAFIZH FERDIANSYAH
   public static boolean EmailIsValid(String email) {
      String regex = "[\\w-]{1,20}@\\w{2,20}.\\w{2}.\\w{2}$";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(email);
      return matcher.matches();
   }

   public static void main(String[] args) {
      String email;

      Scanner scan = new Scanner(System.in);
      System.out.println("============================= ");
      System.out.println("PENGECEKAN EMAIL");
      System.out.println("============================= ");
      System.out.print("Masukan Email : ");
      email = scan.nextLine();

      boolean valid = EmailIsValid(email);

      if (valid) {
         System.out.println(email + " diperbolehkan");
      } else {
         System.out.println(email + "  tidak diperbolehkan");
      }
   }
}

package orneksoru1;
import java.util.Scanner;
public class Orneksoru1 {

    public static void main(String[] args) {
    Scanner klavye = new Scanner(System.in);
    System.out.print("Lütfen seri numaranızı giriniz : ");
    String Seri_No = klavye.nextLine();
    System.out.print("lütfen çaşışma saatinizi giriniz : ");
    int Çalışma_Saati = klavye.nextInt();
    System.out.print("Lütfen saatlik ücretinizi giriniz : ");
    int Saatlik_Ücret = klavye.nextInt();
    int Maas ;
    Maas = Saatlik_Ücret * Çalışma_Saati  ;
  
    System.out.print("sicil no = "+ Seri_No +" maas = " + Maas);
    
    }
}

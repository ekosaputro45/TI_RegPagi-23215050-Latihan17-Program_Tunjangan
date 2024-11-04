
package pertemuan6;
import java.util.Scanner;

public class Latihan_tunjangan {
  



    public static double hitungtotal(double gajipokok, boolean menikah) {
        double persentase = 0.35;
        if (menikah) {
            return gajipokok * persentase;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======== Program Tunjangan ========");
        
     
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        double gajipokok = scanner.nextDouble();
        
       
        System.out.print("Status Anda? (Menikah/Belum) : ");
        String status = scanner.next();
        boolean menikah = status.equalsIgnoreCase("Menikah");

       
        double allowance = hitungtotal(gajipokok, menikah);
        double totalSalary = gajipokok + allowance;

        
        System.out.println("\n======== Hasil Perhitungan Gaji Anda ========");
        System.out.printf("Gaji Pokok\t\t: Rp %.0f%n", gajipokok);
        System.out.printf("Tunjangan\t\t: Rp %.0f%n", allowance);
        System.out.printf("Total Gaji\t\t: Rp %.0f%n", totalSalary);
        System.out.println("(Developed by : eaiy)");
        
        scanner.close();
    }
}
  


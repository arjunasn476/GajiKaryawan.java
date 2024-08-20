import java.util.Scanner;

public class GajiKaryawan{
    public static void main(String[] args) {
        
        double gajiKaryawan, jamKerja, pajak, gajiBersih;

        Scanner input = new Scanner(System.in);

        System.out.println("Nominal Gaji: ");
        gajiKaryawan = input.nextDouble();
        System.out.println("Jam Kerja: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan Pajak: ");
        pajak = input.nextDouble();

        gajiBersih = gajiKaryawan*jamKerja;
        pajak = (pajak/100)*gajiBersih;
        gajiBersih = gajiBersih-pajak;

        System.out.println("Gaji Bersih Anda adalah: " + gajiBersih);
    }
}
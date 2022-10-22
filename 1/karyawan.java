package PBO

X5F;

public class karyawan {

    private int karyawan;
    private String karyawanName;
    private double gaji_usulan;
    private double gaji_bersih;

    public void setkaryawan(int karyawan) {
        this.karyawan = karyawan;
    }

    public void setkaryawanName(String karyawanName) {
        this.karyawanName = karyawanName;
    }

    public void setgaji_usulan(double gaji_usulan) {
        this.gaji_usulan = gaji_usulan;
    }

    private void setgaji_bersih(double gaji_bersih) {
        this.gaji_bersih = gaji_bersih;
    }

    public int getkaryawan() {
        return karyawan;
    }

    public String getkaryawanName() {
        return karyawanName;
    }

    public double getgaji_usulan() {
        return gaji_usulan;
    }

    public double getgaji_bersih() {
        return gaji_bersih;
}

public void kalkulasigaji_bersih (double potongan){
        double jumlah_gaji = gaji_usulan * (potongan / 100);
        double gaji_bersih = gaji_usulan - jumlah_gaji;
        this.setgaji_bersih(gaji_bersih);
Makasih bayong

import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        karyawan newkaryawan = getkaryawanDetails();
        double potongan = getpotongan();

        System.out.println();
        System.out.println("Confirm karyawan details: ");
        System.out.println("Id : " + newkaryawan.getkaryawan());
        System.out.println("Name : " + newkaryawan.getkaryawanName());
        System.out.println("gaji_usulan : " + newkaryawan.getgaji_usulan());

        newkaryawan.kalkulasigaji_bersih(potongan);
        System.out.println("gaji_bersih : " + newkaryawan.getgaji_bersih());
    }

    public static karyawan getkaryawanDetails() {
        karyawan karyawan = new karyawan();
        System.out.println("Id: ");
        karyawan.setkaryawan(scanner.nextInt());
        System.out.println("Name: ");
        karyawan.setkaryawanName(scanner.next());
        System.out.println("gaji_usulan: ");
        karyawan.setgaji_usulan(scanner.nextDouble());
        return karyawan;
    }

    public static double getpotongan() {
        System.out.println("potongan:");
        double potongan = scanner.nextDouble();
        return potongan;
    }
}

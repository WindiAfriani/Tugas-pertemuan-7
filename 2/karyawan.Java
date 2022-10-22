Public class karyawan{

    private int karyawan;
    private String karyawanName;
    private double gaji_usulan;
    private double gaji_bersih;

    public void setkaryawan(int karyawan){
        this.karyawan = karyawan;
    }

    public void setkaryawanName(String karyawanName){
        this.karyawanName = karyawanName;
    }

    public void setgaji_usulan(double gaji_usulan){
        this.gaji_usulan = gaji_usulan;
    }

    private void setgaji_bersih(double gaji_bersih){
        this.gaji_bersih = gaji_bersih;
    }

    public int getkaryawan(){
        return karyawan;
    }

    public String getkaryawanName(){
        return karyawanName;
    }

    public double getgaji_usulan(){
        return gaji_usulan;
    }

    public double getgaji_bersih(){
        return gaji_bersih;
    }

    public void kalkulasigaji_bersih (double potongan){
        double jumlah_gaji = gaji_usulan * (potongan / 100);
        double gaji_bersih = gaji_usulan - jumlah_gaji;
        this.setgaji_bersih(gaji_bersih);
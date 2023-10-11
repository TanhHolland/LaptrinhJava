package bangkenhapkhosapxeptheochietkhau;

public class SanPham implements Comparable<SanPham> {
    private String name,kitu = "";
    private double soluong,dongia,chietkhau,thanhtien;
    public String ma;
    public double getChietKhau(double soluong) {
        if (soluong > 10) return 0.05;
        if (soluong >= 8) return 0.02;
        if (soluong >= 5) return 0.01;
        return 0.0;
    }

    public SanPham(String name, String soluong, String dongia) {
        String[] ds = name.split("\\s+");
        for(int i = 0; i < ds.length-1; i++) {
            kitu += String.valueOf(ds[i].charAt(0)).toUpperCase();
        }
        this.name = name.trim();
        this.soluong = Double.parseDouble(soluong);
        this.dongia = Double.parseDouble(dongia);
        chietkhau = this.dongia * this.soluong * getChietKhau(this.soluong);
        thanhtien = this.dongia * this.soluong - chietkhau;
    }


    public String getKitu() {
        return kitu;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.0f %.0f",ma,name,chietkhau,thanhtien);
    }

    @Override
    public int compareTo(SanPham o) {
        return (int) (o.chietkhau - chietkhau);
    }
}

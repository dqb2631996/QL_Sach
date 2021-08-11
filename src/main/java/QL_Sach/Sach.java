package QL_Sach;

public class Sach {

    String tensach;
    String tacgia;
    double gia;
    int soluong;
    String theloai;
    // a) tao ham dung

    public Sach(String tensach, String tacgia, double gia, int soluong, String theloai) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.gia = gia;
        this.soluong = soluong;
        this.theloai = theloai;
    }

    public Sach() {
    }
// b) get - set

    public String getTensach() {
        return tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public double getGia() {
        return gia;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getTheloai() {
        return theloai;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setTheloai(String theloai) {
        this.theloai = theloai;
    }
    
    @Override
    public String toString() {
        return "Ten sach: " + tensach;
    }

}

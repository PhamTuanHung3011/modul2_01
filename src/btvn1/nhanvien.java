package btvn1;

public class nhanvien {
    private int id;
    private String ten;
    private int tuoi;
    private String diachi;
    private double luong;
    private double ngaycong;
    static int idnumber = 1;

    public nhanvien() {
        this.id= idnumber++;
    }

    public nhanvien( String ten, int tuoi, String diachi, double luong, double ngaycong) {
        this.id = idnumber++;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.ngaycong = ngaycong;
    }

    public int getId() {
        return id;
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getNgaycong() {
        return ngaycong;
    }

    public void setNgaycong(double ngaycong) {
        this.ngaycong = ngaycong;
    }

    public void luongthang() {
    }

    @Override
    public String toString() {
        return "nhanvien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", diachi='" + diachi + '\'' +
                ", luong=" + luong +
                ", ngaycong=" + ngaycong +
                '}';
    }
}

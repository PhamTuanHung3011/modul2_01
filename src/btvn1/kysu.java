package btvn1;

public class kysu extends nhanvien {
    private double heso;

    public kysu() {
    }

    public kysu( String ten, int tuoi, String diachi, double luong, double ngaycong) {
        super(ten, tuoi, diachi, luong, ngaycong);
        this.heso = heso;
    }

    public double getHeso() {
        return heso;
    }

    public void setHeso(double heso) {
        this.heso = heso;
    }

    @Override
    public String toString() {
        return "kysu{" +
                "id=" + getId() +
                ", ten='" + getTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", diachi='" + getDiachi() + '\'' +
                ", luong=" + getLuong() +
                ", ngaycong=" + getNgaycong() +
                "heso=" + heso +
                '}';
    }

    @Override
    public void luongthang() {
        double luongks = (getLuong()/26) * getNgaycong() * heso;
    }
}

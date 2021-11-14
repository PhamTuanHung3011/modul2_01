package btvn1;

public class congnhan extends nhanvien {

    public congnhan() {

    }

    public congnhan(String ten, int tuoi, String diachi, double luong, double ngaycong) {
        super(ten, tuoi, diachi, luong, ngaycong);
    }

    @Override
    public String toString() {
        return "Cong nhan {" +
                "id=" + getId() +
                ", ten='" + getTen() + '\'' +
                ", tuoi=" + getTuoi() +
                ", diachi='" + getDiachi() + '\'' +
                ", luong=" + getLuong() +
                ", ngaycong=" + getNgaycong() +
                '}';
    }


    @Override
    public void luongthang() {
       double luong = (getLuong() / 26 ) * getNgaycong();
        System.out.println(luong);
    }
}

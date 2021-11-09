package lopVaDoituong;

public class hinhChuNhat {
    double width, height;

    public hinhChuNhat() {

    }
    public hinhChuNhat(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getChuvi() {
        return (this.width + this.height) * 2;
    }
    public double getDienTich() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "hinhChuNhat{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}

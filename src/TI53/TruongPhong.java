package TI53;

import java.util.Scanner;

public class TruongPhong extends ConNguoi{
    private Integer namSinh;
    private Integer soLuongNhanVienQuanLy;

    public TruongPhong() {
    }

    public TruongPhong(String hoTen, Integer namSinh, Integer heSoLuong, Integer soLuongNhanVienQuanLy) {
        super(hoTen, heSoLuong);
        this.namSinh = namSinh;
        this.soLuongNhanVienQuanLy = soLuongNhanVienQuanLy;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public Integer getSoLuongNhanVienQuanLy() {
        return soLuongNhanVienQuanLy;
    }

    public void setSoLuongNhanVienQuanLy(Integer soLuongNhanVienQuanLy) {
        this.soLuongNhanVienQuanLy = soLuongNhanVienQuanLy;
    }

    public void showInfo() {
        System.out.println("Truong phong: \n"
                + "Ho ten: " + getHoTen()
                + ", Nam sinh: " + getNamSinh()
                + ", He so luong: " + getHeSoLuong()
                + ", So luong nhan vien quan ly: " + getSoLuongNhanVienQuanLy()
                + "\n-----");
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten truong phong: ");
        this.setHoTen(scanner.nextLine());
        System.out.print("Nhap nam sinh: ");
        this.setNamSinh(scanner.nextInt());
        System.out.print("Nhap he so luong: ");
        this.setHeSoLuong(scanner.nextInt());
        System.out.print("Nhap he so luong nhan vien quan ly: ");
        this.setSoLuongNhanVienQuanLy(scanner.nextInt());
    }

    public Integer luong() {
        return getHeSoLuong()*2200000;
    }
}

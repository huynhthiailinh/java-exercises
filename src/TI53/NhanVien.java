package TI53;

import java.util.Scanner;

public class NhanVien extends ConNguoi{
    private String ngaySinh;
    private String tenDonVi;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ngaySinh, Integer heSoLuong, String tenDonVi) {
        super(hoTen, heSoLuong);
        this.ngaySinh = ngaySinh;
        this.tenDonVi = tenDonVi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    public void showInfo() {
        System.out.println("Nhan vien: \n"
                + "Ho ten: " + getHoTen()
                + ", Ngay sinh: " + getNgaySinh()
                + ", He so luong: " + getHeSoLuong()
                + ", Ten don vi: " + getTenDonVi()
                + "\n-----");
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten nhan vien: ");
        this.setHoTen(scanner.nextLine());
        System.out.print("Nhap ngay sinh: ");
        this.setNgaySinh(scanner.nextLine());
        System.out.print("Nhap he so luong: ");
        this.setHeSoLuong(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nhap ten don vi: ");
        this.setTenDonVi(scanner.nextLine());
    }

    public Integer luong() {
        return getHeSoLuong()*1250000;
    }
}

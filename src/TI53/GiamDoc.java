package TI53;

import java.util.Scanner;

public class GiamDoc extends ConNguoi{
    private Integer namSinh;
    private Integer heSoChucVu;

    public GiamDoc() {
    }

    public GiamDoc(String hoTen, Integer namSinh, Integer heSoLuong, Integer heSoChucVu) {
        super(hoTen, heSoLuong);
        this.namSinh = namSinh;
        this.heSoChucVu = heSoChucVu;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public Integer getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(Integer heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten giam doc: ");
        this.setHoTen(scanner.nextLine());
        System.out.print("Nhap nam sinh: ");
        this.setNamSinh(scanner.nextInt());
        System.out.print("Nhap he so luong: ");
        this.setHeSoLuong(scanner.nextInt());
        System.out.print("Nhap he so chuc vu: ");
        this.setHeSoChucVu(scanner.nextInt());
    }

    public void showInfo() {
        System.out.println("Giam doc: \n"
                + "Ho ten: " + getHoTen()
                + ", Nam sinh: " + getNamSinh()
                + ", He so luong: " + getHeSoLuong()
                + ", He so chuc vu: " + getHeSoChucVu()
                + "\n-----");
    }

    public Integer luong() {
        return (getHeSoLuong()+getHeSoChucVu()) * 3000000;
    }
}

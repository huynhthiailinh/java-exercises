package TI53;

public class main {
    public static void main(String[] args) {
        GiamDoc giamDoc1 = new GiamDoc();
        TruongPhong truongPhong1 = new TruongPhong();
        NhanVien nhanVien1 = new NhanVien();
        NhanVien nhanVien2 = new NhanVien();

        nhanVien1.inputInfo();
        nhanVien2.inputInfo();
        giamDoc1.inputInfo();
        truongPhong1.inputInfo();

        giamDoc1.showInfo();
        truongPhong1.showInfo();
        nhanVien1.showInfo();
        nhanVien2.showInfo();

        System.out.println("Luong cua giam doc " + giamDoc1.getHoTen() + " la: " + giamDoc1.luong());
        System.out.println("Luong cua truong phong " + truongPhong1.getHoTen() + " la: " + truongPhong1.luong());
        System.out.println("Luong cua nhan vien " + nhanVien1.getHoTen() + " la: " + nhanVien1.luong());
        System.out.println("Luong cua nhan vien " + nhanVien2.getHoTen() + " la: " + nhanVien2.luong());
    }
}

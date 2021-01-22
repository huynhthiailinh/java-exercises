package TI53;

public abstract class ConNguoi {
    private String hoTen;
    private Integer heSoLuong;

    public ConNguoi() {
    }

    public ConNguoi(String hoTen, Integer heSoLuong) {
        this.hoTen = hoTen;
        this.heSoLuong = heSoLuong;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(Integer heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
}

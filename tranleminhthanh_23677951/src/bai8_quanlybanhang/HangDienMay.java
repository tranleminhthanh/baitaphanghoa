package bai8_quanlybanhang;

class HangDienMay extends hangHoa {
    private int thoiGianBaoHanh; // Thời gian bảo hành (tháng)
    private double congSuat; // Công suất (KW)

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
                       int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public String danhGiaBanBuon() {
        if (soLuongTon < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }
}
package bai8_quanlybanhang;

class HangSanhSu extends hangHoa {
    private String nhaSanXuat;
    private String ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia,
                      String nhaSanXuat, String ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String danhGiaBanBuon() {
        if (soLuongTon > 50) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }

    @Override
    public double tinhVAT() {
        return donGia * 0.10;
    }
}

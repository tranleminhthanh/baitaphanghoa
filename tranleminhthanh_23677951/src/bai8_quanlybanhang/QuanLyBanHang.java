package bai8_quanlybanhang;

class QuanLyHangHoa {
    private QuanLyHangHoa[] danhSachHang;
    private int count;

    public QuanLyHangHoa(int size) {
        danhSachHang = new QuanLyHangHoa[size];
        count = 0;
    }

    public void themHang(QuanLyHangHoa hang) {
        for (int i = 0; i < count; i++) {
            if (danhSachHang[i].getMaHang().equals(hang.getMaHang())) {
                throw new IllegalArgumentException("Mã hàng đã tồn tại.");
            }
        }
        danhSachHang[count++] = hang;
    }

    public void inDanhSach() {
        for (int i = 0; i < count; i++) {
            System.out.println("Mã hàng: " + danhSachHang[i].getMaHang() +
                               ", Tên hàng: " + danhSachHang[i].getTenHang() +
                               ", Số lượng tồn: " + danhSachHang[i].getSoLuongTon() +
                               ", Đơn giá: " + danhSachHang[i].getDonGia() +
                               ", VAT: " + danhSachHang[i].tinhVAT() +
                               ", Đánh giá: " + ((Object) danhSachHang[i]).danhGiaBanBuon());
        }
    }

	private String tinhVAT() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getDonGia() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getSoLuongTon() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getTenHang() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getMaHang() {
		// TODO Auto-generated method stub
		return null;
	}
}

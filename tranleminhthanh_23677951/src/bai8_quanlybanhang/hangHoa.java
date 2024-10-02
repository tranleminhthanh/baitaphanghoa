package bai8_quanlybanhang;


public abstract class hangHoa {
	protected String maHang;
	protected String tenHang;
	protected int soLuongTon;
	protected double donGia;
	
// hàm tạo 
	public String getMaHang() {
		return maHang;
	}
	public String getTenhang() {
		return tenHang;
	}
	public int getSoluongTon() {
		return soLuongTon;
	}
	public double DonGia() {
		return donGia;
	}
	
	
	
// hàm kiểm tra 
public hangHoa(String maHang, String tenHang, int soluongTon, double donGia) {
	if (maHang == null || maHang.trim() .isEmpty()) {
		throw new IllegalArgumentException("vui long nhap lai ma hang  ");	
	} this.maHang=maHang;
	if (tenHang == null || tenHang.isEmpty()) {
		   throw new IllegalArgumentException(" vui long khong de ten hang bi trong");
	} this.tenHang=tenHang;
	if(soluongTon<0) {
		   throw new IllegalArgumentException("vui long de so luong ton > 0");
	} this.soLuongTon=soluongTon;
	if(donGia <= 0) {
		throw new IllegalArgumentException("vui long de don gia > 0");
	}this.donGia=donGia;
}
public abstract String danhGiaBanBuon();
public abstract double tinhVAT();

	
	
	
	
	
	
	





}




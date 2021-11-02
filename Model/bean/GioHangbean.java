package bean;

public class GioHangbean {
	private String masach;
	private String tensach;
	private String tacgia;
	private int slmua;
	private long gia;
	private long thanhtien;	
	
	public GioHangbean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GioHangbean(String masach, String tensach, String tacgia, int slmua,Long gia) {
		super();
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.slmua = slmua;
		this.gia = gia;
		this.thanhtien = slmua * gia;
	}

	public String getMasach() {
		return masach;
	}

	
	
	public Long getGia() {
		return gia;
	}

	public void setGia(Long gia) {
		this.gia = gia;
	}

	public void setMasach(String masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public int getSlmua() {
		return slmua;
	}

	public void setSlmua(int slmua) {
		this.slmua = slmua;
	}

	public long getThanhtien() {
		return this.slmua * this.gia;
	}

	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}

	@Override
	public String toString() {
		return "GioHangbean [masach=" + masach + ", tensach=" + tensach + ", tacgia=" + tacgia + ", slmua=" + slmua
				+ ", thanhtien=" + thanhtien + "]";
	}

}

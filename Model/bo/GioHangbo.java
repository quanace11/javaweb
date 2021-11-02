package bo;

import java.util.ArrayList;
import bean.GioHangbean;

public class GioHangbo {
	public ArrayList<GioHangbean> ds= new ArrayList<GioHangbean>();
    public void Them(String masach, String tensach, String tacgia, int soluongmua, Long gia) {
    	for(GioHangbean g: ds)
    		if(g.getMasach().equals(masach)) {
    			g.setSlmua(g.getSlmua()+soluongmua);
    			return ;
    		}
    	ds.add(new GioHangbean(masach, tensach, tacgia, soluongmua, gia));
    }
	
	public void Xoa(String ms) {
		for (GioHangbean giohang: ds) {
			if (giohang.getMasach().equals(ms)) {
				ds.remove(giohang);
				return;
			}
		}
	}
	
	public long TongTien() {
		long sum = 0;
		for (GioHangbean giohang: ds) {
			sum += giohang.getThanhtien();
		}
		return sum;
	}
	
	public void XoaTatCa() {
		ds.clear();
	}
}

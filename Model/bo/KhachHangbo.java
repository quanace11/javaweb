package bo;

import java.util.ArrayList;

import bean.KhachHangbean;
import bean.sachbean;
import dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao khdao = new KhachHangdao();
	public ArrayList<KhachHangbean> getKhachHang() {
			return khdao.getkhachhang();
		}
		public KhachHangbean ktdn(String makh, String matkhau) {
			ArrayList<KhachHangbean> ds = getKhachHang();		
			for (KhachHangbean kh : ds) {
				if(kh.getMakh().equals(makh) && kh.getMatkhau().equals(matkhau))
					return kh;			
			}
			return null;
		}

}
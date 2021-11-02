package dao;
import java.util.ArrayList;

import bean.KhachHangbean;
import bean.Khoabean;

public class KhachHangdao {
	public ArrayList<KhachHangbean> getkhachhang(){
		 ArrayList<KhachHangbean> ds= new ArrayList<KhachHangbean>();
		 ds.add(new KhachHangbean("kh1", "Nguyễn Văn A","Huế","123456"));
		 ds.add(new KhachHangbean("kh2", "Nguyễn Văn B","Quảng Trị","123123"));
		 ds.add(new KhachHangbean("kh3", "Nguyễn Văn C","Quảng Ngãi","123321"));
		 ds.add(new KhachHangbean("kh4", "Nguyễn Văn D","Quảng Nam","123111"));
		 return ds;
	}
}

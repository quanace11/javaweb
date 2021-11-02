
package bo;

import java.util.ArrayList;

import bean.SinhVienbean;
import dao.SinhViendao;

public class SinhVienbo {
	SinhViendao svDao = new SinhViendao();
	public ArrayList<SinhVienbean> getsv(){
		return svDao.getsv();
	}
	
	 public ArrayList<SinhVienbean> TimMakhoa(String malop){
		 ArrayList<SinhVienbean> ds= svDao.getsv();
		 ArrayList<SinhVienbean>  tam= new ArrayList<SinhVienbean>();
		 for(SinhVienbean sv: ds)
			 if(sv.getMalop().equals(malop))
				 tam.add(sv);
		 return tam;
 	 }

	 public ArrayList<SinhVienbean> Tim(String key){
		 ArrayList<SinhVienbean> ds= svDao.getsv();
		 ArrayList<SinhVienbean>  tam= new ArrayList<SinhVienbean>();
		 for(SinhVienbean sv: ds)
			 if(sv.getMalop().contains(key)||
					 sv.getHoten().toLowerCase().contains(key.toLowerCase()) ||
					 sv.getDiachi().toLowerCase().contains(key.toLowerCase()))
				 tam.add(sv);
		 return tam;
 	 }
	
}
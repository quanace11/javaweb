package bo;
import java.util.ArrayList;

import bean.sachbean;
import dao.sachdao;

public class sachbo {
	sachdao sdao= new sachdao();
	   public ArrayList<sachbean> getsach(){
		   return sdao.getsach();
	   }
	   public Long DemSach(String maloai) {
		   ArrayList<sachbean> ds= getsach();
		   Long d=(long)0;
		   for(sachbean s: ds)
			   if(s.getMaloai().equals(maloai))
				   d++;
		   return d;
	   }
	   public ArrayList<sachbean> TimLoai(String maloai) {
		   ArrayList<sachbean> ds= getsach();
		   ArrayList<sachbean> tam= new ArrayList<sachbean>();
		   for(sachbean s: ds)
			   if(s.getMaloai().equals(maloai))
				   tam.add(s);
		   return tam;
	   }
	   public ArrayList<sachbean> Tim(String ms){
		   ArrayList<sachbean> ds=sdao.getsach();
		   ArrayList<sachbean> tam=new ArrayList<sachbean>();
		   for(sachbean s :ds)
		   {
			   if(s.getTensach().toLowerCase().contains(ms.toLowerCase())
					   || s.getTacgia().toLowerCase().contains(ms.toLowerCase())
					   ||s.getMasach().equals(ms))
				   tam.add(s);
			   
				   
		   }
		   return tam;
	   }
	
}

package examples;

class exen{
	private String data;
	private String data2;
	
	
	public String getdata() {
		return data;
	}
	public void setdata(String d) {
		data= d;
	}
	
}


//class exen{
//	private String data="hello";
//	private String data2="rohi";
//	
//	public String  getData() {
//		return data;
//	}
//	
//	public String getdata2() {
//		return data2;
//	}
//	
//}

public class Encapsul_ex {

	public static void main(String[] args) {
		
		exen e = new exen();
	   e.setdata("rohith");
	   System.out.println(e.getdata());
//		System.out.println(e.getData()+":" +e.getdata2());

	}

}

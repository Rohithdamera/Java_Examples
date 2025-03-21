package Pratice_1;

public class String_Buffer {

	public static void main(String[] args) {
	StringBuffer st = new StringBuffer();
      st.append("chinna");
      System.out.println("after appending: "+st);
      st.insert(6,  "Chinna");
      System.out.println("after insert: "+st);
      st.append("ram");
      System.out.println("after appending: "+st);
      st.delete(6, 12);
      System.out.println("after delete : "+st);
      st.reverse();
      System.out.println("after reverse :"+st);
      
	}

}

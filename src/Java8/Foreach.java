package Java8;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		List<Integer> ex=Arrays.asList(12,2,3,4445,6);
		
//		for(int i=0;i<ex.size();i++) {
//		}
//		System.out.println(ex);
//		for(int i: ex) {
//		}
//			System.out.println(ex);
//		demo d = (int i)-> System.out.println( i);
//		d.demo(22);
		ex.forEach(i->System.out.println(i*2));
		
		
		

	}

}

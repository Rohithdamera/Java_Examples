package Pratice_1;

import java.util.Scanner;

class arr{
	int rollno;
	String name;
	String branch;
	
	
}
public class Array_of_objects {

	public static void main(String[] args) 
	{
		arr a= new arr();
		a.rollno=1;
		a.name="rohi";
		a.branch="mca";
		
		
		arr b= new arr();
		b.rollno=2;
		b.name="chinna";
		b.branch="mba";
		
		
		arr are []= new arr[2];
		are[0]=a;
		are[1]=b;
		
		for (int i=0; i<are.length;i++) {
			System.out.println(are[i].rollno+":"+are[i].name+":"+are[i].branch);
		}
		
		for(arr am : are) {
			System.out.println(am.rollno+""+am.name+""+am.branch);
		}
}
}



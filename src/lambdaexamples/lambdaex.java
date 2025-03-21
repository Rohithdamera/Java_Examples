package lambdaexamples;

interface fact{
    int foo(int n);

 }

 interface addition{
     int add(int a, int b);
 }
public class lambdaex {


static fact factorial =(int n)->{
	int fact=1;
	int count=0;
	for (int i=1; i<=n; i++) {
		fact= fact*i;
		count=count+1;
		
	}
	return fact/count;
	
};
static addition addfunction=(int a,int b)->a+b;


 
 public static void main(String[] args)
 {
     int result =addfunction .add(1,11);
     int re= factorial.foo(5);
     System.out.println(re);
     System.out.println(result);
 }
}
package Java8;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

public class Functional_Interface_Supplier {

	public static void main(String[] args) {
		Supplier <Integer> date=()->LocalDate.now().getDayOfMonth();
		System.out.println(date.get());
		 Supplier<Integer> randomIntegerSupplier = () -> new Random().nextInt(100);
		 System.out.println(randomIntegerSupplier.get());
		 Supplier<Integer> k=()-> LocalDate.now().getDayOfYear();
		 System.out.println(k.get());
		 
		 IntFunction<String> ex= a->Integer.toString(a);
		 System.out.println(ex.apply(21));
		 
		 ToDoubleFunction<String> e=a->Double.parseDouble(a);
		 System.out.println(e.applyAsDouble("23"));
		 
		 String s= "1234";
		 int l = Integer.parseInt(s);
		 if(l==1234)
		 System.out.println(l);

	}

}

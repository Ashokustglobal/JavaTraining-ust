package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {
	
public static void main(String[] args) {
	
	List<String>list=new ArrayList<>();
	list.add("Ashok");
	list.add("Kumar");
	list.add("Ram");
	list.add("John");
	list.add("Tny");
	list.add("Thor");
	 
	list.stream().forEach((name)->{
		printName(() -> name);
	});
	
}

public static void printName(Supplier<String> supplier) {
	 System.out.println(supplier.get());
	
}
}

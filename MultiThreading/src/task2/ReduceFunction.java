package task2;

import java.util.List;
import java.util.Map;

public class ReduceFunction {
public static void main(String[] args) {
	var listOfNumbers=List.of(5,10,33,11,55,99);
	var sum=listOfNumbers.stream().filter(s->s%2!=0).reduce(0,(num1,num2)->+num2);
	System.out.println(sum);
	

	
}
}

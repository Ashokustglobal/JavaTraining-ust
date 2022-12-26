package Panvalidation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import flatMap.Person;

public class PanValidationDao {

	
	public static List<PanNumberValidation>getAll(){
		return Stream.of(new  PanNumberValidation(100,"Asok","[A-Z]{5}[0-9]{4}[A-Z]{1}"),
				new  PanNumberValidation(100,"Asok","[A-Z]{5}[0-9]{4}[A-Z]{1}"),
						new  PanNumberValidation(100,"","[A-Z]{5}[0-9]{4}[A-Z]{1}"),
						new  PanNumberValidation(100,"Asok","[A-Z]{5}[0-9]{4}[A-Z]{1}"))
				.collect(Collectors.toList());
	
	
}
}

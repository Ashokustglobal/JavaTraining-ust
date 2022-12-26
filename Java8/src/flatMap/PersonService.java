package flatMap;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ustjavafsdb414
 *
 */
public class PersonService {


	public static void main(String[] args) {
		
		List<Person> list=PersonDao.getAll();
		
		List<String>email=list.stream().map(person->person.getEmil()).collect(Collectors.toList());

		List<String>flatMap=list.stream().flatMap(person1->person1.getPhoneNumber().stream()).collect(Collectors.toList());
		System.out.println(email);
		System.out.println(flatMap);
		
	}

			
}

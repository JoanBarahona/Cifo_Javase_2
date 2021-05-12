package personexample;

public class TestPerson {

	public static void executePerson() {

		createAndTestObjectsPerson();
	}

	public static void createAndTestObjectsPerson() {

		// i am going to create an object WITHOUT parameters,
		//that is, an empty object
		Person sergi = new Person();

		// an objecte wiht just a pair of parameters: name and age
		Person isa = new Person("Isabel", 18);

		// an object with all the parameters used		
		Person toni = new Person("Antonio", 30, 80, 180, 2000);

		// sergi object, that is, tag "sergi" calls toString Method
		sergi.toString();

		// and now i am going to use toString to print this object
		System.out.println(sergi.toString());

		// this Eclipse IDE allows me to use object without toString
		System.out.println(toni);

		System.out.println(isa);
			
		sergi.setName("Sergi");
		sergi.setAge(20);
		sergi.setWeigth(60);
		sergi.setHeigth(180);
		sergi.setBasicSalary(2000);
		
		System.out.println(sergi);
		
		System.out.println("Sergi's age: " + sergi.getAge() + "\n");
		
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 30 years old
		
		toni.becomeOlder();
		
		System.out.println("Toni's age: " + toni.getAge() + "\n"); // 31 years old
		
		

	}
	

	
	

}

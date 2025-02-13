import java.util.List;

public class program01 {

    public static void main(String[] args) {
        List<Employee> employee = EmployeeData.get();

//print list of all employees
//employee.stream().forEach(e->System.out.println(e));

//greater than 20 k and starts with m
//employee.stream()
//.filter(e -> e.getSalary() >20000.0)
//.filter(e -> e.getLastName().startsWith("m"))
//.forEach(e -> System.out.println(e));



//sorted by first name
//employee.stream()
//.sorted((e1,e2) -> e1.getFirstname().compareTo(e2.getFirstname())).forEach(e->System.out.println(e));


//only firstname in sorted order

//employee.stream()
//.map(e -> e.getFirstname())
//.distinct()
//.sorted()
//.forEach(e->System.out.println(e));


//count of employess in "dev"
//System.out.println(
//employee.stream().filter(e -> e.getDepartment().equals("dev"))
//.count());
//	}
//


//sum of salaries of all employees in dev department
//System.out.println(
//employee.stream().filter(e -> e.getDepartment().equals("dev")).mapToDouble(e -> e.getSalary()).sum());
//}
//}



////max salary of the employees
//System.out.println( employee.stream()
//.mapToDouble(e -> e.getSalary()).max());

//list of employees first name

//		 List<String> list= employee.stream().map(e -> e.getFirstname())
//				 .distinct().collect(Collectors.toList());
//		 System.out.println(list);


//immutable list of names
//List<String> list= employee.stream().map(e -> e.getFirstname())
//.distinct().collect(Collectors.toUnmodifiableList());
//System.out.println(list);


//map of employees data with name as key and salary as value

//Map<String, Double> map = employee.stream()
//.collect(Collectors.toMap(e -> e.getFirstname(),e -> e.getSalary()));
//
//System.out.println(map);

//Map<String, String> map = employee.stream()
//.collect(Collectors.toMap(e -> e.getFirstname(),e -> e.getDepartment()
//		, (a,b)-> a + "-" + b));
//
//System.out.println(map);

    }
    
}

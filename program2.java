public class program2 {
    public static void main(String[] args) {
        //void foreach 
//	number.stream()
//	.forEach(e -> System.err.println(e));
	
	//filter
	//number.stream().filter(e ->e% 2==0).forEach(e->System.out.println(e));
	
	
	//map
	//number.stream().map(e-> e*e).forEach(e->System.out.println(e));
	
	
	//number.stream().map(e -> "number" + e).forEach(e->System.out.println(e));
	
	//number.stream().map(e -> List.of(e*2, e*3)).forEach(e->System.out.println(e));
	
	//number.stream().flatMap(e->  List.of(e*3).stream()).forEach(e->System.out.println(e));
	
	//number.stream().flatMap(e-> Stream.of(e*2,e*3,e*4)).forEach(e->System.out.println(e));
	
	//reduce
	
//System.out.println(	number.stream().filter(e-> e%2==0).reduce(1,(e,carry) -> e*carry));

	//System.out.println(	number.stream().filter(e-> e%2==0).mapToInt(e-> e*e).sum());
	
	//System.out.println(	number.stream().filter(e-> e%2==0).peek(e-> System.out.println(e)).mapToInt(e -> e*e).peek(e-> System.out.println(e)).sum());
	
	number.stream().filter(e-> e%2==0).map(e -> e*e).toArray();

    }
    
}

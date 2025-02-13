import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class program {

    public static void main(String[] args) {
        //collection used for sorting list
//		List<Integer> number = new ArrayList<Integer>();
//		number.add(23);
//		number.add(26);
//		number.add(22);
//		number.add(20);
//		Collections.sort(number);
//		for (Integer integer : number) {
//			System.out.println(number);
//		}
//		}
		
//	//sorting array
//	int[] number = {1,2,3};
//	Arrays.sort(number);
//	for (int i : number) {
//		System.out.println(number);
//	}
//	
	
//uppercase letter	
List<String> Uppercase = Arrays.asList("jio","ui","kion","going");
List<String >out = Uppercase.stream().map(String :: toUpperCase).collect(Collectors.toList());
System.out.println(out);

//even number
List<Integer>  evennumber = Arrays.asList(1,2,3,4,5,6,7,8,22,23,45,67,88);
List<Integer> out = evennumber.stream().filter(e -> e%2 ==0).collect(Collectors.toList());
System.out.println(out);

////findfirst
List<String> list = Arrays.asList("jio","ui","kion","going");
Optional<String> result = list.stream().filter("jio"::equals).findFirst();
System.out.println(result);
	
//		//sum of nos
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream().mapToInt(Integer :: intValue).sum();
		System.out.println(sum);
	
		
		// Sort the list of integers
List<Integer> numbers = Arrays.asList(5, 1, 3, 7, 2);	
List<Integer> sortedList = numbers.stream()
.sorted()
.collect(Collectors.toList());

		
	//Group the strings by their first letter
List<String> list = Arrays.asList("santosh","sam","manikanta","kion","jion");
Map<Character, List<String>> out = list.stream().collect(Collectors.groupingBy(s-> s.charAt(0)));
System.out.println(out);


    }
}
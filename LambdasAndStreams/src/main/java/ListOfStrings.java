import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class ListOfStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n:");
		int n = sc.nextInt();
		List<String> list1 = new ArrayList<String>();
		System.out.println("Enter n number of strings:");
		sc.nextLine();
		for(int i = 0;i < n;i++){
			String s = sc.nextLine();
			list1.add(s);
		}
		System.out.println("The strings that are starting with letter 'a' with length 3 are ");
		List<String> res = resultStrings(list1);
		res.forEach(t->System.out.println(t));
	}
	public static List<String> resultStrings(List<String> stringList) {
		List<String> stringList1 = stringList.stream().filter(s -> s.length() == 3 && s.startsWith("a")).collect(Collectors.toList());
		return stringList1;
	}	
}

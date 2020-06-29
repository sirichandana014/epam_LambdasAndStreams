import java.util.*;
import java.util.stream.Collectors;

public class AllPalindromes {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		System.out.println("Enter Strings:");
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			String s = sc.nextLine();
			list.add(s);
		}
		String s1 = "";
		System.out.println("The Palindromatic Strings are:");
		ArrayList<String> res = ispalindrome(list);
		for(int i = 0;i < res.size();i++){
			System.out.println(res.get(i));
		}
	}
	private static ArrayList<String> ispalindrome(ArrayList<String> s) {
		ArrayList<String> result= (ArrayList<String>) s.stream().filter(i->i.equals(reverseString(i))).collect(Collectors.toList());

		return result; 
	}
	public static String reverseString(String s){
		String s1 = "";
		char ch[] = s.toCharArray();
		int n = s.length(), j = n -1;
		for(int i = 0;i < n/2;i++){
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			j--;
		}
		s1 = String.valueOf(ch);
		return s1;
	}
}
 
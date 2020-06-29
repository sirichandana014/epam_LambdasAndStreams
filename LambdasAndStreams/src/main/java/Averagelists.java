import java.util.*;
public class Averagelists {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements:");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter numbers of the list:");
		sc.nextLine();
		for(int i = 0;i < n;i++){ 
			int s = sc.nextInt();
			list.add(s);
		}
		
		int sum = list.stream().mapToInt(i -> i.intValue()).sum();
		double avg=0;
		if(list.size() > 0) {
			 avg = sum / list.size();
		}
		System.out.println("Average of numbers in the list:"+avg);
	}
	
}

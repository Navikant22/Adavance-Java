package streamApi;
import java.util.*;
public class GreaterStringLength {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers=Arrays.asList("Amit","Ravi","Anil","Vikas","Rahul","JavaScript","Python");
		ArrayList<String> list=new ArrayList<>();
		list.addAll(numbers);
		list.stream().filter(n->n.length()>4).forEach(n->System.out.println(n+" "));
		
	}
}

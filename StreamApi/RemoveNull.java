package streamApi;
import java.util.*;
public class RemoreNullValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> numbers=Arrays.asList(null,"Java","Spring","react",null,"");
		ArrayList<String> list=new ArrayList<>();
		list.addAll(numbers);
		list.stream().filter(n->n!=null).forEach(n->System.out.println(n+" "));
	}

}

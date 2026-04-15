package streamApi;

import java.util.Arrays;
import java.util.List;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list=Arrays.asList(10,20,30);
		System.out.println(list);
		List<String>s=list.stream().map(n->n.toString()).toList();
		System.out.println(s);
	}

}

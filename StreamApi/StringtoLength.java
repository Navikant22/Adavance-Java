package streamApi;

import java.util.Arrays;
import java.util.List;

public class StringtoLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list=Arrays.asList("JAva","Stream","APi");
		System.out.println(list);
		List<Integer>l=list.stream().map(n->n.length()).toList();
		System.out.println(l);
	}

}

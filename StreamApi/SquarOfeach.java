package streamApi;

import java.util.Arrays;
import java.util.List;

public class SquareOfEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,2,3,4);
		System.out.println(list);
		List<Integer> square=list.stream().map(n->n*n).toList();
		System.out.println(square);
	}

}

package java8;

import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		for(int i:values) {
			System.out.println(i);
		}
		System.out.println();
		values.forEach(i -> System.out.println(i));
	}
}

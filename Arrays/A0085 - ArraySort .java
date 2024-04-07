import java.util.Arrays;

class Printer<T> {
	T[] arr;
	public Printer(T[] values) {
		this.arr = values;
	}
	public void printArr() {
		for (T i: this.arr) {
			System.out.print(" "+i);
		}
	}
}

public class Solution {
	public static void main(String[] args) {
		Integer[] nums = {1, 11, 7, 2};
		String[] str = {"Bca", "Acb", "Cba", "Bac","Abc", "Cab"};
		
		Printer<Integer> p = new Printer<>(nums);
		Arrays.sort(nums);
		p.printArr();
		
		Printer<String> s = new Printer<>(str);
		Arrays.sort(str);
		s.printArr();
	}
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

	class tesReverseList{
		public static void main(String [] args){
			ArrayList<Integer> a= new ArrayList<>();
			a.add(1);
			a.add(2);
			a.add(3);
			Collections.reverse(a);
			System.out.println(a.size());
		}
	}
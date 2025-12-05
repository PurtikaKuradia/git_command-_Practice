package additionalPrograms;

import java.util.LinkedHashSet;

public class PrintUniqueWordFromStringArray {

	public static void main(String[] args) {
		   String [] a = {"Guava", "Mango", "Apple", "Papaya", "Guava", "Apple"};
	        LinkedHashSet<String> set = new LinkedHashSet<String>();
	        for(int i =0; i<a.length;i++){
	                set.add(a[i]);
	            }
	        System.out.print(set);

	}

}

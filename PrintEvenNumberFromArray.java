package additionalPrograms;

public class PrintEvenNumberFromArray {

	public static void main(String[] args) {
	int [] a = {3, 5, 6, 8,9, 12, 15};
	for(int i=0; i<a.length;i++) {
		if(a[i]%2 ==0) {
			System.out.println(a[i]);
		}
	}

	}

}

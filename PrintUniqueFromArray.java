package additionalPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintUniqueFromArray {

	public static void main(String[] args) {
		int [] a = {7, 7,5, 8, 5, 3};
		LinkedHashMap<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
		for(int i =0;i<a.length;i++){
		if(hash.containsKey(a[i])){
		    hash.put(a[i], hash.get(a[i])+1);
		}else{
		    hash.put(a[i], 1);
		}}
		System.out.println(hash);
		for(Entry<Integer, Integer> map : hash.entrySet()){
		    if(map.getValue()==1){
		        System.out.print(map.getKey()+ "- "+ map.getValue() +" ");
		}
		    }

	}

}

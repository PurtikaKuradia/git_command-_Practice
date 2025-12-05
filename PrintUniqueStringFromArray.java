package additionalPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintUniqueStringFromArray {

	public static void main(String[] args) {
		String [] a = {"Banana", "Mango","Apple", "Orange", "Banana"};
		LinkedHashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
		for(int i =0;i<a.length;i++){
		if(hash.containsKey(a[i])){
		    hash.put(a[i], hash.get(a[i])+1);
		}else{
		    hash.put(a[i], 1);
		}}
		System.out.println(hash);
		for(Entry<String, Integer> map : hash.entrySet()){
		    if(map.getValue()==1){
		        System.out.print(map.getKey()+ "- "+ map.getValue() +" ");
		}
		    }

	}

}

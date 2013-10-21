import java.awt.List;
import java.util.ArrayList;

/**
 * Uses the insertion sort method to arrange a list of key value pairs from lowest to highest based on thier value
 * @author Steve
 *
 */

public class InsertionSort {
	/**
	 * takes an arraylist of keyvaluepair pairs and spits out a sorted version 
	 * @param xlist the unsorted array 
	 * @return the sorted array
	 */
	public static ArrayList<KeyValuePairs> sort(ArrayList<KeyValuePairs> xlist){
		for (int j = 1; j < xlist.size(); j++){
			int i = j;
			while(i > 0 && translate(xlist.get(j)) < translate(xlist.get(i-1))){
				i--;
			}	
			KeyValuePairs carry = xlist.get(i);//c = 4
			xlist.set(i, xlist.get(j)); // 1,5,9,1,8,3
			for (int k = 1; j > (i+k); k++){ //k=1
				KeyValuePairs xcarry = carry; //  4
				carry = xlist.get(i+k);
				xlist.set(i+k, xcarry);// 1,4,9,1,8,3
				
			}
			
		}
		return xlist;
	}
	/**
	 * takes a key Value Pair and spits out the value as an interger 
	 * @param x the key value
	 * @return the parsed value
	 */
	public static int translate(KeyValuePairs x){
		String p = x.getValue();
		int q = Integer.parseInt(p);
		return q;
	}
		
}

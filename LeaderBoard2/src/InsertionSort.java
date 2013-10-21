import java.awt.List;
import java.util.ArrayList;


public class InsertionSort {
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
	public static int translate(KeyValuePairs x){
		String p = x.getValue();
		int q = Integer.parseInt(p);
		return q;
	}
		
}

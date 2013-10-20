import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
	public static List<KeyValuePairs> sort(ArrayList<KeyValuePairs> xlist){
		for (int i = 0; i < (xlist.size() -1); i++){
			if (translate(xlist.get(i)) > translate(xlist.get(i+1))){
				KeyValuePairs x = xlist.get(i);
				 xlist.set(i, xlist.get(i+1));
				 xlist.set(i+ 1, x);
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

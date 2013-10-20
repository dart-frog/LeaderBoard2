import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;


public class BubbleSortTest {

	@Test
	public void test() {
		MyHashMap t = new MyHashMap(10);
		t.set("mike", "1869");
		t.set("jim", "1958");
		t.set("alex", "30");
		t.set("john", "20");
		ArrayList<KeyValuePairs> x = (ArrayList<KeyValuePairs>) BubbleSort.sort(t.getKeyValuePairs());
		assertEquals("verify it can sort a list", "20", x.get(0).getValue());
	}

}

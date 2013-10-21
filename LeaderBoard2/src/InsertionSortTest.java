import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class InsertionSortTest {

	@Test
	public void test() {
		MyHashMap t = new MyHashMap(10);
		t.set("mike", "1869");
		t.set("jim", "1958");
		t.set("alex", "30");
		t.set("john", "20");
		t.set("max", "10");
		t.set("Roxy", "50987");
		t.set("Steve", "190");
		ArrayList<KeyValuePairs> x = (ArrayList<KeyValuePairs>) InsertionSort.sort(t.getKeyValuePairs());
		assertEquals("verify it can sort a list", "10", x.get(0).getValue());
		assertEquals("verify it can sort high numbers", "50987", x.get(6).getValue()); 
	}

}

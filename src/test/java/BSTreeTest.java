import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		//Create tree
		BSTree t5 = new BSTree();
		assertTrue(t5.isEmpty());
		t5.insert(1);
		//Check not empty now because of 1
		assertFalse(t5.isEmpty());
		//Check retrieve 1 that exists
		assertEquals(1, t5.retrieve(1));
		//Check if the insert function return null because 2 doesn't exist
		assertNull(t5.retrieve(2));
		// Add 1-7 not in order
		
		BSTree t1 = new BSTree();
		t1.insert(2);
		t1.insert(7);
		t1.insert(5);
		t1.insert(6);
		t1.insert(3);
		t1.insert(4);
		t1.insert(1); 
		//Check the depth for each case
		assertEquals(4, t1.retrieveDepth(4)); // The leaves
		assertEquals(0, t1.retrieveDepth(2)); // The root
		assertEquals(1, t1.retrieveDepth(1)); // The node in the left
		assertEquals(2, t1.retrieveDepth(8)); //The node that doesn't exist, but it's on depth of 2
		//Check the largest
		assertEquals(7, t1.largest());
		assertNotEquals(6, t1.largest());
		assertEquals(7, t1.getSize());
		assertEquals(28, t1.sum());
		
		//Check Tree Equals
		BSTree t2 = new BSTree();
		BSTree t3 = new BSTree();
		BSTree t4 = new BSTree();
		t2.insert(2);
		t2.insert(1);
		t2.insert(3);
		t3.insert(2);
		t3.insert(3);
		t3.insert(1);
		t4.insert(1);
		t4.insert(3);
		t4.insert(2);
		assertTrue(t2.myEquals(t3));
		assertFalse(t2.myEquals(t4));
		
		//Check to list using t2, t3, t4
		int[] arrayt2 = new int[] {1,2,3};
		int[] arrayt4 = new int[] {1,2,3};
 		assertEquals(arrayt2, t2.toList());
 		assertEquals(arrayt4, t4.toList());
 		
 		
		
		
		
		
	}

}

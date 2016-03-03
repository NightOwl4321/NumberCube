package project;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class numberCubeTest {

	@Test
	public void testPartA() {
		NumberCube numberCube = new NumberCube();
		int[] testValues = { 3, 2, 5, 6, 1 };
		numberCube.setValues(testValues);
		assertArrayEquals(testValues, NumberCubeQuestion.getCubeTosses(numberCube, testValues.length));
		
	}

	 @Test
	 public void testPartB() throws Exception {
	 int[] testValues = { 1, 5, 5, 2, 2, 2, 5, 5};
	 assertEquals(3, NumberCubeQuestion.getLongestRun(testValues));
	 int[] testValues2 = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 3, 5, 5, 5};
	 assertEquals(6, NumberCubeQuestion.getLongestRun(testValues2));
	 }
	 
	 @Test
	 public void tosser() throws Exception {
		 tosses();
		 seven();
		 assertEquals(true, true);
	 }
	 

	private static int[] tosses() {
		int[] rolles = new int[5];
		for(int i = 0; i < 5; i++) {
			rolles[i] = new Random().nextInt(9);
		}
		System.out.println(Arrays.toString(rolles));
		return rolles;
	}
	
	private static int seven() {
		int mOO = 0;
		int[] array1 = tosses();
		int[] array2 = tosses();
		int[] addedArray = new int[array1.length];
		for(int i = 0; i < array1.length; i++) {
			addedArray[i] = array1[i] + array2[i];
		}
		
		return mOO;
	}

}

class NumberCube {

	int testIndex = 0;
	int[] values;

	public int toss() {
		return values[testIndex++];
	}
	
	public static int[] tosses() {
		int[] rolles = {};
		for(int i = 0; i < new Random().nextInt(10); i++) {
			rolles[i] = new Random().nextInt(9);
		}
		System.out.println(rolles);
		return rolles;
	}

	public void setValues(int[] testValues) {
		this.values = testValues;

	}

	public int[] getValues() {
		return values;
	}
	
}

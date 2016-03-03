package project;

public class NumberCubeQuestion {
	public static void main(String[] args) {
		
	}

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		int[] values = new int[length];
		for (int i = 0; i < length; i++) {
			values[i] = numberCube.toss();
		}
		return values;
	}

	public static int getLongestRun(int[] testValues) {
		int longestIndex = -1;
		int longestLength = 1;
		int currentLength = 1;
		int currentNum = testValues[0];
		for (int i = 0; i < testValues.length; i++) {
			if (currentNum == testValues[i]) {
				currentLength++;
				if (currentLength > longestLength) {
					longestLength = currentLength;
					longestIndex = i-currentLength+1;
					
				}
			} else {
				currentLength = 1;
			}
			currentNum = testValues[i];
		}
		return longestIndex;
	}

}

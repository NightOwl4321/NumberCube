package project;


public class NumberCubeQuestion {
	public static void main(String[] args) {
	}

	public static int[] getCubeTosses(NumberCube numberCube, int length) {
		int[] values = new int[length];
		for(int i = 0; i < length; i++) {
			values[i] = numberCube.toss();
		}
		return values;
	}

}

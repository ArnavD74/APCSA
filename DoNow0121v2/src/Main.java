import java.util.Arrays;

public class Main {
	private static int[] samples = { 40, 2532, 17, -2300, -17, -4000, 2000, 1048, -420, 33, 15, -32, 2030, 3223 };
	private static int[] samplesZero = { 0, 0, 0, 0, -14, 0, -35, -39, 0, -7, 16, 32, 37, 29, 0, 0 };

	public static int limitAmplitude(int limit) {

		int counter = 0;
		for (int i = 0; i < samples.length; i++) {

			int sample = samples[i];

			if (sample < -limit) {
				sample = -limit;
				counter++;
			}

			if (sample > limit) {
				sample = limit;
				counter++;
			}

		}

		return counter;

	}

	public static void trimSilenceFromBeginning() {
		
		int i = 0;

		while (samplesZero[i] == 0) { //increment i until samplesZero[i] is no longer zero
			i++;
		}

		int[] newSamples = new int[samplesZero.length - i];

		for (int j = 0; j < newSamples.length; j++) {
			newSamples[j] = samplesZero[j + i];
		}

		samplesZero = newSamples;
	}

	public static void main(String[] args) {

		System.out.println("The original array is: " + Arrays.toString(samples));
		 System.out.println("limitAmplitude(2000) should return 5 " + "and returned "
		 + limitAmplitude(2000));
		System.out.println("The changed array is: " + Arrays.toString(samples));
		System.out.println();
		System.out.println("The original array is " + Arrays.toString(samplesZero));
		trimSilenceFromBeginning();
		// System.out.println("The new array of samples is " +
		// Arrays.toString(samplesZero));
		System.out.println("The changed array is: " + Arrays.toString(samplesZero));

	}
}
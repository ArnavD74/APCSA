
public class Main {
	
	private double[] array;
	private int values = 0;
	private double sum = 0;

	public Main(int full) {
		
		array = new double[full];

	}

	public void add(double value) {
		
		if (values < array.length) {
			
			array[values] = value;
			values++;
			
		}
		
	}

	public double getSum() {
		
		for (int i = 0; i < array.length; i++) {
			
			sum += array[i];
		}
		
		return sum;
	}

	public double getAverage() {
		
		double avg = sum / values;
		return avg;
		
	}

	public double max() {
		
		double max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max)
				max = array[i];
			
		}
		
		return max;
	}

	public double min() {
		
		double min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] < min)
				
				min = array[i];
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		Main data = new Main(5);
		data.add(1.0);
		data.add(3.5);
		data.add(11.7);
		data.add(-5.5);
		
		System.out.println("Average: " + data.getAverage());
		System.out.println("Sum: " + data.getSum());
		System.out.println("Minimum: " + data.min());
		System.out.println("Maximum: " + data.max());

	}

}

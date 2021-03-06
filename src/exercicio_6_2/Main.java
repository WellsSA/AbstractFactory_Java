package exercicio_6_2;

public class Main {

	public static void main(String[] args) {
		int[] v = { 1, 2, 34, 5, 5, 656, 7, 67, 6, 78, 87, 8, 490, 303, 4942, 34, 4, 5, 5, 46 };

		SortMethod method;
		long startTime = System.nanoTime();
		
		/********************* BubbleSort **************************/
		startTime = System.nanoTime();
		
		method = new BubbleSort();		
		System.out.println("BubbleSort: " + print(method.sort(v)));
		
		System.out.println("Time: " + (System.nanoTime() - startTime));
		/************************************************************/
		
		/********************* InsertionSort **************************/
		startTime = System.nanoTime();
		
		method = new InsertionSort();
		System.out.println("InsertionSort: " + print(method.sort(v)));
		
		System.out.println("Time: " + (System.nanoTime() - startTime));
		/************************************************************/
		
		/********************* SelectionSort **************************/
		startTime = System.nanoTime();
		
		method = new SelectionSort();
		System.out.println("SelectionSort: " + print(method.sort(v)));
		
		System.out.println("Time: " + (System.nanoTime() - startTime));
		/************************************************************/
		
		/********************* QuickSort **************************/
		startTime = System.nanoTime();
		
		method = new QuickSort();
		System.out.println("QuickSort: " + print(method.sort(v)));
		
		System.out.println("Time: " + (System.nanoTime() - startTime));
		/************************************************************/
		
		
		
	
		
		
		
		
	}

	public static String print(int[] v) {
		String s = "{";
		for(int i: v) s += i + ",";
		s+="}";
		
		return s;
	}
}

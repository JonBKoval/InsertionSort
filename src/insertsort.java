import java.util.Random;

public class insertsort {
	private static int[] array = new int[10];
	
	public static void main(String[] args) {
		initArray(array);
		System.out.println("Unsorted array: ");
		print(array);
		sort(array);
		System.out.println("Sorted array: ");
		print(array);
	}
	
	public static void print(int[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d", array[i]);
			if(i == array.length - 1){
				System.out.printf("\n");
			}
			else{
				System.out.printf(", ");
			}
		}
	}
	
	public static void initArray(int[] array){
		Random rand = new Random();
		
		for(int i = 0; i < array.length; i++){
			array[i] = rand.nextInt((10));
		}
	}
	
	public static void sort(int[] array){
		int temp;
		for(int i = 1; i < array.length; i++){
			for(int j = i; j > 0; j--){
				if(array[j] < array[j-1]){
					temp = array[j-1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
		}
	}
}



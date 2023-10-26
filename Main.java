import java.util.Arrays;
import java.util.Random;

public class Main {
public static void main(String[] args) {

int[] numbers = new int[10];
Random random = new Random();
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = random.nextInt(10000);
}
System.out.println("before:");
printarray(numbers);

for (int i = 0; i < numbers.length - 1; i++) {
    if (numbers[i] > numbers[i + 1 ]) {
        int temp = numbers[i];
        numbers[i] = numbers[i + 1];
        numbers[i + 1] = temp;
    }
}

System.out.println("\nAfter:");
printarray(numbers);

    System.out.println(Arrays.toString(numbers));
    selectionSort(numbers);
    System.out.println(Arrays.toString(numbers));

}
private static void printarray(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
}

   private static void selectionSort(int[] numbers) {
    int length = numbers.length;

    for (int i = 0; i < length - 1; i++){
     int min = numbers[i];
     int indexOfMin = i;
     for (int j = i + 1; j < length; j++)
         if (numbers[j] < min) {
             min = numbers[j];
             indexOfMin = j;
         }
        swap(numbers, i, indexOfMin);
        }

    }

    private static void swap(int[] numbers, int a, int b) {
    int temp = numbers[a];
    numbers[a] = numbers[b];
    numbers[b] = temp;
    }
}

import java.util.HashSet;
import java.util.Random;

public class DSA01 {
    public static int[] generateRandomArray(int size, int max) {
        int[] array = new int[size];
        Random a = new Random();
        for(int i  = 0; i<array.length; i++) {
            array[i] = a.nextInt(max + 1);
        }
        return array;
    }


    public static void main(String[] args) {
        int[] A = generateRandomArray(100000, 2000);
//a
        HashSet<Integer> setB = new HashSet<Integer>();
        for(int num : A) {
            setB.add(num);
        }
        int[] B = new int[setB.size()];
        int index =0;
        for (int num : setB) {
            B[index++] = num;
        }
//b
        int[] count = new int[2001];
        for(int num : A) {
            count[num]++;
        }
        int maxFrequency = 0;
        int mostFrequentNumber = 0;
        for(int i = 0; i<= 2000; i++) {
            if (count[i] > maxFrequency) {
                maxFrequency = count[i];
                mostFrequentNumber = i;
            }
        }

//  c
        int[] C = generateRandomArray(10000, 3000);
        for (int num : C) {
            if (num >= 0 && num <= 2000 && count[num] > 0) {
                System.out.println("Number " + num + " appears in array A.");
            }
        }

        System.out.println("Dãy B chứa các số không trùng lặp từ dãy A: ");
        for (int num : B) {
            System.out.print(num + " ");
        }
        System.out.println("\nSố xuất hiện nhiều nhất trong dãy A: " + mostFrequentNumber + " (xuất hiện " + maxFrequency + " lần)");
    }


}

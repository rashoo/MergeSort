import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random randomNums = new Random();

        int[] array = new int[9];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNums.nextInt();
        }

        //System.out.print("Random numbers are: ");
        for(int i=0; i< array.length; i++){
            System.out.print( array[i]+ " ");

        }
        System.out.println("");
        System.out.print("Sorted numbers are: ");
        for (int lastIndex = array.length - 1; lastIndex > 0; lastIndex--) {
            int startingIndex = 0;

            for (int nextIndex = 1; nextIndex <= lastIndex; nextIndex++) {
                if (array[nextIndex] > array[startingIndex]) {
                    System.out.println(startingIndex);
                    startingIndex = nextIndex;
                }
            }
            swap(array, startingIndex, lastIndex);
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static void swap(int[] array, int startingIndex, int nextIndex){
        if(startingIndex == nextIndex){
            return;
        }
        int temp = array[startingIndex];
        array[startingIndex]= array[nextIndex];
        array[nextIndex] = temp;
    }
}
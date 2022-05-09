package course.arrays;

public class SelectionSortOfArrays {
    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            int largestIndexPosition = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++){
                if (intArray[i] > intArray[largestIndexPosition]){
                    largestIndexPosition = i;
                }
            }
            swap(intArray, largestIndexPosition, lastUnsortedIndex);
        }

        //print sorted array
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i] );
        }
    }


    //create a swap method to swap elements
    public static void swap(int[] array, int i, int j){
//        check if elements i and j to swap are the same => do nothing
        if(i == j){
            return;
        }
//       but if i and j are not equal, perform swap
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}

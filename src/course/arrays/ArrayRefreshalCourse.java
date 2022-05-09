package course.arrays;

public class ArrayRefreshalCourse {
    public static void main(String[] args) {
        int[] intArray = new int[7];
        //add values into intArrays

        intArray[0] = 20;
        intArray[1] = 124;
        intArray[2] = 98;
        intArray[3] = 9;
        intArray[4] = 55;
        intArray[5] = 9;
        intArray[6] = 9;
        /*
        //to print out all arrays
        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        */

        int index = -1;
        for (int i = 0; i < intArray.length; i++){
            if(intArray[i] == 9){
                index = i;
                break;
            }
        }
        System.out.println("index of 9 = " + index);

    }
}

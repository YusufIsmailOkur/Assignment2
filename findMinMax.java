public static void findMinimum(int[] array){
    int minimum = 100;
    for (int i = 0; i < array.length; i++){
        if(array[i] < minimum){
            minimum = array[i];
        }
    }
    System.out.println("The array's minimum is: " + minimum);
}
public static void findMaximum(int[] array){
    int maximum = 0;
    for (int i = 0; i < array.length; i++){
        if(array[i] > maximum){
            maximum = array[i];
        }
    }
    System.out.println("The array's maximum is: " + maximum);
    }

public class BubbleSortALU {
    public static void bubbleSort(int[]arr,int n ){
        int i, j, temp;
        boolean swapped;
        for ( i = 0; i < n - 1; i++){
            swapped = false;
            for (j = 0; j < n -1; j++){
                if (arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr [j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
        }
    }

    public static void printResult(int[] array){
        System.out.println("mang sau khi da sap xep theo thuat toan bubble sort");
        for (int i = 0 ; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}

public class insertionSort {
    public static void insertionSort(int [] arrNumber){
        int count = arrNumber.length;
        for (int i = 0; i < count; i++){
            int key = arrNumber[i];
            int j = i - 1;
            while (j >= 0  && arrNumber[j]> key){
                arrNumber[j+1] = arrNumber[j];
                j--;
            }
            arrNumber[j+1] = key;
        }
    }
    public static void printResult(int[] arr){
        System.out.println("mang sau khi dc sap xep");
        for (int i = 0; i < arr.length; i ++){
            System.out.println(arr[i]);
        }
    }
}

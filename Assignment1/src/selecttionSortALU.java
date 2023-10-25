public class selecttionSortALU {
    public  static void selectionSort(int[]arr){
        int count = arr.length;
        for (int i = 0; i < arr.length; i++){
            int minIdx = i;
            for (int j = i + 1; j <count; j++){
                if (arr[j]< arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public  static void printResult(int[]arr){
        System.out.println("sau khi dc sap xep voi thuat toan selection sort");
        for (int i : arr){
            System.out.println(i);
        }
    }
}

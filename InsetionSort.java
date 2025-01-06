class InsetionSort {

    static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length-1; i++){
            int currElement = arr[i];
            int prevIdx = i - 1;
            //sorting elements in sortedPart of array from unsortedPart of array
            while (prevIdx >= 0 && arr[prevIdx] > currElement) {
                arr[prevIdx+1] = arr[prevIdx];
                prevIdx--;
            }
            //placing element in right position of sortedPart of array 
            arr[prevIdx+1] = currElement;
        }
    }

    public static void main(String[] args) {
        int[] arr = {45,50,5,1,20};
        System.out.println("Array before Insertion sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("Array after Insertion sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

class CountSort {

    public static void countSort(int arr[]){
        //finding largest element of the array
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        //creating count array of size {largest element + 1} for frequency maintaining
        int count[] = new int[largest+1];
        
        //maintaining frequency in count arrays of elements of original array
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        //sorting the original array
        int j = 0;
        for(int i = 0; i < count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,3,1,4,2,7,3};
        System.out.println("Array before Count sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        countSort(arr);
        System.out.println("Array after Count sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

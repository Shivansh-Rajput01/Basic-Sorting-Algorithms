class SelectionSort {

    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            int minPos = i;
            boolean swaps = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minPos]){
                    minPos = j;
                }
            }

            //swapping minimum element to starting index of array
            if(minPos != i){
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
                swaps = true;
            }

            //checking if no swaps happens in 1st pass
            if(!swaps){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,2,1};
        System.out.println("Array before sorting : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        selectionSort(arr);
        System.out.println("Array aftr sorting : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

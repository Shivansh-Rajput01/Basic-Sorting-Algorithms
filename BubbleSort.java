class BubbleSort {

    static void bubbleSort(int[] arr){
        boolean swaps = false;
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                //swapping elements if next element is greater the previous element
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps = true;
                }
            }

            //checking if no swaps happens in 1st pass
            if(!swaps){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {45,50,5,1,20};
        System.out.println("Array before bubble sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Array after bubble sort : ");
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
}

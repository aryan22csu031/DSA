import java.util.Arrays;

class qs{
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        QuickSort(arr1,0,arr1.length-1);
        System.out.print(Arrays.toString(arr1));
    }
    static void QuickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int s = low;
        int e = high;
        int mid = s + ((e-s)/2);
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        QuickSort(arr,low,e);
        QuickSort(arr,s,high);


    }
}

public class ReverseArray{
    public ReverseArray(){

    }
    public void reverse(int[] arr, int start, int end){
        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for(int k : arr){
            System.out.print(k + " ");
        }
    }
}

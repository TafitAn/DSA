

public class ResizeArray {
    public ResizeArray() {
    }
    public int[] resizeArray(int[] arr, int arrSize){
        int[] temp = new int[arrSize];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public void demoArray(int[] arr){
        for (int k : arr) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
    }
}

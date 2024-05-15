public class ArrayUtil {

    public ArrayUtil(int nsize) {
        this.nsize = nsize;
    }

    private int nsize;
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public void arrayDemo(){
        int[] myArray = new int[nsize];
    }

    public void removeEven() {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int m = 0;

        // Count the number of odd elements in myArray
        for (int k = 0; k < myArray.length; k++) {
            if (myArray[k] % 2 != 0) {
                m++;
            }
        }

        // Create a new array to store the odd elements
        int[] oddArray = new int[m];
        int j = 0;

        // Populate oddArray with odd elements from myArray
        for (int k = 0; k < myArray.length; k++) {
            if (myArray[k] % 2 != 0) {
                oddArray[j] = myArray[k];
                j++;
            }
        }

        // Print oddArray
        for (int l : oddArray) {
            System.out.print(l + " ");
        }
    }

}

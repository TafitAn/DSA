public class ArrayUtil {

    public int getNsize() {
        return nsize;
    }

    public void setNsize(int nsize) {
        this.nsize = nsize;
    }

    public ArrayUtil(int nsize) {
        this.nsize = nsize;
    }

    private int nsize;



    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public void arrayDemo(){
        int[] myArray = new int[nsize];
        printArray(myArray);
    }
}

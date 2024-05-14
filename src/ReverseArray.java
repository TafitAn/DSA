public class ReverseArray {
    public ReverseArray() {
    }
    int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int tempt;
    int start = 0, end = 9;
    public void reverse(){
        while(start < end) {
            tempt = myArray[start];
            myArray[start] = myArray[end];
            myArray[end] = tempt;
            start++;
            end --;
        }
        for(int k : myArray){
            System.out.println("Reverse : " + k);
        }
    }
}

public class Move0AtEnd {
    public Move0AtEnd() {
    }
    public void moveZeroEnd(int[] arr){
        int temp;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                zeroCount++;
            }
        }
        for(int j = 0; j < zeroCount; j++) {
            for (int i = 0; i < (arr.length - 1); i++) {
                if (arr[i] == 0) {
                    temp = arr[i + 1];
                    arr[i + 1] = 0;
                    arr[i] = temp;
                    for (int k : arr) {
                        System.out.print(k + " ");
                    }
                    System.out.println("");
                }
            }
        }
    }
}

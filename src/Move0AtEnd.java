public class Move0AtEnd {
    public Move0AtEnd() {
    }
    public void moveZeroEnd(int[] arr){
        int temp;
        int zeroCount = 0;
        for (int value : arr) {
            if (value == 0) {
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
                    System.out.print("\n");
                }
            }
        }
    }

    public void moveZeroEnd2(int[] arr){
        int j = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
            for(int k : arr){
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}

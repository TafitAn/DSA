public class Find2ndMaxValue {
    public Find2ndMaxValue(){}

    public int find2ndMaxVal(int[] arr){
        int maxVal = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        int max2Val = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < maxVal && arr[i] > max2Val){
                max2Val = arr[i];
            }
        }
        return max2Val;
    }

    public int find2ndMaxVal2(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }
        return max2;
    }
}

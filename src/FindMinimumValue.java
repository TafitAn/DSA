public class FindMinimumValue{ 
    public FindMinimumValue (){}
    
    public int findMinVal(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
        return min;
    }
}

public class TimeComplexityDemo {
    /*public int findSum(int n){
        return n * (n+1) / 2;
    }*/
    public int findSum(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        return sum;
    }
}

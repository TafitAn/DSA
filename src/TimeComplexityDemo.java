public class TimeComplexityDemo {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println(demo.findSum(9999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " Millisecs");

    }
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

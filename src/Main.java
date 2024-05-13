//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        System.out.println(demo.findSum(9999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + " Millisecs");

        ArrayUtil arrayUtil = new ArrayUtil(7);
        arrayUtil.arrayDemo();

    }
}
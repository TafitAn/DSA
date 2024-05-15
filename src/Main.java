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
        arrayUtil.removeEven();
        ReverseArray reverseArray = new ReverseArray();
        int[] myArray = {1, 2, 3, 4, 5, 6, 7};
        reverseArray.reverse(myArray, 0, 6);
        FindMinimumValue f = new FindMinimumValue();
        int[] myArray1 = {45, 122, 69, 78, 266, 9874, 58, 23, 45 ,16, 1548};
        System.out.println("La valeur minimum du tableau est: " + f.findMinVal(myArray1));
        Find2ndMaxValue find2ndMaxValue = new Find2ndMaxValue();
        System.out.println("La valeur de la 2nde maximale est: " + find2ndMaxValue.find2ndMaxVal(myArray1));
        System.out.println("La valeur de la 2nde maximale est: " + find2ndMaxValue.find2ndMaxVal2(myArray1));
        Move0AtEnd move0AtEnd = new Move0AtEnd();
        int[] myArray3 = {45, 0, 122, 0, 69, 0, 78, 266, 9874, 58, 23, 45 ,16, 1548};
        System.out.println("Basculer 0 vers la dernière index: " );
        move0AtEnd.moveZeroEnd(myArray3);
        move0AtEnd.moveZeroEnd2(myArray3);
    }
}

/*
  Given an array of n-A distinct numbers in the range of 1 to n: find the missing number in it

  Based on the mathematical approach :
  The sum of first n natural numbers = 1+2+3+4+...+n = (n*(n+1))/2
*/

public class FindMissingNumber{
  public FindMissingNumber(){
    
  }
  public void findMissing(int[] arr){
    int n = arr.length + 1;
    int somme = ( n * ( n + 1 )) /2;
    int m = somme - arr[0];
    for(int i = 1; i < arr.length; i ++){
      m = m - arr [i];
    }
    System.out.println("the missing number is " + m);
  }
}

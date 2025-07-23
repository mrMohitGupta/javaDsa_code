import java.util.*;
// rescursion is a method of solving a computional problem whare the solution 
// to smaller instances of the same problem

public class Recursion {
    // print decreasing number

    public static void printDec(int n ){
        if(n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
    }

    // for incresing num

    public static void printInc(int n ){
        if(n == 1){
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+ " ");
    }

    // print factorial

    public static int fact(int n){
        if(n == 0){
            return 1;
        }
        
        int fnm1 = fact(n-1);
        int fn = n* fact(n-1);
        return fn;
    }
    // sum of n natural number

    public static int  calSum(int n){

        if(n == 1){
            return 1;
        }

        int Snm1 =  calSum(n-1);
        int Sn = n + Snm1 ;
        return Sn;
    }
    // print fibonacci number;
    public static int fib(int n){
        if(n == 0 || n== 1){
            return n;
        }
        
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    // check if our arry is sort or not
    public static boolean isSorted(int arr[] , int i){
        if(i == arr.length-1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    // first occurance of Key
    public static int firstOccanance(int arr[], int key, int i){
        if(i == arr.length) {
            return -1;
        }
        if(arr[i] == key) {
            return i;
        }
        return firstOccanance(arr, key, i+1);

    }
    
    public static void main(String args[]){
        int n = 25;
        int arr[] = {1, 2, 3, 4, 5, 6};
        // printDec(n);
        // printInc(n);
        System.out.println(  firstOccanance(arr, 5, 0));
    }
}

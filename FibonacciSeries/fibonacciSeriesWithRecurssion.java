/*Using Recurssion */
/*The Fibonacci sequence is a sequence in which each number is the sum of the two preceding ones */

package JavaPrograms.FibonacciSeries;

/**
 * fibonacciSeriesWithRecurssion
 */
public class fibonacciSeriesWithRecurssion {

    static int n1=0, n2=1, n3=0; //n1 and n2 are initialized with first two numbers in the sequence(0 and 1)

    static void printFib(int count){
        if(count>0){ // if count is greater than 0, the function calculates the next Fibonacci number(n3) as the sum of n1 and n2
            n3=n1+n2;
            n1=n2; // then it shifts the values of n1 and n2 to prepare for the next iteration.
            n2=n3;
            System.out.println(""+n3);
            printFib(count-1); // the function calls itself with count-1 until the base case is reached(count == 0)
        }
    }
    public static void main(String[] args) {
        int count=10;
        System.out.println(n1+""+n2);
        printFib(count-2); // count-2 is used because the first two Fibonacci numbers are manually printed before the recursive function is called.The function then handles printing the remaining numbers in the series
    }
}
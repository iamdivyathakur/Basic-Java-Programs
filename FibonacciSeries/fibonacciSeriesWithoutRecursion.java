/*Fibonacci Series Without Recurssion */
/*Fibonacci Series , next number is the sum of previous two numbers; for example 0,1,1,2,3,5,8,13,21,34 etc */
package JavaPrograms.FibonacciSeries;

/**
 * fibonacciSeries
 */
public class fibonacciSeriesWithoutRecursion {

    public static void main(String[] args) {
        int n1=0, n2=1, n3, i, count=10;
        System.out.println(n1+""+n2);  // printing 0 and 1
        for(i=2;i<count;i++){ // loop starts from 2 because 0 and 1 are already printed
            n3=n1+n2; // each iteration, next term is calculated as the sume of first and second term
            System.out.println(""+n3); // the series is printed by updating first term and second term in each iteration
            n1=n2;
            n2=n3;

        }
    }
}
/*Using Recurssion */

package JavaPrograms.FibonacciSeries;

/**
 * fibonacciSeriesWithRecurssion
 */
public class fibonacciSeriesWithRecurssion {

    static int n1=0, n2=1, n3=0;

    static void printFib(int count){
        if(count>0){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(""+n3);
            printFib(count-1);
        }
    }
    public static void main(String[] args) {
        int count=10;
        System.out.println(n1+""+n2);
        printFib(count-2);
    }
}

package Q1;

import java.util.Scanner;
//find the sum of all odd number from 1 to n, where n is a positive integer.
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i%2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
        
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        
        System.out.println(Math.pow(n,2));
        System.out.println(Math.pow((n+1)/2,2));
    }
    
}

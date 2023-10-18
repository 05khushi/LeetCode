import java.util.Scanner;
class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n % 2 == 0)
            n /= 2;
        return (n == 1);
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
}

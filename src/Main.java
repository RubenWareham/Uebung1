import java.util.Scanner;

public class Main {
    public static int getNextPrime(int num) {
        int nextPrime = 0;
        while (true) {
            num++;
            boolean x = isPrime(num);
            if (x) {
                nextPrime = num;
                break;
            }
        }
        return nextPrime;
    }
    public static boolean isPrime(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       int []primeArray;
       primeArray = new int[100];

        System.out.println("Enter a number: ");

        Scanner sc = new Scanner(System.in); // cin auf wish
        int num = sc.nextInt();

        int primeNr = 2;

        int i = 0;
        while (!isPrime(num)){

            if (num % primeNr==0){
                num /= primeNr;
                primeArray[i++] = primeNr;
            }else{
                primeNr = getNextPrime(primeNr);
            }
        }

        for (int j = 0; j < i; j++) {
            System.out.print(" "+primeArray[j]);
        }
        System.out.print(" "+num);
    }
}
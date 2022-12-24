//Two integers are coprime if the only positive integer that divides into both of them is 1.
// In other words, the greatest common divisor of two coprime numbers is 1.
//Write a Java program that uses a Monte Carlo simulation
// to determine the probability that two randomly selected numbers will be coprime with each other.
// Include comments that explain your code clearly.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int coPrimeCount = 0;
        int nonCoPrimeCount = 0;
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int num1 = r.nextInt(100);
            int num2 = r.nextInt(100);
//            System.out.println(num1+" "+num2);
            boolean isCoPrime = eculidMethod(num1,num2);
            if(isCoPrime==true) {
                coPrimeCount++;
            }
            else{
                nonCoPrimeCount++;
            }
        }
        System.out.println("Probability for CoPrime =>"+ ((double)coPrimeCount/100));
        System.out.println("Probability for Non- CoPrime =>"+ ((double)nonCoPrimeCount/100));
    }

    public static boolean eculidMethod(int num1, int num2){
        int p = num1*num2;
        int check = 0;
        for(int i =1; i < p;i++){
            if(num1%i==0 && num2%i==0){
                check++;
            }
        }
        if(check==1){
            return true;
        }
        else{
            return false;
        }
    }

}

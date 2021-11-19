package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        while(n<10){
          System.out.println("Enter a number bigger than 9.");
          num = input.nextInt();
        }
        String pali = Integer.toString(num);
        int[] arr = new int(pali.length());
        for(int i=0; i< pali.length(); i++){
          arr[i] = pali.charAt(i) - '0';
        }
        boolean flag = true;
        for(int i=0; i< pali.length(); i++){
          if(arr[i]!=arr[pali.length()-i-1]){
            flag = false;
          }
        }
        System.out.println("Palindrome: " + flag);
        
    }
}

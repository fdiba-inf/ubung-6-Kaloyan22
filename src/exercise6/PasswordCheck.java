package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean val = true;
        String pass = input.nextLine();
        do{
          if(pass.length()<8){
            val = false;
          }
          for(int i=0;i<pass.length();i++){
              if(!Character.isLetterOrDigit(pass.charAt(i))){
                val = false;
              }
          }
          int count = 0;
          for(int i=0;i<pass.length();i++){
            if(Character.isDigit(pass.charAt(i))){
              count++;
            }
          }
          if(count<2){
            val = false;
          }
        }while(val==false);
      if(val=true){
        System.out.println("Password valid!");
      }

    }
}

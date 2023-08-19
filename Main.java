import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      //writing a user login with while loop
      
      Scanner scan= new Scanner(System.in);
      
      int loginTry=3;
      
      String userName="berru";
      String userPass="1234";
      
      System.out.println("****");
      System.out.println("welcome to login");

      
      
      while(loginTry>0){
          System.out.println("enter user name");
          String name= scan.nextLine();
          System.out.println("enter user password");
          String password= scan.nextLine();
          
          if(name.equals(userName) && password.equals(userPass)){
              break;
          }
          else if(name.equals(userName) && !password.equals(userPass)){
              System.out.println("your password is incorrect, try again");
              loginTry--;
          }
          else if(!name.equals(userName) && password.equals(userPass)){
              System.out.println("your user name is incorrect, try again");
              loginTry--;
          }
          else{
              System.out.println("your user name and password are incorrect, try again");
              loginTry--;
          }
          
          if(loginTry==0){
              System.out.println("you ran out of trys, come later");
          }
          }
      }

      
      
          }

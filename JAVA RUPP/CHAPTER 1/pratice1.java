import java.util.Scanner;
public class pratice1{
  public static void main(String[] args){
    // make object Scanner 
    Scanner Input= new Scanner(System.in);
    // input and decalre variable
    
    System.out.printf("please Enter Your name :");
    String Name= Input.nextLine();
    // output 
    System.out.println("Your Name is = "+Name);
    // close Scanner
    Input.close();

  }
}
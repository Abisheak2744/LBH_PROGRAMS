import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int N;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number:");
    N = sc.nextInt();

    if(N > 0){
      System.out.println("It is Positive");
    }
    else if(N < 0){
      System.out.println("It is Negative");
    }
    else{
      System.out.println("Number is Zero");
    }
    }
    }

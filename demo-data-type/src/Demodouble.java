public class Demodouble {
  public static void main (String[] args) {
  //X=9.9

  // Store 99.9 into variable price
  // Store 3 into variable quantity
  // calculate checkout amount
  double price =99.9;
  int quantity = 3;
  double amount = price * quantity;
  System.out.println(amount); // 299.7;


  //10 -> Int Value
  // 3 -> Int Value
  //1. 10 /3 -> 3 int / int -> int(10 / 
  double w = 10 / 3;
  System.out.println(w); // 3.0;

  int score1 = 71;
  int score2 = 82;
  double average = (score1 + score2) / 2;
  System.out.println(average); // 76.5;
  //! understand why 76.0? but not 67.5

    //divided by zero = system error
    double r3 = 10 / 0;
    System.out.println(r3); // 0.0  
 

  }






}
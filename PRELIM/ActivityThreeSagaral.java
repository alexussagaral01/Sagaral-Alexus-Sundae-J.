import java.util.Scanner;

public class ActivityThreeSagaral {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      double phpToDollarConversionRate = 56.00;
   
   
      double C1price = 100.00;
      double C2Price = 150.00;
      double C3Price = 200.00;
      double R1Price = 35.00;
      double R2Price = 50.00;
   
   
      System.out.println("Menu:");
      System.out.println("C1 = Php 100.00");
      System.out.println("C2 = Php 150.00");
      System.out.println("C3 = Php 200.00");
      System.out.println("Add-ons:");
      System.out.println("R1 = Php 35.00");
      System.out.println("R2 = Php 50.00");
   
    
      System.out.print("Enter the Order Code (C1,C2,C3,R1,R2): ");
      String orderCode = scanner.nextLine();
      System.out.print("Enter the Quantity: ");
      int quantity = scanner.nextInt();
   
   
      double totalPrice = 0.0;
      switch (orderCode) {
         case "C1":
            totalPrice = C1price * quantity;
            break;
         case "C2":
            totalPrice = C2Price * quantity;
            break;
         case "C3":
            totalPrice = C3Price * quantity;
            break;
         case "R1":
            totalPrice = R1Price * quantity;
            break;
         case "R2":
            totalPrice = R2Price * quantity;
            break;
         default:
            System.out.println("Invalid order code.");
            return;
      }
   
     
      double totalPriceInDollars = totalPrice / phpToDollarConversionRate;
   
      
      System.out.println("Total Price (PHP): Php " + String.format("%.2f", totalPrice));
      System.out.println("Total Price (USD): $" + String.format("%.2f", totalPriceInDollars));
      System.out.println("Quantity: " + quantity);
      System.out.println("Order Code: " + orderCode);
   
      scanner.close();
   }
}
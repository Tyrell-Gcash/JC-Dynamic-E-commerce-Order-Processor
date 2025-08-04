package org.example;

import java.util.*;

public class InteractiveOrderProcessor {
    public static void main(String[] args) {

        System.out.println("Welcome to the Interactive Order Processor!");
        //Part 1: Interactive Order Processing Logic
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Order Details ---");

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Is customer a member (true/false)?: ");
        boolean hasMembership = scanner.nextBoolean();

        System.out.print("Enter customer tier (Regular, Silver, Gold): ");
        String customerTier = scanner.next();

        System.out.print("Enter shipping zone (ZoneA, ZoneB, ZoneC, Unknown): ");
        String shippingZone = scanner.next();

        System.out.print("Enter discount code (SAVE10, FREESHIP, or \"\" for none): ");
        String discountCode = scanner.next();

        System.out.println("--- Order Details ---");
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("is Member: " + hasMembership);
        System.out.println("Customer Tier: " + customerTier);
        System.out.println("Shipping Zone: " + shippingZone);
        System.out.println("Discount Code: " + discountCode);

        System.out.println("--- Calculation Steps ---");
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("is Member: " + hasMembership);
        System.out.println("Customer Tier: " + customerTier);
        System.out.println("Shipping Zone: " + shippingZone);
        System.out.println("Discount Code: " + discountCode);
        
//        --- Calculation Steps ---
//        Initial Subtotal: $240.00
//        After Tier Discount (Gold - 15%): $204.00
//        After Quantity Discount (5% for >=5 items): $193.80
//        After Promotional Code (SAVE10 for >$75): $183.80
//        After Small Order Surcharge (if applicable): $183.80 (No surcharge)
//
//        Shipping Cost: $12.50 (ZoneB)
//
//        Final Order Total: $196.30
//
//        --- String Equality Demo ---
//        Enter first string for comparison: Hello
//        Enter second string for comparison: hello
//
//        String 1: "Hello"
//        String 2: "hello"
//
//        String 1 == String 2: false (Compares references, which are different for user input strings)
//        String 1 .equals() String 2: false (Content is different due to case)
//        String 1 .equalsIgnoreCase() String 2: true (Content is identical, ignoring case)
    }
}
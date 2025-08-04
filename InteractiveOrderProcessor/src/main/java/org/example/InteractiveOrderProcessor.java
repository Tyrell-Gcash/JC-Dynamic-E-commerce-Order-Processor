package org.example;

import java.util.*;

public class InteractiveOrderProcessor {
    public static void main(String[] args) {

        System.out.println("Welcome to the Interactive Order Processor!");
        //Part 1: Interactive Order Processing Logic
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Enter Order Details ---");

        System.out.print("Enter unit price: ");
        float unitPrice = scanner.nextFloat();

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

        System.out.println("\n--- Order Details ---");
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("is Member: " + hasMembership);
        System.out.println("Customer Tier: " + customerTier);
        System.out.println("Shipping Zone: " + shippingZone);
        System.out.println("Discount Code: " + discountCode);


        float initialSubtotal = unitPrice * quantity;

        System.out.println("\n--- Calculation Steps ---");
        System.out.printf("Initial Subtotal: $%.2f\n", initialSubtotal);

        //Tier Discount
        if(customerTier.equalsIgnoreCase("gold")){
            initialSubtotal *= 0.85f;
            System.out.printf("After Tier Discount (Gold - 15%%): $%.2f\n", initialSubtotal);
        }
        else if (customerTier.equalsIgnoreCase("silver")) {
            initialSubtotal *= 0.90f;
            System.out.printf("After Tier Discount (Silver - 10%%): $%.2f\n", initialSubtotal);
        }
        else {
            System.out.printf("After Tier Discount (None): $%.2f\n", initialSubtotal);
        }

        //Quantity Discount
        if(quantity >= 5) {
            initialSubtotal *= 0.95f;
            System.out.printf("After Quantity Discount (5%% for >=5 items): $%.2f\n", initialSubtotal);
        }


        //Promo Code Discount
        if(discountCode.equals("SAVE10") && initialSubtotal > 75.00) {
            initialSubtotal -= 10f;
            System.out.printf("After Promotional Code (SAVE10 for >$75): $%.2f\n",initialSubtotal);
        }
        else if (discountCode.equals("FREESHIP")) {
            System.out.println("After Promotional Code (FREESHIP for Free Shipping)\n");
        }

        //Small Order Surcharge
        initialSubtotal = (initialSubtotal < 25.00) ? initialSubtotal += 3.00: initialSubtotal;

        float shippingCost;
        if(!discountCode.equals("FREESHIP")) {
            switch (shippingZone){
                case "ZoneA":
                    shippingCost = 5.0f;
                    System.out.printf("\nShipping Cost: $%.2f (ZoneA)\n", shippingCost);
                    break;
                case "ZoneB":
                    shippingCost = 12.50f;
                    System.out.printf("\nShipping Cost: $%.2f (ZoneB)\n", shippingCost);
                    break;
                case "ZoneC":
                    shippingCost= 20.0f;
                    System.out.printf("\nShipping Cost: $%.2f (ZoneC)\n", shippingCost);
                    break;
                default:
                    shippingCost = 25.0f;
                    System.out.printf("\nShipping Cost: $%.2f (Others)\n", shippingCost);
                    break;
            }
        }
        else {
            shippingCost = 0;
        }

        float finalOrderTotal = initialSubtotal + shippingCost;

        System.out.printf("\nFinal Order Total: $%.2f",finalOrderTotal);

        stringEquality();
    }

    public static void stringEquality(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- String Equality Demo ---");

        System.out.print("Enter first string for comparison: ");
        String firstString = scanner.next();

        System.out.print("Enter second string for comparison: ");
        String secondString = scanner.next();

        System.out.println("\nString 1: " + firstString);
        System.out.println("String 2: " + secondString);

        System.out.println("\n" + firstString == secondString);
        System.out.println(firstString.equals(secondString));
        System.out.println(firstString.equalsIgnoreCase(secondString));

        System.out.println("== compares mem location while .equals compares the actual content. equalsIgnoreCase is the same as .equals it's just not case sensitive.");

    }
}
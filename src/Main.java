
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter user_Id of 5 digits : ");
        int userId = sc.nextInt();
        System.out.println("Enter the 2 digit password:");
        int password = sc.nextInt();


        boolean input = true;
        while (input) {
            System.out.println("Do you want to quit? If yes, type quit.");
            String request = sc.next();

            if (request.equalsIgnoreCase("quit")) {
                input = false;
            } else {

                System.out.println("Enter the number of T_Shirts you picked : ");
                int items = sc.nextInt();

                for (int i = 0; i < items; i++) {
                    System.out.println("Enter the price of the T_Shirts you picked : ");
                    int price = sc.nextInt();
                    list.add(price);
                }

                System.out.println("Are the T_Shirts taxable?");
                String VAT = sc.next();

                double total = 0;

                for (int i = 0; i < items; i++) {
                    total = total + list.get(i);
                }

                if (VAT.equalsIgnoreCase("Yes")) {
                    total = total + total * 13 / 100;
                    System.out.println("The amount after adding vat is : Rs." + total);
                    System.out.println();

                    System.out.println("How much discount percentage do you want?");
                        int discount_p = sc.nextInt();
                        total = total - total * (discount_p) / 100;

                        System.out.print("The total payable amount after discount is : Rs." + total);
                        System.out.println();

                        System.out.println();

                        System.out.print("Enter the amount of cash you would like to pay . Rs.");
                        int cash = sc.nextInt();

                        System.out.println("Your change is :");

                        if (cash > total) {
                            cash -= total;
                            if (cash >= 1000) {
                                int num = cash / 1000;
                                cash = cash % 1000;
                                System.out.println("Rs.1000:" + num);
                            }
                            if (cash >= 500) {
                                int num = cash / 500;
                                cash = cash % 500;
                                System.out.println("Rs.500:" + num);
                            }
                            if (cash >= 100) {
                                int num = cash / 100;
                                cash = cash % 100;
                                System.out.println("Rs.100:" + num);
                            }
                            if (cash >= 50) {
                                int num = cash / 50;
                                cash = cash % 50;
                                System.out.println("Rs.50:" + num);
                            }
                            if (cash >= 20) {
                                int num = cash / 20;
                                cash = cash % 20;
                                System.out.println("Rs.20:" + num);
                            }
                            if (cash >= 10) {
                                int num = cash / 10;
                                cash = cash % 10;
                                System.out.println("Rs.10:" + num);
                            }
                            if (cash >= 5) {
                                int num = cash / 5;
                                cash = cash % 5;
                                System.out.println("Rs.5:" + num);
                            }
                            if (cash >= 2) {
                                int num = cash / 2;
                                cash = cash % 2;
                                System.out.println("Rs.2:" + num);
                            }
                            if (cash >= 1) {
                                int num = cash / 1;
                                cash = cash % 1;
                                System.out.println("Rs.1:" + num);
                            }
                        } else {
                            System.out.println("Change cannot be calculated");
                        }
                    }


                }
            }
        }
    }




import java.util.Scanner;
import java.util.ArrayList;

public class CoffeeShop {

    public static class CoffeeOrder {
        // naming the variables
        private String a;  // drink
        private String b;  // size
        private String c;  // add-ins
        private double d;  // total cost

        // this is the constructor
        public CoffeeOrder(String a, String b, String c, double d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        // placement of setters and getters
        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public String getC() {
            return c;
        }

        public void setC(String c) {
            this.c = c;
        }

        public double getD() {
            return d;
        }

        public void setD(double d) {
            this.d = d;
        }

        // calculation of the cost
        public double calculateCost(double e, double f, double g) {  // e = basePrice, f = sizePrice, g = addInPrice
            d = e + f + g;
            return d;
        }

        // this is printing your order summary
        public void displayOrder() {
            System.out.println("Order Summary:");
            System.out.println(a + " $" + d);
            System.out.println(b);
            System.out.println(c);
            System.out.println("Total: $" + d);
        }
    }

     // the other class
    public static void main(String[] args) {
        ArrayList<CoffeeOrder>orders;
        Scanner h = new Scanner(System.in);
        boolean i = true;

        while (i) {
            // printing the menu
            System.out.println("Coffee Shop Menu:");
            System.out.println("1. Coffee      - $2.00");
            System.out.println("2. Latte       - $3.50");
            System.out.println("3. Cappuccino  - $4.00");
            System.out.print("Make your selection: ");
            int j = h.nextInt();  // j = drink choice

            String a = "";  // a = drink
            double e = 0.0;  // e = basePrice

            // switch statement
            switch (j) {
                case 1:
                    a = "Coffee";
                    e = 2.00;
                    break;
                case 2:
                    a = "Latte";
                    e = 3.50;
                    break;
                case 3:
                    a = "Cappuccino";
                    e = 4.00;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            // where you select your size
            System.out.println("Sizes:");
            System.out.println("S - Small ");
            System.out.println("M - Medium +$1.00 ");
            System.out.println("L - Large  +$1.50 ");
            System.out.print("Make your selection: ");
            char k = h.next().charAt(0);  // k = size choice

            String b = "";  // b = size
            double f = 0.0;  // f = sizePrice
            while (true) {
                if (k == 'S') {
                    b = "Small";
                    break;
                } else if (k == 'M') {
                    b = "Medium";
                    f = 1.00;
                    break;
                } else if (k == 'L') {
                    b = "Large";
                    f = 1.50;
                    break;
                } else {
                    System.out.println("Invalid size. Please try again.");
                    k = h.next().charAt(0);
                }
            }

            // Select add-ins
            System.out.println("Add-ins (+$0.50 each):");
            System.out.println("1. Cream ");
            System.out.println("2. Sugar ");
            System.out.println("3. Sprinkles ");
            System.out.print("Make your selection: ");
            int l = h.nextInt();  // l = add-in choice

            String c = "";  // c = add-ins
            double g = 0.0;  // g = addInPrice
            switch (l) {
                case 1:
                    c = "Milk";
                    g = 0.50;
                    break;
                case 2:
                    c = "Sugar";
                    g = 0.50;
                    break;
                case 3:
                    c = "Syrup";
                    g = 0.50;
                    break;
                default:
                    System.out.println("Invalid add-in. No add-ins will be applied.");
                    break;
            }

            // the CoffeeOrder object
            CoffeeOrder m = new CoffeeOrder(a, b, c, 0.0);  // m = CoffeeOrder object
            m.calculateCost(e, f, g);

            m.displayOrder();

            // option to place another order
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Place another order? yes or no: ");
                String n = h.next();  // n = user input for another order

                if (n.equals("yes")) {
                    i = true;
                    validInput = true;
                } else if (n.equals("no")) {
                    i = false;
                    validInput = true;
                    //this is if they say something else other than yes or no
                } else {
                    System.out.println("Invalid input. You have to say say yes or no.");
                }
            }
        }
    }
}
                //finished
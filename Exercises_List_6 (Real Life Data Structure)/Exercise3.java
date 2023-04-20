import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
        Map<String, ArrayList<Double>> map = new HashMap<String, ArrayList<Double>>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            menu();

            int choice = choice(sc);

            if (choice == 1) {
                add(sc, map);
            } else if (choice == 2) {
                remove(sc, map);
            } else if (choice == 3) {
                updatePrice(sc, map);
            } else if (choice == 4) {
                updateQuantity(sc, map);
            } else if (choice == 5) {
                retrieve(sc, map);
            } else if (choice == 6) {
                showList(map);
            }else {
                System.out.println("Enter one the options.");
            }
        }
    }

    static void menu(){
        System.out.println("---------------------------------");
        System.out.println("Product Inventory:");
        System.out.println("[1] Add new products");
        System.out.println("[2] Remove products");
        System.out.println("[3] Updating prices");
        System.out.println("[4] Updating quantities");
        System.out.println("[5] Searching for products");
        System.out.println("[6] Displaying the inventory");
    }

    static int choice(Scanner sc) {
        int choice;

        while (true) {
            try {
                System.out.print("Enter the option you want to perform: ");
                choice = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You can only enter number.");
            }
            sc.nextLine();
        }
        sc.nextLine();

        return choice;
    }

    static void add(Scanner sc, Map<String, ArrayList<Double>> map){
        String nameProduct;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the new product: ");
        nameProduct = sc.nextLine();

        try {
            Double priceProduct;
            System.out.println("---------------------------------");
            System.out.print("Enter the price of the new product: ");
            priceProduct = sc.nextDouble();

            Double quantityProduct;
            System.out.println("---------------------------------");
            System.out.print("Enter the quantity  of the new product: ");
            quantityProduct = sc.nextDouble();

            ArrayList<Double> list = new ArrayList<Double>();
            list.add(priceProduct);
            list.add(quantityProduct);
            map.put(nameProduct, list);
        }catch (InputMismatchException e) {
            System.out.println("You can only enter number.");
        }
    }

    static void remove(Scanner sc, Map<String, ArrayList<Double>> map){
        String productName;

        System.out.println("---------------------------------");
        System.out.print("Enter the name of the product you want to remove: ");
        productName = sc.nextLine();

        ArrayList<String> listName = new ArrayList<>(map.keySet());

        if (listName.contains(productName)) {
            System.out.printf("The product %s has been removed. \n", productName);
        } else {
            System.out.printf("The product %s is not in inventory.", productName);
        }

        map.remove(productName);
    }

    static void updatePrice(Scanner sc, Map<String, ArrayList<Double>> map){
        String nameProduct;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the product: ");
        nameProduct = sc.nextLine();

        try {
            Double priceProduct;
            System.out.println("---------------------------------");
            System.out.print("Enter the new price of the product: ");
            priceProduct = sc.nextDouble();

            ArrayList<Double> listValues = new ArrayList<Double>(map.get(nameProduct));
            Double quantityProduct = listValues.get(1);

            ArrayList<Double> list = new ArrayList<Double>();
            list.add(priceProduct);
            list.add(quantityProduct);
            map.put(nameProduct, list);

        }catch (InputMismatchException e) {
            System.out.println("You can only enter number.");
        }
    }

    static void updateQuantity(Scanner sc, Map<String, ArrayList<Double>> map){
        String nameProduct;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the product: ");
        nameProduct = sc.nextLine();

        try {
            Double quantityProduct;
            System.out.println("---------------------------------");
            System.out.print("Enter the new quantity of the product: ");
            quantityProduct = sc.nextDouble();

            ArrayList<Double> listValues = new ArrayList<Double>(map.get(nameProduct));
            Double priceProduct = listValues.get(0);

            ArrayList<Double> list = new ArrayList<Double>();
            list.add(priceProduct);
            list.add(quantityProduct);
            map.put(nameProduct, list);

        }catch (InputMismatchException e) {
            System.out.println("You can only enter number.");
        }
    }

    static void retrieve(Scanner sc, Map<String, ArrayList<Double>> map){
        String nameProduct;
        System.out.println("---------------------------------");
        System.out.print("Enter the name of the product: ");
        nameProduct = sc.nextLine();

        ArrayList<Double> listValues = new ArrayList<Double>(map.get(nameProduct));

        if (map.containsKey(nameProduct)) {
            System.out.printf("The product %s has price %.2f and quantity %.0f. \n", nameProduct, listValues.get(0), listValues.get(1));
        }else{
            System.out.printf("The product %s has not in inventory. \n", map.get(nameProduct));
        }

    }

    static void showList(Map<String, ArrayList<Double>> map){
        ArrayList<String> listNames = new ArrayList<>(map.keySet());
        ArrayList<ArrayList<Double>> listValues = new ArrayList<ArrayList<Double>>(map.values());

        System.out.println("---------------------------------");
        System.out.println("List:");
        for (int i = 0; i < listNames.size(); i++) {
            ArrayList<Double> values = new ArrayList<Double>(listValues.get(i));
            System.out.printf("Product: %s \t| Price: %.2f \t| Quantity: %.0f \n", listNames.get(i), values.get(0), values.get(1));
        }
    }
}

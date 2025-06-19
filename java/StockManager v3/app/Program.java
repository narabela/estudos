package app;

import entities.Product;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){

        Scanner in = new Scanner(System.in);


        System.out.println("Enter product data");
        System.out.print("Name: '");
        String name = in.nextLine();
        System.out.print("Price: '");
        double price = in.nextDouble ();

        Product product = new Product(name, price);
        product.setName("Computer");
        System.out.println("Update name:" + product.getName());
        product.setPrice(1200.00);
        System.out.println("Update price: " + product.getPrice());

        System.out.println("Product data: " + product);

        System.out.print("Enter the numner of products to be added in stock: '");
        int quantity = in.nextInt ();
        product.addProducts(quantity);

        System.out.print("Update data: " + product);

        System.out.print("Enter the number of produts to be removed from stock: ");
        quantity = in.nextInt ();
        product.removeProducts(quantity);
            
        System.out.println("Update data: " + product);
        
        in.close();
        }
}
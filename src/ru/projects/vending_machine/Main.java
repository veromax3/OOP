package ru.projects.vending_machine;

import ru.projects.vending_machine.product.Bottle;
import ru.projects.vending_machine.product.Product;
import ru.projects.vending_machine.vending.VendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(123);
        Product product1 = new Bottle("Cola", 150, 1.5);
        Product product2 = new Product("milka", 140);

        vendingMachine.addProduct(product1);
        vendingMachine.addProduct(product2);

        System.out.println(vendingMachine.getProductInfo());



    }
}

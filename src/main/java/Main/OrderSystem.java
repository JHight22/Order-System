/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import BusinessLayer.Customer;
import BusinessLayer.Order;
import BusinessLayer.OrderItem;
import BusinessLayer.Product;
import DataAccess.CustomerRepository;
import DataAccess.OrderItemRepository;
import DataAccess.OrderRepository;
import DataAccess.ProductRepository;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class OrderSystem {

    public static void main(String[] args) {

        CustomerRepository customerRepo = new CustomerRepository();
        OrderItemRepository orderItemRepo = new OrderItemRepository();
        OrderRepository orderRepo = new OrderRepository();
        ProductRepository productRepo = new ProductRepository();

        // This is customer 1, their 1 order, and 2 items
        Customer myCustomer1 = new Customer(1, "Bob", "Smith", "417-777-777");
        Product myProduct1 = new Product(20, "Baseball", 10, 5.00);
        Product myProduct2 = new Product(21, "Baseball Glove", 15, 10.00);
        Order myOrder1 = new Order(101, 1, "5/5/2020");
        OrderItem myOrderItem1 = new OrderItem(101, 5, 20, "Baseball", 10, 5.00);
        OrderItem myOrderItem2 = new OrderItem(101, 6, 21, "Baseball Glove", 15, 10.00);

        //This is customer 2, their 1 order, and 2 items
        Customer myCustomer2 = new Customer(2, "Jane", "Doe", "417-888-8888");
        Product myProduct3 = new Product(30, "Desktop Computer", 3, 500.00);
        Product myProduct4 = new Product(31, "Keyboard", 7, 25.00);
        Order myOrder2 = new Order(102, 2, "5/4/2020");
        OrderItem myOrderItem3 = new OrderItem(102, 56, 30, "Desktop Computer", 3, 500.00);
        OrderItem myOrderItem4 = new OrderItem(102, 34, 31, "Keyboard", 7, 25.00);

        //This is customer 3, their 1 order, and 2 items
        Customer myCustomer3 = new Customer(3, "Jill", "Bennett", "417-999-9999");
        Product myProduct5 = new Product(40, "Toilet Paper", 30, 10.00);
        Product myProduct6 = new Product(41, "Toilet Plunger", 5, 15.00);
        Order myOrder3 = new Order(103, 3, "5/1/2020");
        OrderItem myOrderItem5 = new OrderItem(103, 1, 40, "Toilet Paper", 30, 10.00);
        OrderItem myOrderItem6 = new OrderItem(103, 2, 41, "Toilet Plunger", 5, 15.00);

        customerRepo.create(myCustomer1);
        orderRepo.create(myOrder1);
        orderItemRepo.create(myOrderItem1);
        orderItemRepo.create(myOrderItem2);
        productRepo.create(myProduct1);
        productRepo.create(myProduct2);

        customerRepo.create(myCustomer2);
        orderRepo.create(myOrder2);
        orderItemRepo.create(myOrderItem3);
        orderItemRepo.create(myOrderItem4);
        productRepo.create(myProduct3);
        productRepo.create(myProduct4);

        customerRepo.create(myCustomer3);
        orderRepo.create(myOrder3);
        orderItemRepo.create(myOrderItem5);
        orderItemRepo.create(myOrderItem6);
        productRepo.create(myProduct5);
        productRepo.create(myProduct6);

        ArrayList<Customer> customersFromDatabase = customerRepo.getAll();
        for (Customer dbCustomers : customersFromDatabase) {
            System.out.println(dbCustomers.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<Order> ordersFromDatabase = orderRepo.getAll();
        for (Order dbOrders : ordersFromDatabase) {
            System.out.println(dbOrders.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<OrderItem> orderItemsFromDatabase = orderItemRepo.getAll();
        for (OrderItem dbOrderItem : orderItemsFromDatabase) {
            System.out.println(dbOrderItem.toString());
        }

        System.out.println("-------------------------------------");

        ArrayList<Product> productsFromDatabase = productRepo.getAll();
        for (Product dbProduct : productsFromDatabase) {
            System.out.println(dbProduct.toString());
        }

    }
}

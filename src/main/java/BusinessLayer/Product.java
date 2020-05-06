/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

/**
 *
 * @author jared
 */
public class Product {
    private int productID;
    private String description;
    private int quantityOnHand;
    private double price;
    
    public Product(int productID, String description, int quantityOnHand, double price) {
        this.productID = productID;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product {" + "productID = " + productID + ", description = " + description + ", quantityOnHand = " + quantityOnHand + ", price = " + price + '}';
    }
}

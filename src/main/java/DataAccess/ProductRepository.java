/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Product;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class ProductRepository {
      private ArrayList<Product> dataStore;

    public ProductRepository() {
        this.dataStore = new ArrayList<Product>();
    }

    public ArrayList<Product> getAll() {
        return dataStore;
    }

    public void create(Product orderToCreate) {
        this.dataStore.add(orderToCreate);
    }
}

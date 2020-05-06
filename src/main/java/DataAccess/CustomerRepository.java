/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import BusinessLayer.Customer;
import java.util.ArrayList;

/**
 *
 * @author jared
 */
public class CustomerRepository {

    //using an ArrayList to represent a database
    private ArrayList<Customer> dataStore;

    public CustomerRepository() {
        this.dataStore = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getAll() {
        return dataStore;
    }

    public void create(Customer customerToCreate) {
        this.dataStore.add(customerToCreate);
    }
}

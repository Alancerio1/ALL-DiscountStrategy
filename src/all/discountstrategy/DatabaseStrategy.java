/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.discountstrategy;

/**
 *
 * @author alancerio18
 */
public interface DatabaseStrategy {

    Customer findCustomerById(String customerId);

    Product findProductById(String ProductId);
    
}

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
public interface DiscountStrategy {
    public abstract double getDiscountAmount(int quantity, double unitCost);
    
}

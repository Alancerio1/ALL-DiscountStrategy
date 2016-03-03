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
public class PercentOffDiscount implements DiscountStrategy {
    private double discountRate;

    public PercentOffDiscount(double discountRate) {
        setDiscountRate(discountRate);
    }

    public final double getDiscountRate() {
        return discountRate;
    }
   

    public final void setDiscountRate(double discountRate) {
        //needs validation
        this.discountRate = discountRate;
    }
    
    
    @Override
    public final double getDiscountAmount(int quantity, double unitCost) {
        //needs validation
        return unitCost * quantity * discountRate;
        
        
    }

    @Override
 
      public double getAmountSaved(double unitCost, int quantity){
        return unitCost* quantity * discountRate;
    };
    
    
}

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
public class QuantityDiscount implements DiscountStrategy {

    private double discountRate;
    private  int minimumQuantity;
    private final int NO_DISCOUNT = 0;

    public QuantityDiscount(double discountRate, int minimumQuantity) {
        setDiscountRate(discountRate);
        setMinimumQuantity(minimumQuantity);
    }

    public int getMinimumQuantity() {
        return minimumQuantity;
    }

    public final void setMinimumQuantity(int minimumQuantity) {
        //needs validation
        this.minimumQuantity = minimumQuantity;
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
        if (quantity >= minimumQuantity) {
            return unitCost * quantity * discountRate;
        } else {
            return NO_DISCOUNT;
        }

    }

    @Override
    public double getAmountSaved(double unitPrice, int quantity){
        if(quantity >= minimumQuantity){
        return unitPrice * quantity * discountRate;
        }else{
            return 0;
        }
    };

}

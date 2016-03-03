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
public class NoDiscount implements DiscountStrategy {

    private double discountRate;
    private final int NO_DISCOUNT = 0;

    public NoDiscount() {
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
        return NO_DISCOUNT;

    }

    @Override
    public double getAmountSaved(double unitPrice, int quantity) {
        return 0;
    }

}

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
public class LineItem {
    private int quantity;
    private Product product;

    public LineItem(String productId,int quantity,DatabaseStrategy db) {
        this.quantity = quantity;
        setProduct(db.findProductById(productId));
        
    }
    
    
    
     public final double getSubTotal(){
        return product.getUnitCost()* quantity;
    }
   public final double getSubTotalDiscount(){
        return product.getAmountSaved(quantity);
    }
    public final String getProductId(){
        return product.getProductId();
    }
    public final String getName(){
        return product.getProductName();
    }
    public  final double getUnitPrice(){
        return product.getUnitCost();
    }

    
    
    public final double getQuantity() {
        return quantity;
    }

    public final void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }
}

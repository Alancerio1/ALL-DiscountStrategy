/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.discountstrategy;

import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author alancerio18
 */
public class Receipt {
    private DatabaseStrategy db;
    private Customer customer;
    private LineItem[] lineItems;
      
     private NumberFormat nf = NumberFormat.getCurrencyInstance();
   
    
    
    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        //needs validation
        this.customer = customer;
    }
    

    public Receipt(String customerId,DatabaseStrategy db) {
        //needs validation
        setDb(db);
        setCustomer(db.findCustomerById(customerId));
        lineItems = new LineItem[0];
    }
    
    public final void addItemToReceipt(String productId,int quantity){
       LineItem item = new LineItem(productId,quantity,db);
       addItemToArray(lineItems,item);
     /*  
       LineItem[] tempArray = new LineItem[lineItems.length + 1];
       System.arraycopy(lineItems,0,tempArray,0,lineItems.length);
       tempArray[tempArray.length - 1] = item;
       lineItems = tempArray;
     */  
       /*
       LineItem[] tempArray = new LineItem[lineItems.length + 1];
       for(int i=0; i < lineItems.length; i ++){
           tempArray[i] = lineItems[i];
       }
       tempArray[tempArray.length - 1] = item;
       lineItems = tempArray; 
       }*/
    }
    private void addItemToArray(LineItem[] origArray, LineItem item){
        LineItem[] tempArray = new LineItem[origArray.length + 1];
       System.arraycopy(origArray,0,tempArray,0,origArray.length);
       tempArray[tempArray.length - 1] = item;
       origArray = tempArray;  
       lineItems = origArray;
    }
    
    public final DatabaseStrategy getDb(){
        return db;
    }
    public final void setDb(DatabaseStrategy db){
        //needs validation
        this.db = db;
    }
    public LineItem[] getLineItems(){
        return lineItems;
    }
     public final double getSubTotalBeforeDiscount() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getSubTotal();
        }
        return total;
    }
      public final double getSubTotalDiscount() {
        double total = 0.0;
        for(LineItem item : lineItems) {
            total += item.getSubTotalDiscount();
        }
        return total;
    }
public final String outputReceipt() {
     StringBuilder receiptData = new StringBuilder("Thank you for shopping at Kohls!\n\n");
        receiptData.append("Sold to: ").append(customer.getCustomerName()).append("\n");
       
         receiptData.append("ID\tItem\t\t\tPrice\tQty\tSubtotal\tDiscount").append("\n");
        receiptData.append("------------------------------------------------------------------------").append("\n");
        for(LineItem item : lineItems) {
            receiptData.append(item.getProduct().getProductId()).append("\t");
            receiptData.append(item.getProduct().getProductName()).append("\t");
            receiptData.append(nf.format(item.getProduct().getUnitCost())).append("\t");
            receiptData.append(item.getQuantity()).append("\t");
            receiptData.append(nf.format(item.getSubTotal())).append("\t\t");
            receiptData.append(nf.format(item.getSubTotalDiscount())).append("\n");
        }
       
        receiptData.append("\n");
        receiptData.append("\t\t\t\t\t\t\t\t--------").append("\n");
        double total = getSubTotalBeforeDiscount();
        receiptData.append("\t\t\t\t\t\tTotal:  \t").append(nf.format(total)).append("\n");
        double totalDiscount = getSubTotalDiscount();
        receiptData.append("\t\t\t\t\t\tTotal Saved: \t").append(nf.format(totalDiscount)).append("\n");
        double totalDue = total - totalDiscount;
        receiptData.append("\t\t\t\t\t\tTotal Due: \t").append(nf.format(totalDue)).append("\n");
        
        String converter = receiptData.toString();
       return converter;
      //  GuiOutput.outputReceipt(receiptData.toString());
       
     
    /*
       System.out.println("Thank you for shopping at Kohls!\n\n");
       System.out.println("Sold to: " + customer.getCustomerName() + "\n");
       System.out.println("ID\tItem\t\t\tPrice\tQty\tSubtotal\tDiscount" + "\n");
       System.out.println("------------------------------------------------------------------------" + "\n");
        for(LineItem item : lineItems) {
            System.out.print(item.getProduct().getProductId()+ "\t");
            System.out.print(item.getProduct().getProductName() + "\t");
            System.out.print("\t" + nf.format(item.getProduct().getUnitCost()) + "\t");
            System.out.print(item.getQuantity()+"\t");
           System.out.print(nf.format(item.getSubTotal())+ "\t\t");            
           System.out.print(nf.format(item.getSubTotalDiscount()));
            System.out.println("\n");
        
        }
        
        System.out.println("\n");
        System.out.println("\t\t\t\t\t\t\t\t--------" + "\n");
        double total = getSubTotalBeforeDiscount();
       System.out.println("\t\t\t\t\t\tTotal:  \t" + "$" + total +"\n");
        double totalDiscount = getSubTotalDiscount();
        System.out.println("\t\t\t\t\t\tTotal Saved: \t" + "$" + totalDiscount + "\n");
        double totalDue = total - totalDiscount;
       System.out.println("\t\t\t\t\t\tTotal Due: \t" + "$" + totalDue + "\n"); 
        */
     

}
}

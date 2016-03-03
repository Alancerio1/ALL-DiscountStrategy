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
public class ALLDiscountStrategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //KLUDGE: do configuration here
        DatabaseStrategy db = new FakeDataBase();
        
        ReceiptOutputStrategy output = new GuiOutput();
            
            
        
        
        
        
        //start talking to objects
        Register register = new Register();
        
        register.startNewSale("100", new FakeDataBase());
        register.addItemToSale("11", 2);
        register.addItemToSale("22", 1);
        register.endSale(output);
//        register.startNewSale("100", db);
//        
//        //testing to see if a customer was added to the recipt.
//      /*  Customer customer = register.getReceipt().getCustomer();
//        System.out.println("Customer " + customer.getCustomerName() + " found and added to receipt");
//              */
//        register.addItemToSale("11", 2);
//        register.addItemToSale("22", 1);
//        register.addItemToSale("33", 3);
//        
//        LineItem[] items = register.getReceipt().getLineItems();
//        for(LineItem item : items){
//           
//            System.out.println(item.getProduct().getProductName());
//        }
//       
    }
    
}

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
public class Register {
    private Receipt receipt;
    private String storeName;
    private ReceiptOutputStrategy[] outputs;
   

    public final Receipt getReceipt() {
        return receipt;
    }

    public final void setReceipt(Receipt receipt) {
        //needs validation
        this.receipt = receipt;
    }

    public final String getStoreName() {
        return storeName;
    }

    public final void setStoreName(String storeName) {
        //needs validation
        this.storeName = storeName;
    }
    
    
    public final void startNewSale(String customerId,DatabaseStrategy db){
        //needs validation
        receipt = new Receipt(customerId,db);
        setOutputs(outputs);
        
    }
    public void endSale(ReceiptOutputStrategy output){
        output.outputReceipt(receipt);
       // receipt.outputReceipt();
    }
    public void addItemToSale(String productId,int quantity){
         receipt.addItemToReceipt(productId, quantity);
    }
    public final ReceiptOutputStrategy[] getOutputs() {
        return outputs;
    }

    public final void setOutputs(ReceiptOutputStrategy[] outputs) {
        // needs validation
        this.outputs = outputs;
    }

}

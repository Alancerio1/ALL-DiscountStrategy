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
public class ReceiptConsoleOutput implements ReceiptOutputStrategy {
      @Override
    public void outputReceipt(Receipt r) {
        System.out.println(r.outputReceipt());
    }

    @Override
    public void outputMessage(String msg) {
        System.out.println(msg);
    }
    
}

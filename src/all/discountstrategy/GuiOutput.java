/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package all.discountstrategy;

import javax.swing.JOptionPane;

/**
 *
 * @author alancerio18
 */
public class GuiOutput implements ReceiptOutputStrategy {
    
  
    public final void outputReceipt(Receipt r) {
        // needs validation
        JOptionPane.showMessageDialog(null, r.outputReceipt());
    }

@Override
    public void outputMessage(String msg) {
        System.out.println(msg);
    }

   
}

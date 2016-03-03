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
public class Customer {
    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {
        //change to setCustomerId. YOou do this because it doesn't have 
        //validation and the setter methods already do.
       setCustomerId(customerId);
       //method says it's overrideable. This means we have to mark them as final
        setCustomerName(customerName);
    }
    

    public String getCustomerId() {
        return customerId;
    }

    public final void setCustomerId(String CustomerId) {
        //needs validation
        this.customerId = CustomerId;
    }

    public final String getCustomerName() {
        return customerName;
    }

    public final void setCustomerName(String CustomerName) {
        //needs validation
        this.customerName = CustomerName;
    }
    
    
}

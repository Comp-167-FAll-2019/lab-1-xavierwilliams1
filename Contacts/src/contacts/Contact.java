/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;

/**
 *
 * @author CCannon
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    
    

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    
    public String toString(){
        return firstName + " " + lastName+  " " + phoneNumber + " " + emailAddress;
    }

    String getFirstName() {
        return firstName; //To change body of generated methods, choose Tools | Templates.
    }

    String getLastName() {
        return lastName; //To change body of generated methods, choose Tools | Templates.
    }
}

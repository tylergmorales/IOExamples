/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.util.Objects;

/**
 *
 * @author tmorales3
 */
public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    
    public Person(){
        
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getState() {
        return state;
    }
    
    public String getZip() {
        return zip;
    }
    
    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }
    
    
    
    
    
    public void setFirstName(String firstName) {
        if(firstName != null || firstName != ""){
            this.firstName = firstName;
        }
    }
    
    public void setLastName(String lastName) {
        if(lastName != null || lastName != ""){
            this.lastName = lastName;
        }
    }
        
    public void setStreetAddress(String s){
        if(s != null || s != ""){
            this.streetAddress = s;
        }
    }
    
    public void setCity(String s){
        if(s != null || s != ""){
            this.city = s;
        }
    }
    
    public void setState(String state) {
        if(state != null || state != ""){
            this.state = state;
        }
    }
    
    public void setZip(String zip) {
        if(zip != null || zip != ""){
            this.zip = zip;
        }
    }
    
    public String toString(){
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nStreet Address: " + streetAddress + "\nCity: " + city + "\nState: " + state + "\nZip: "+ zip + "\n";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
        hash = 53 * hash + Objects.hashCode(this.streetAddress);
        hash = 53 * hash + Objects.hashCode(this.city);
        hash = 53 * hash + Objects.hashCode(this.state);
        hash = 53 * hash + Objects.hashCode(this.zip);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.streetAddress, other.streetAddress)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.zip, other.zip)) {
            return false;
        }
        return true;
    }
    
    
}

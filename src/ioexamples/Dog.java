/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

/**
 *
 * @author Instlogin
 */
public class Dog {
    private String name = "Finn";
    
    public String getCity() {
        String[] nameArray = name.split(" ");
        String temp = nameArray[0];
        return temp.substring(0, temp.length()-1);
    }
    
    public String toString() {
        return name.toUpperCase();
    }
}

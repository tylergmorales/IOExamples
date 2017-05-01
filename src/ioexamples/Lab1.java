/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author tmorales3
 */
public class Lab1 {
    public static void main(String[] args) {
        File file = new File("src" + File.separatorChar + "contactList.txt");
        
        Set<Person> people = new HashSet<>();
        people.clear();
        
        BufferedReader bR = null;
        try{
            bR = new BufferedReader(new FileReader(file));
            String line = bR.readLine();
            while(line != null) {
                    Person person = new Person();
                    for(int i = 1; i < 4; i++){
                        try {
                            switch(i){
                                case 1:
                                    String nameParts[] = line.split(" ");
                                    person.setFirstName(nameParts[0]);
                                    person.setLastName(nameParts[1]);
                                    line = bR.readLine();
                                    break;
                                case 2:
                                    person.setStreetAddress(line);
                                    line = bR.readLine();
                                    break;
                                case 3: 
                                    String addressParts[] = line.split(", ");
                                    person.setCity(addressParts[0]);
                                    String[] stateZipParts = addressParts[1].split(" ");
                                    person.setState(stateZipParts[0]);
                                    person.setZip(stateZipParts[1]);
                                    line = bR.readLine();
                                    people.add(person);
                                    break;
                                default: System.out.println("You did something stupid");
                            }
                        } catch (Exception e){                   
                        }           
                    }   
                line = bR.readLine();
            } 
        } catch (IOException ioe){
            System.out.println("Problem reading file");
        } finally {
            try{
                bR.close();
            } catch (Exception e) {
            }
        }
        System.out.println("\n\n");
        
        for (Person p : people)
        {
            System.out.println(p);
        }
    }
    
}

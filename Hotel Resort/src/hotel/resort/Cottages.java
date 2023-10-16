/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.resort;

/**
 *
 * @author adamp
 */
public class Cottages extends Agency {
        
    private String address, key, elec;
    
    public Cottages(String address, String key){
        address = "";
        key = "";
        elec = "not included.";
    }
    
    @Override
    public int getTotal(){
        total  = cottageCost*duration;
        if(eChoice == 1){
            total = total + 50;
            elec = "included.";
        }
        return total;
    }
    public String getElectricity(){
        return elec;
    }
}

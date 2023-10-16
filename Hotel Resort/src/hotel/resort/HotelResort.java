/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.resort;

import javax.swing.JOptionPane;

/**
 *
 * @author adamp
 */
public abstract class HotelResort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //data variables
        String name, startDate;
        int duration, choice, eChoice, bChoice;

        //instantiated sub classes
        hotelRooms hh = new hotelRooms("Room 12");
        Cottages c = new Cottages("D12 B7T1","A");
        
        //user input 
        name = JOptionPane.showInputDialog(null, "What is your name?");
        hh.setName(name);
        c.setName(name);
        
        startDate = JOptionPane.showInputDialog(null, "What date will you arrive at?");
        hh.setStartDate(startDate);
        c.setStartDate(startDate);
        
        duration = Integer.parseInt(JOptionPane.showInputDialog(null, "How many nights are you staying with us? \n\n(The cost for staying one night is 130€ for our Hotel Rooms) \n\n(The cost for staying in one of our Cottages is 60€)"));
        hh.setDuration(duration);
        c.setDuration(duration);
        
        choice = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 for a Hotel room \nPress 2 for a Cottage"));
        hh.setChoice(choice);
        c.setChoice(choice);
        
        //user getting full booking ticket back
        if(choice == 1){
            bChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 if you would like breakfast included each morning"));
            hh.setbChoice(bChoice);
            JOptionPane.showMessageDialog(null, "Here is your booking: \nName: "+hh.getName()+"\nDay you arrive to us: "+hh.getStartDate()+"\nDuration with us: "+hh.getDuration()+" Days"+"\nHere is the price of your stay with us: €"+hh.getTotal()+"\nBreakfast is "+hh.getBreakfast());
        }
        else if(choice == 2){
            eChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Press 1 if you would like electricity included for a one time fee of €50"));
            c.seteChoice(eChoice);
            JOptionPane.showMessageDialog(null, "Here is your booking: \nName: "+c.getName()+"\nDay you arrive to us: "+c.getStartDate()+"\nDuration with us: "+c.getDuration()+" Days"+"\nHere is the price of your stay with us: €"+c.getTotal()+"\nElectricity is "+c.getElectricity());   
        }
        else if(choice != 1 || choice != 2){
            JOptionPane.showMessageDialog(null, "Please enter only 1 or 2");
        }
    } 
}

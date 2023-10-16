/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.resort;

/**
 *
 * @author adamp
 */
public class hotelRooms extends Agency {
    
    private String roomNum, breakfast;
    
    public hotelRooms(String roomNum){ 
        roomNum = "";
        breakfast = "not included.";
    }

    @Override
    public int getTotal(){
        total = roomCost*duration;
        if(bChoice == 1){
            total = total + (10 * duration);
            breakfast = "included.";
        }  
        return total;
    }
    public String getBreakfast(){
        return breakfast;
    }
}

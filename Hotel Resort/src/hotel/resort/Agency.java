/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.resort;

/**
 *
 * @author adamp
 */
public abstract class Agency {
    
    //data members that extend to subclass cottages & hotelRooms
    protected String name, startDate;
    protected int duration, choice, eChoice, bChoice;
    
    protected int total;
    protected int roomCost = 130;
    protected int cottageCost = 60;
    
    
    //constructor
    public Agency(){
        name = "";
        startDate = "";
        duration = 0; 
        choice = 0;
        eChoice = 0;
        bChoice = 0;
        total = 0;
        roomCost = 130;
        cottageCost = 60;
    }
    
    //setters & getters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int geteChoice() {
        return eChoice;
    }
    public void seteChoice(int eChoice) {
        this.eChoice = eChoice;
    }

    public int getbChoice() {
        return bChoice;
    }
    public void setbChoice(int bChoice) {
        this.bChoice = bChoice;
    }
    
    public void setChoice(int choice){
        this.choice = choice;
    }

    //Overloaded compute method
    public abstract int getTotal();
}

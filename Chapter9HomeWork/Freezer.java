package Chapter9HomeWork;

public class Freezer {
    ///////////////////////////////////////////////////////////////////////////////////////
    //data field :
    //constant speeds
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    //private variables
    private int temperature = 0;
    private boolean isOn = false;
    private double size = 3.0;

    //color variable, neither private nor constant
    String color = "black";

    ///////////////////////////////////////////////////////////////////////////////////////

    //constructor:
    public Freezer(){

    }
    //////////////////////////////////////////////////////////////////////////////////////////
    //getters only
    public int getSLOW(){
        return SLOW;
    }
    public int getMEDIUM(){
        return MEDIUM;
    }
    public int getFAST(){
        return FAST;
    }

    ////////////////////////////////////////////////////////////////////////////////
    //getters and setters:

    //getter for temperature
    public int getTemperature(){
        return temperature;
    }
    //setter for temperature
    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    //getter for isOn
    public boolean getIsOn(){
        return isOn;
    }
    //setter for isOn
    public void setIsOn(boolean isOn){
        this.isOn = isOn;
    }

    //getter for Size
    public double getSize(){
        return size;
    }
    //setter for Size
    public void setSize(double size){

        this.size = size ;
    }

    //getter for color
    public String getColor(){
        return color;
    }

    //setter for color
    public void setColor(String color){
        this.color = color;
    }

    /////////////////////////////////////////////////////////////////////////////////////
    //toString method to print a statements w/conditions
    public String toString(){

        if (isOn == true){
            return getFAST()+ " " + color + " " + size;
        } else {
            return getMEDIUM() + " " +color + " " + size + ". The freezer is currently off.";
        }
    }

}

package ObjectandClassWORK;

public class Stock {
    //data field
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;


    //constructor
    public Stock(String symbol, String myName){
        this.symbol = symbol; //If same use this.
        name = myName;
    }
    //methods like getters and setters
    public double getChangedPercent(){
        return ((currentPrice - previousClosingPrice)/ previousClosingPrice)*100;
    }

    //Setters and Getters
    //getter for symbol
    public String getSymbol() {
        return  symbol;
    }
    //setter for symbol
    public void setSymbol(String symbol){
        this.symbol = symbol;
    }
    //getter for name
    public String getName() {
        return  name;
    }
    //setter for name
    public void setName(String myName){
        name = myName;
    }

    //getter for previousClosingPrice
    public double getPreviousClosingPrice() {
        return  previousClosingPrice;
    }
    //setter for previousClosingPrice
    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }

    //getter for currentPrice
    public double getCurrentPrice() {
        return  currentPrice;
    }
    //setter for currentPrice
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
}

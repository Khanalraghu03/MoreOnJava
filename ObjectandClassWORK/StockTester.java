package ObjectandClassWORK;

import ObjectandClassWORK.Stock;

public class StockTester {
    public static void main(String args[]){
        //instantiation
        //create an object

        Stock oracle = new Stock("ORCL", "Oracle Corporation");

        //double changedPrice = oracle.getChangedPercent();

        oracle.setCurrentPrice(34.35);
        oracle.setPreviousClosingPrice(34.5);

        System.out.printf("%2.2f%%", oracle.getChangedPercent());


    }
}

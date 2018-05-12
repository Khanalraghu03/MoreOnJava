package FinalExam;

public class Second {

    private int hourlyRate;
    private double hoursWorked;

        public Second() {

        }


        public double getMoneyValue(){
            double moneyValue = hourlyRate * hoursWorked;
            return moneyValue;
        }

        public void setMoneyValue(int hourlyRate, double hoursWorked) {
            this.hourlyRate = hourlyRate;
            this.hoursWorked = hoursWorked;
        }


}

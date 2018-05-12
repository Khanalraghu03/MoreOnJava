package Project9;


public class CreditCard {
    private long cardNumber;
    private String bankName;

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public long getCardNumber() {
        if(cardNumber < 0) {
            return -1;
        }
        else {
            return cardNumber;
        }
    }


    public String getBankName() {
        return bankName;
    }

    public String toString() {
        return "Bank Name: " +  bankName + " Bank";

    }
}

package Chapter9HomeWork;

public class Name {
    private String firstName;
    private char middleInitial;
    private String lastName;

    public Name(String myfirstName, char myMiddleInitial, String myLastName
    ) {
        firstName = myfirstName;
        middleInitial = myMiddleInitial;
        lastName = myLastName;
    }

    public Name(String myfirstName, String myLastName) {
        firstName = myfirstName;
        lastName = myLastName;

    }

    public String getNormalorder() {
        if (middleInitial > 0) {
            return firstName + " " + middleInitial + ". " + lastName;
        } else {
            return firstName + ", " + lastName;
        }
    }

    public String getReversedOrder() {
        if (middleInitial > 0) {
            return lastName + ", " + firstName + " " + middleInitial + ".";
        } else {
            return lastName + ", " + firstName;
        }
    }

/*    public String getInitials() {
        char firstinitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(0);
        Print initials ex. RNK
       if (middleInitial > 0)
        {

            return (firstinitial +  middleInitial + lastInitial);
        }

       else
       {
         String initial = firstName.charAt(0) + lastName.charAt(0);
            return initial;

        }
    }*/

    //getter for initials
    public String getInitials(){
        if (middleInitial > 0) {
            return "" + firstName.charAt(0) + middleInitial + lastName.charAt(0);
        } else {
            return "" + firstName.charAt(0) + lastName.charAt(0);
        }
    }

//    //setter for initials : can't use setter: not setting anything
//    public void setInitials(String myFirstName, char myMiddleInitial, char myLastName){
//        this.firstName = "" + firstName.charAt(0);
//        this.middleInitial = myMiddleInitial;
//        this.lastName = "" + lastName.charAt(0);



   // }
}



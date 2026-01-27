package Unit3;

public class conditionals {
    public static void main(String[] args) {
         boolean someBoolean = true;
         int someInt = 34;
         double someDouble = 5.98;
        if(someBoolean) //single if statement, can use curly braces or not
            System.out.println("");

        if(someBoolean) { // if-else statement (multi way conditional statement) using curly braces
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        
        if(!someBoolean) {

        }

        // logical operators
        if (!someBoolean && someInt > someDouble) { // ! operator means 'not'
            System.out.println("someBoolean is false, someInt is greater than someDouble"); 
        }
        else if (someBoolean && (someInt < someDouble || someDouble == 5.98)) { // && evaluates to true if both conditions are true, || evaluates to true if any condition is true
            System.out.println("yadda yadda");
        }
        else { //else statement will only be executed if all previous "else if" statements return false
            System.out.println("yap");
        }
    }

}


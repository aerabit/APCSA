package Unit2;

public class second {

    public static void main(String[] args) {
        String str1 = new String("This is a string");

        String str2 = "Wow!";

        String fullStr = str1 + ". " + str2; // string concatenation

        System.out.println(fullStr);

        System.out.println(fullStr.length()); // non void methods like .length() don't necessarily print things on their own, only return a value

        String slicing = fullStr.substring(3, 8);

        System.out.println(slicing);

        String newStr = "Crazy!";

        System.out.println("Wow!" == str2);

        System.out.println(newStr.equals("Crazy!"));

        System.out.println(newStr.compareTo(str2));

        System.out.println(fullStr.indexOf(" "));
    }
}
package Unit2;

public class strings {
    
    public static void main(String[] args){
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
        
        System.out.println(fullStr.concat(" Boom!"));

        System.out.println(str1.charAt(2));
        
        System.out.println(str2.contains("Wo"));

        System.out.println(fullStr.hashCode());

        String empty = new String("");

        System.out.println(empty.isEmpty());

        System.out.println(str2.lastIndexOf("w"));

        System.out.println(str2.replace("w", "b"));

        System.out.println(str2.toLowerCase());

        System.out.println(fullStr.toUpperCase());

        // String concatenation order of operations
        System.out.println("I am " + ((16 * 2) / 8 + 57 / 4.5) + " years old");

        // Math.random();
        System.out.println((int)(Math.random() * 10) + 1); // 1-10

        System.out.println((int)(Math.random()* 91) + 10); // 10-100

        System.out.println(((int)(Math.random()* 51) * 2) + 2); // 1-100 even

    }

}

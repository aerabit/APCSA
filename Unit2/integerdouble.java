package Unit2;
public class integerdouble {
    public static void main(String[] args) {
    // boxing (formal)
        Integer intObject = new Integer(40); // must be an integer
        Double doubleObject = new Double(12.25); // can be an integer

        // autoboxing (less formal)
        Integer intObject2 = 50;
        Double doubleObject2 = 6.23;

        // unboxing (formal)
        int number = intObject.intValue();
        double decimal = doubleObject.doubleValue();

        // autounboxing (less formal)
        int number2 = intObject + 13;
        double decimal2 = doubleObject + 428;

        double sum = (intObject2 + doubleObject2 + number2 - number / decimal * decimal2);
        System.out.println(sum);

        Double newerDouble = new Double(565.2850128852);

        System.out.println(intObject.equals(number)); //.equals() method only checks other objects / like data types
        System.out.println(intObject.compareTo(intObject2));
        Integer longInt = new Integer(57306);
        System.out.println(intObject.longValue());
        System.out.println(longInt.shortValue());
        String intString = new String(longInt.toString());
        System.out.println(intString);
        System.out.println(longInt.floatValue());
        System.out.println(Double.toHexString(newerDouble));
        System.out.println(Double.toString(newerDouble));
        System.out.println(newerDouble.isNaN());
        System.out.println(Double.doubleToLongBits(newerDouble));
        System.out.println(Double.doubleToRawLongBits(newerDouble));
        System.out.println(doubleObject.compareTo(newerDouble));
        double doubleString = Double.parseDouble("43.24625");
        System.out.println(doubleString);
        System.out.println(newerDouble.byteValue());
        
        

        System.out.println(Math.abs(-9.2423245));
        System.out.println(Math.sqrt(100));
        System.out.println(Math.random());
        System.out.println(Math.cos(30));
        System.out.println(Math.decrementExact(34));
        System.out.println(Math.floorDiv(12, 38));
        System.out.println(Math.multiplyExact(number, number2));
        System.out.println(Math.pow(8, 3));
        System.out.println(Math.rint(doubleObject));
        System.out.println(Math.toRadians(40));

    }

}
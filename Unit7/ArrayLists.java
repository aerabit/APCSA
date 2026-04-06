package Unit7;
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        ArrayList<Integer> intList = new ArrayList<Integer>();
        ArrayList<Double> doubleList = new ArrayList<Double>();
        strList.add("John");
        intList.add(45);
        intList.add(78);
        intList.add(33);
        intList.add(12);
        doubleList.add(183.4);
        strList.add("Jane");
        strList.add("Roger");
        strList.add("Ann");
        strList.add("Lucy");
        strList.add("Kylie");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        strList.remove(2);
        System.out.println(strList);
        doubleList.add(43.8);
        doubleList.add(272.12);
        doubleList.add(4.7);
        System.out.println(doubleList);
        divideDoubles(doubleList, 2, 3);
        System.out.println(doubleList);
        System.out.println(intList);
        intList.clear();
        System.out.println(intList);
        intList.add(22);
        intList.add(22);
        System.out.println(intList.lastIndexOf(22));
        System.out.println(strList.clone());
        System.out.println(strList.contains("Lucy"));
        System.out.println(intList.contains(23));
        String[] strArray = {};
        strArray = strList.toArray(strArray);
        System.out.println(strArray);
        intList.trimToSize();
        System.out.println(strList.subList(3, 5));
        System.out.println(doubleList.isEmpty());
        intList.ensureCapacity(12);
        System.out.println(intList.size());
        ArrayList<String> strList2 = new ArrayList<String>();
        strList2.add("Dog");
        strList2.add("Cat");
        strList2.add("Bird");
        strList.addAll(2, strList2);
        System.out.println(strList);


    }

    public static double divideDoubles(ArrayList<Double> list, int idx1, int idx2) {
        double quotient = list.get(idx1) / list.get(idx2);
        list.set(idx2, quotient); // replaces the dividend with the quotient
        return quotient;
    }
}

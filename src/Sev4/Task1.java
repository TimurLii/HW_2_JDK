package Sev4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<String> manName = new ArrayList<>(Arrays.asList("Timur", "Alex", "Jon","Dasha", "Elena", "Don","Timur","Dasha"));
        List<String> womenName = new ArrayList<>(Arrays.asList("Dasha", "Elena", "Don"));

        System.out.println(alfabetSort(manName));
        System.out.println(alfabetSort(womenName));
        System.out.println(lengthSort(manName));
        System.out.println(lengthSort(womenName));
        System.out.println(revertSort(manName));
        System.out.println(revertSort(womenName));

    }

    public static List<String> alfabetSort(List<String> list) {
        Collections.sort(list);
        return list;
    }

    public static List<String> lengthSort(List<String> list) {
        list.sort(Comparator.comparing(String::length));
        return list;
    }
    public static List<String> revertSort(List<String>list){
        Collections.reverse(list);
        return list;
    }
}

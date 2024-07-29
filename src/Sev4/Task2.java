package Sev4;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>(Arrays.asList("Timur", "Alex", "Jon",
                "Dasha", "Elena", "Don", "Timur", "Dasha"));

        System.out.println(name);
        Set<String> set = getSet(name);
        System.out.println(minEl(name));
        System.out.println(maxEl(name));
        removeEl(set, "A");
        System.out.println(set);
    }

    public static Set<String> getSet(List<String> list) {
        Set<String> newName = new HashSet<>(list);
        return newName;
    }

    public static String minEl(List<String> list) {
//        list.sort(Comparator.comparing(String::length));
//        return list.getFirst();
        return list.stream().min(Comparator.comparing(String::length)).orElse(null);
    }

    public static String maxEl(List<String> list) {
//        list.sort(Comparator.comparing(String::length));
//        return list.getLast();
        return list.stream().max(Comparator.comparing(String::length)).orElse(null);
    }

    public static boolean removeEl(@NotNull Set<String> names, String s) {
        return  names.removeIf(name -> name.contains(s));

    }

}

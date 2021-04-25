package ua.com.jon.prog.session1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};
        List<Integer> list = Arrays.asList(1,2,3);

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "1");
        map.put(14, "1");
        map.put(24, "1");
        map.entrySet();


        System.out.println(map.get(24));

        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(map);
    }
}

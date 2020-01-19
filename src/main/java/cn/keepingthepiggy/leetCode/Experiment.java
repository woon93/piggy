package cn.keepingthepiggy.leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Experiment {
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        List<Integer> nextList = new ArrayList<>();
        nextList.add(1);
        nextList.add(2);
        nextList.add(3);
        System.out.println("开始: " + nextList);

        List<Integer> newList =  nextList.subList(1,nextList.size());
        System.out.println("结束: " + nextList);
        System.out.println("结束: " + newList);

//        Map<Character, List<Integer>> map = new HashMap();
//        map.put('a', new ArrayList<Integer>() );
//        map.put('b',new ArrayList<Integer>());
//        System.out.println("开始: " + map.toString());
////        map.put('a',map.get('a').add(2));
//        System.out.println("结束: " + map.toString());


//        StringBuilder str = new StringBuilder("333");
//        System.out.println("开始: " + str.toString());
//        str = null;
//        t1(str);
//        System.out.println("结束: " + str.toString());

//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 99999999; i++) {
//            sb.append("a");
//        }
//        String s = sb.toString();
//        System.out.println("开始比较");
//        /****************toCharArray遍历*************/
//        long start1 = System.currentTimeMillis();
//        char[] arr = s.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            char c = arr[i];
////            System.out.println(c);
//        }
//        long end1 = System.currentTimeMillis();
//        /****************charAt遍历******************/
//        long start2 = System.currentTimeMillis();
//        for(int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
////            System.out.println(c);
//        }
//        long end2 = System.currentTimeMillis();
//
//        System.out.println("toCharArray遍历: " + (end1 - start1));  //503
//        System.out.println("charAt遍历: " + (end2 - start2));  //453
    }


    private static void t1(StringBuilder str){
        str.append("666");
    }
}

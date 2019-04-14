package org.eu.qiao;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        System.out.println(10^10^11^13^12^12^13);
/*        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter();
        bufferedWriter.write();

        BufferedReader bufferedReader = new BufferedReader();
        bufferedReader.read();*/


/*
        ExecutorService pool = Executors.newCachedThreadPool();


        FutureTask<String> ft = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "456";
            }
        });
        pool.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "123";
            }
        });


        pool.submit(ft);
        try {
            System.out.println(ft.get());
            System.out.println(ft.isDone());

            ft.cancel(false);
            System.out.println(ft.isCancelled());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        pool.shutdown();
*/



/*        pool.execute(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1");
                }
            }
        });*/

/*
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2");
                }
            }
        }).start();//开启线程
*/


/*
        System.out.println(15&7);
        System.out.println(2<<2);
*/


//        System.out.println(Integer.reverse(10));
/*

        System.out.println('a'-10);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(list);
*/



/*        List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        Collections.reverse(stooges);
        System.out.println(stooges);

        int[] h = { 1, 2, 3, 3, 3, 3, 6, 6, 6, };
        int i[] = Arrays.copyOf(h, 6);
        System.out.println(i.length);

        ArrayList<Integer> m = new ArrayList<>();
        m.add(-1);        m.add(-10);
        m.add(-100);
        m.add(-1001);
        Collections.reverse(m);
        System.out.println(m);*/
        // write your code here
        //必须true or false
/*        if (true) {
            System.out.println(Boolean.valueOf(true));
            System.out.println(Integer.toBinaryString(7));
            System.out.println(Integer.toBinaryString(2));
            System.out.println(Integer.toBinaryString(1^7));
            System.out.println(Integer.toBinaryString(-1>>>10));
        }*/

/*        String s;
        s = "";
        System.out.println(s == null);*/


/*        HashSet s = new HashSet();
        s.add("hello");
        System.out.println(s.contains("hello"));*/

/*        Pattern p = Pattern.compile("a.*a");
        Matcher m = p.matcher("abcdea");

        while (m.find()){

            System.out.println(m.group());
        }*/
    }
}

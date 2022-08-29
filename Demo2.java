package Demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86178
 * Date: 2022-07-23
 * Time: 22:36
 */


public class Demo2 {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;

        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));


    }
    public static void main7(String[] args) {
        ArrayList<String>list2 = new ArrayList<>();
        list2.add("hellow");
        list2.add("bit");
        list2.add("hh");
        ListIterator<String> it = list2.listIterator();
        while (it.hasNext()){//首先迭代出集合中所有元素,才能删除.
            String ret = it.next();//迭代出所有元素
            if (ret.equals("hellow")){
                it.add("liuliu");
            }else {
                System.out.println(ret + "");
            }
        }
        System.out.println(list2);
    }
    public static void main6(String[] args) {
        ArrayList<String>list2 = new ArrayList<>();
        list2.add("hellow");
        list2.add("bit");
        list2.add("hh");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()){//首先迭代出集合中所有元素,才能删除.
            String ret = it.next();//迭代出所有元素
            if (ret.equals("hello")){
                it.remove();
            }else {
                System.out.println(it.next() + "");
            }
        }
    }
    public static void main5(String[] args) {
        ArrayList<String>list2 = new ArrayList<>();
        list2.add("hh");
        list2.add("biy");
        System.out.println(list2);
        System.out.println("=============================");
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("=============================");
        for (String s:list2) {
            System.out.println();
        }
        System.out.println("=============================");
        Iterator<String> it = list2.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+"");
        }
        System.out.println("=============================");
        ListIterator<String> it2 = list2.listIterator();
        while (it2.hasNext()){
            System.out.println(it2.next()+"");
        }
    }
    public static void main4(String[] args) {
        Double a = 12.78;
        Double b = 12.78;
        System.out.println(a==b);
        System.out.println("===========================");
        Boolean i = true;
        Boolean j = true;
        System.out.println(i==j);



    }
    public static void main3(String[] args) {//打印1-100之间的所有素数
        for (int j = 1; j <= 100; j++) {
            int i = 0;
            for (i = 2; i < j; i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if(i==j){
                System.out.println(j);
            }
        }
    }

    public static void main2(String[] args) {//输出润年
        for (int i = 1000; i <=2000 ; i++) {
            if(i%400==0||((i%4==0)&&(i%100!=0))){
                System.out.print(i+" ");
            }
        }


    }

    public static void main1(String[] args) {//编写程序数一下 1到 100 的所有整数中出现多少个数字9
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if(i%10==9||i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }

   /* public static int a;
    public static void main(String[] args) {
       *//* char ch = '呵';
        System.out.println(ch);
        System.out.println(Integer.MIN_VALUE);*//*
        *//*System.out.println("/\"hello/\"");*//*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();*/

    }
    /*long factorial(int N) {
        return N < 2 ? N : factorial(N-1) * N;
    }*/
    /*void bubbleSort(int[] array) {
        for (int end = array.length; end > 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
    }*/
    /*long factorial(int N) {
        return N < 2 ? N : factorial(N-1) * N;
    }*/
    /*int fibonacci(int N) {
        return N < 2 ? N : fibonacci(N-1)+fibonacci(N-2);
    }
*/
    /*int binarySearch(int[] array, int value) {
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end) {
            int mid = begin + ((end - begin) / 2);
            if (array[mid] < value)
                begin = mid + 1;
            else if (array[mid] > value)
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }*/
    /*void bubbleSort(int[] array) {
        for (int end = array.length; end > 0; end--) {
            boolean sorted = true;
            for (int i = 1; i < end; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
    }*/
    /*void func4(int N) {
        int count = 0;
        for (int k = 0; k < 100; k++) {
            count++;
        }
        System.out.println(count);
    }*/
    /*void func3(int N, int M) {
        int count = 0;
        for (int k = 0; k < M; k++) {
            count++;
        }
        for (int k = 0; k < N ; k++) {
            count++;
        }
        System.out.println(count);
    }*/
    /*void func2(int N) {
        int count = 0;
        for (int k = 0; k < 2 * N ; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }*/
    // 请计算一下func1基本操作执行了多少次？
    /*void func1(int N) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count++;
            }
        }
        for (int k = 0; k < 2 * N; k++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);*/



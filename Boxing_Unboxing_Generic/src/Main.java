import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*class Point<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Point " + value;
    }
}*/

class Test {
    public <K,V> void myFunc(K x, V y) {

    }
}

interface MyInterface<T> {
boolean test(T t);
}
class Point<T, K> {
    private T value;
    private K value2;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public K getValue2() {
        return value2;
    }

    public void setValue2(K value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Point " + value + " " + value2;
    }
}

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*public static int sum(int a, int b) {
        return a + b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }*/
   /* public static int sum(Object a, Object b) {
        int aVal = (int) a;
        int bVal = (int) b;
        return aVal + bVal;
    }*/

    public static void foo1() throws Exception {
        foo2();
    }
    public static void foo2() throws Exception {
        foo3();
    }
    public static void foo3() throws Exception {
        throw new RuntimeException("Test");
    }

    public static int test() {
        int a = 0;
        int b = a++;
        int c = 40;

        try {
            return a;
        } catch (Exception e) {
            return b;
        } finally {
            System.out.println("finally");
            return c;
        }
    }

    public static void main(String[] args) {

        System.out.println(test());

       /* try {
            foo1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        /*try {
            throw  new Exception("Error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/

        /*int a = 0;
        int b = 10;
        boolean c = true;

        try {
            if (c) {
                a *= b;
                System.out.println(a/b);
                int[ ] arr = new int[10];
                System.out.println(arr[500]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }*/

       /*int[] arr = new int[5];
       int c = 0;

       try {
           for (int i = -3; i < 3; i++) {
               try {
                   arr[c] = 100/i;
                   System.out.println("arr[" + c + "] = 100 / " + i + " = " + arr[c]);
                   c++;
               } catch (ArrayIndexOutOfBoundsException e) {
                   System.out.println("Inner catch " + e.getMessage());
               }
               System.out.println(c);
           }
       } catch (ArithmeticException ex) {
           System.out.println("Outer catch " + ex.getMessage());
       }*/


        /*int a = 16;
        int b = 0;
        int res = 0;

        System.out.println(1);
        try {
            res = a / b;
            System.out.println(2);
        } catch (ArithmeticException e) {
            System.out.println(3);
            System.out.println(e.getMessage());
        } finally {
            System.out.println(4);
        }
        System.out.println(5);*/

        /*try {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            int a = Integer.parseInt(line);
            System.out.println(a);
        } catch (Exception n) {
            System.out.println(n.getMessage());
        }*/

        /*int a = 1;
        System.out.println(a++ - ++a);*/

//        MyInterface myInterface = t->t.equals("test");

        /*Test test = new Test();
        test.myFunc(1, "2");*/


        /*Point<Integer, String> point = new Point<>();
        point.setValue(10);
        System.out.println(point.getValue());*/

        /*System.out.println(sum(10, 20));
        System.out.println(sum(10.5, 20.5));*/

        /*int a = 5;
        Integer b = new Integer(a); // boxing
        Integer c = a;
        int z = c.intValue(); // unboxing
        int d = c; // auto-unboxing*/

//        List<Integer> arr = new ArrayList<>();

        }
    }

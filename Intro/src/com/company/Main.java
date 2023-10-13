package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class OuterClass { // Tree
    int a;
    public int b;
    protected int c;
    private int d;
    static int e;


    public InnerClass getInner() {
        return new InnerClass();
    }

    //    public void localTest(){
//        LocalClass localClass = new LocalClass();
//    }
//
    public void test() {
        InnerClass innerClass = new InnerClass();
        innerClass.a2 = 1;
        innerClass.b2 = 1;
        innerClass.c2 = 1;
        innerClass.d2 = 1;


        NestedClass nestedClass = new NestedClass();
        nestedClass.a3 = 1;
        nestedClass.b3 = 1;
        nestedClass.c3 = 1;
        nestedClass.d3 = 1;


        class LocalClass {
            public void test2() {
                a = 1;
                b = 1;
                c = 1;
                d = 1;
                test();
            }
        }

        LocalClass localClass = new LocalClass();
    }


    class InnerClass { //Node
        int a2;
        public int b2;
        protected int c2;
        private int d2;
        // static int e2 ;


        public void testOuterClass() {
            this.a2 = 1;
            this.b2 = 1;
            this.c2 = 1;
            this.d2 = 1;

            a = 1;
            b = 1;
            c = 1;
            d = 1;

            test();
        }
    }

    static class NestedClass {
        int a3;
        public int b3;
        protected int c3;
        private int d3;
        static int e3;

        public void testOuterClass() {
            this.a3 = 1;
            this.b3 = 1;
            this.c3 = 1;
            this.d3 = 1;

            e = 1;
        }
    }
}


abstract class AbstractClass {
    int a;

    abstract void test();
}

interface Testable {
    void test();
}

@FunctionalInterface
interface Compareable {
    int compare(String a, String b);
}

public class Main {

    public  static int sumAll(List<Integer> numbers, Predicate<Integer> predicate){
        int total = 0;

        for (int num:numbers ) {
            if (predicate.test(num)){
                total+=num;
            }

        }

        return total;
    }

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

//        System.out.println(sumAll(arr, n->n%2!=0));
//        System.out.println(sumAll(arr, n->n==3));
//        System.out.println(sumAll(arr, n->n<3));


//        Compareable compareable = new Compareable() {
//            @Override
//            public int compare(String a, String b) {
//                return 0;
//            }
//
//            @Override
//            public int compare2(String a, String b) {
//                return 0;
//            }
//        };
//

//        Compareable compareable = (String s1, String s2) -> {
//            return s1.compareTo(s2);
//        };
//
//
//        System.out.println(compareable.compare("BBBBB","AAAA"));

//        Person person = new Person();
//        person.pub = 1;
//        person.prot = 1;
//        person.def = 1;

//        Testable testable = new Testable() {
//            @Override
//            public void test() {
//                System.out.println("Ok");
//            }
//        };
//
//        testable.test();


//        Testable testable = ()-> System.out.println("Farid");

//        testable.test();

        /*AbstractClass abstractClass = new AbstractClass() {
            @Override
            void test() {
                System.out.println("Test");
            }
        };

        abstractClass.test();*/


//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.getInner();
//        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
//        LocalClass localClass = new LocalClass();

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println(scanner.nextLine());

//        Person person = new Person();
//        Student student = new Student();
//        Student student1 = new Student();
//        Student student2 = new Student();


//        List<Integer> integers = new ArrayList<>();
//        List<Double> integers = new ArrayList<>();


//        int[] arr = new int[10];
//        int arr2[] = new int[10];
//       int arr3[] = {1,2,3,4,5};
//       int arr4[] = new int[]{1,2,3,4,5,6};


        //   int[][] arr = {{1,2,3},{1,2,3},{1,3,4,5}};

//        System.out.println(1);
//        for ( ;  ;  ) {
//            System.out.println(2);
//        }
//        System.out.println(3);


//        int index = 0;
//        boolean b = true;

//
//        do {
//            if (b) {
//                index--;
//                System.out.println(index);
//            } else {
//                index++;
//
//            }
//            b = !b;
//        } while (index < 10);


//        char c = 'w';
//
//        System.out.println(1);
//        switch (c){
//            case 'w' :
//                System.out.println("s");
//                break;
//            case 's' :
//                System.out.println("W");
//                break;
//            case 'd' :
//                System.out.println("d");
//                break;
//            case 'z' :
//                System.out.println("z");
//                break;
//            default:
//                System.out.println("default");
//        }
//        System.out.println(2);


//        int x = 2;
//
//        if (true){
//            System.out.println(1);
//        }else if(true) {
//            System.out.println(2);
//        }else if (true){
//            System.out.println(3);
//        }
//        System.out.println(x);


//int x = 5;
//if (x++>10 && ++x<0);
//
//        System.out.println(x);

//
//        int x =10;
//        boolean b = true;
//
//        if (!b==false || ++x>1){
//            System.out.println("Da");
//        }else{
//            System.out.println("Net");
//        }
//
//        System.out.println(x);


//            Integer x;
//            Short x;
//            Double x;
//            Boolean x;
//            Integer x;
//            Character x;
//            Float x;

//        List<int> arr = new ArrayList<>();
//        List<Integer> arr = new ArrayList<>();
//        List<int> arr = new List<int>;

        /*
        boolean
        byte - 128 127 ( 1 byte)
        short -32k 32k (2 byte)
        int (-2mlr 2mlrd) (4 byte)
        long  (-xxxx xxxx) (8 byte)
        double
        float
        char
         */
//        int  x = 0x6f;
//        int y = 010;
//        final int COUNT = 0;
//        int x = 001001;

//        int x = 1_000_000;
//
//        System.out.println(x);

//        byte a = 1;
//        long z = 1;


//        double d = 1.3;
//        float f = 1.4f;


//        System.out.println("sssssss" +
//                "ssssssssssssss" +
//                "ssssssssssss" +
//                "ssssssssssssssssss" +
//                "ssssssssssss" +
//                "ssssssssssss");


//        String str = """
//                a
//                a
//                a
//                a
//                """;

//        int x , y ,z;
//        x = y = z =10;
//        String str = "Farid";


//        final int a = 10;
//
//        a = 20;

        //  var f = 10;


        /*dddd
         * d
         * d
         * d
         * d
         * d
         * dd
         * */
//
//
//        ssss
//                s
//                ss
//                        s
//                        s
//        shorts
//                s
//                ss
//
        //ctrl + l
//        shorts
//                s
//                ss
//aaa
//        System.out.print("Hello \n");
//        System.out.print("Hello \t");
//        System.out.print("Hello");
//        System.out.print("Hello");
//        for (int i = 0; i < args.length; i++) {
//            System.out.print(args[i]);
//        }
    }
}
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Person {
     String name;
     String lastname;
     int age;
     String fatherName;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public Person setLastname(String surname) {
        this.lastname = surname;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Person setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    @Override
    public String toString() {
        return name + " " + lastname + " "  + fatherName + " " + age;
    }
}

public class Main {
    public static void main(String[] args) {

       /* Person person = new Person().setName("Vladimir") // pattern builder
                                    .setFatherName("Vladimirovich")
                                    .setLastname("Vinnik")
                                    .setAge(41);
        System.out.println(person);*/

        //1 Создание стрима из значений
        /*Stream<String> stringStreamValues = Stream.of("a1", "a2", "a3");
        System.out.println(stringStreamValues.collect(Collectors.toList()));*/

        //2 Создание стрима из массива
        /*String[] array = {"a1", "a2", "a3"};
        Stream<String> stringStreamArray = Stream.of(array);
        System.out.println(stringStreamArray.collect(Collectors.toList()));*/

        //3 Создание стрима из коллекции
        /*List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        Stream<String> stringStreamCollection = list.stream();
        System.out.println(stringStreamCollection.collect(Collectors.toList()));*/

        //4 Создание стрима из файла
//        file.deleteOnExit();
        /*try {
            File file = new File("data.txt");
            file.createNewFile();
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("a1");
            printWriter.println("a2");
            printWriter.println("a3");
            printWriter.close();
            System.out.println(file.getAbsolutePath());

            Stream<String> streamFromFile = Files.lines(Paths.get(file.getAbsolutePath()));
            System.out.println(streamFromFile.collect(Collectors.toList()));

        } catch (FileNotFoundException e) {

        } catch (IOException e) {

        }*/

        //5 Создание стрима из из строки чисел
        /*IntStream streamFromStringInt = "123abc".chars();
        streamFromStringInt.forEach(e -> System.out.print(e + " "));*/

        //6 Создание стрима из builder
        /*Stream.Builder<String> builder = Stream.builder();
        Stream<String> sStreamFromBuilder = builder.add("Vladimir").add("Oleq").add("Sawa").build();
        System.out.println(sStreamFromBuilder.collect(Collectors.toList()));*/

        //7 Создание бесконечного стрима через iterate
        /*Stream<Integer> streamFromIterate = Stream.iterate(10, i -> i * 2);
        System.out.println(streamFromIterate.limit(20).collect(Collectors.toList()));*/

        //8 Создание бесконечного стрима через generate
        /*Random random = new Random();
        Stream<Integer> streamFromIterate = Stream.generate(() -> random.nextInt(100));
        System.out.println(streamFromIterate.limit(20).collect(Collectors.toList()));*/

        //9 Создание пустого стрима
        /*Stream<String> emptyStream = Stream.empty();
        System.out.println(emptyStream.collect(Collectors.toList()));*/
    }
}
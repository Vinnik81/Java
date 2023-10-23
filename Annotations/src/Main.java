import java.lang.annotation.*;

@ClassPreamble(
        author = "Ivan Ivanov",
        date = "21.10.2023",
        reviewers = {"Oleq Cerkasov", "Farid Abdullaev"})
class SomeClass {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Mammals.class)
@interface Mammal {
    String sound();
    int color() default 0xffffff;
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Mammals {
    Mammal[] value();
}

//@GET("api/home")

@Mammal(sound = "Meow", color = 0x551155)
@Mammal(sound = "myau" , color = 0x223343)
@Mammal(sound = "myu" , color = 0x937149)
@Deprecated
class Cat {

}

public class Main {
    public static void main(String[] args) {
    Cat cat = new Cat();
    Class catClass = cat.getClass();
        Annotation[] annotations = catClass.getAnnotations();

        for (int i = 0; i < annotations.length; i++) {
            System.out.println(annotations[i].annotationType().getSimpleName());
            if (annotations[i] instanceof Mammals) {
                Mammals mammals = (Mammals) annotations[i];
                for (Mammal m : mammals.value()) {
                    Mammal mammal = (Mammal) m;
                    System.out.println(mammal.sound());
                    System.out.println(mammal.color());
                }
            }
        }
    }
}
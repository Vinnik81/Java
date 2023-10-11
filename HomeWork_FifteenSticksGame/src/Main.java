import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Игра 15 палочек");

    System.out.println("Выберите режим игры");
    System.out.println("1. ЧЕЛОВЕК VS ЧЕЛОВЕК");
    System.out.println("2. ЧЕЛОВЕК VS КОМПЬЮТЕР");

    int mode = scanner.nextInt();

    if (mode == 1) {
        IStartGame humanVsHuman = new HumanVsHuman();
        humanVsHuman.start();
    } else if (mode == 2) {
        IStartGame humanVsComputer = new HumanVSComputer();
        humanVsComputer.start();
      } else {
        System.out.println("Неверное значение");
    }
    }
}

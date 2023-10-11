import java.util.Scanner;

public class HumanVSComputer implements IStartGame {
    Scanner scanner = new Scanner(System.in);
    private int sticks = 15;

    public HumanVSComputer() { }

    public void start() {
        System.out.println("Количество палочек: " + sticks);

        while (sticks > 0) {
            draw();

            System.out.println("Ход игрока");
            int playerSticks = scanner.nextInt();

            if (playerSticks < 1 || playerSticks > 3) {
                System.out.println("Неверное количество палочек. Поробуйте снова.");
                continue;
            }

            sticks -= playerSticks;
            System.out.println("Количество оставшихся палочек: " + sticks);

            if (sticks <= 1) {
                System.out.println("Игрок победил!");
                break;
            }

            draw();
            int computerSticks = (int) (Math.random() * 3) + 1;
            System.out.println("Ход компьютера: " + computerSticks);

           sticks -= computerSticks;
            System.out.println("Количество оставшихся палочек: " + sticks);

            if (sticks <= 1) {
                System.out.println("Компьютер победил!");
                break;
            }
        }
    }

    private void draw() {
        for (int i = sticks; i >= 1; i--)
            System.out.print('|');
        System.out.println();
    }
}

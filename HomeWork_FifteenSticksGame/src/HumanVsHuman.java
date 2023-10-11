import java.util.Scanner;

public class HumanVsHuman implements IStartGame {
    Scanner scanner = new Scanner(System.in);
    private int sticks = 15;

    public HumanVsHuman() { }

    public void start() {
        System.out.println("Количество палочек: " + sticks);

        while (sticks > 0) {
            draw();
            System.out.println("Ход игрока 1");
            int player1Sticks = scanner.nextInt();

            if (player1Sticks < 1 || player1Sticks > 3) {
                System.out.println("Неверное количество палочек. Ппоробуйте снова.");
                continue;
            }

            sticks -= player1Sticks;
            System.out.println("Количество оставшихся палочек: " + sticks);

            if (sticks <= 1) {
                System.out.println("Игрок 1 победил!");
                break;
            }

            draw();
            System.out.println("Ход игрока 2");
            int player2Sticks = scanner.nextInt();

            if (player2Sticks < 1 || player2Sticks > 3) {
                System.out.println("Неверное количество палочек. Ппоробуйте снова.");
                continue;
            }

            sticks -= player2Sticks;
            System.out.println("Количество оставшихся палочек: " + sticks);

            if (sticks <= 1) {
                System.out.println("Игрок 2 победил!");
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

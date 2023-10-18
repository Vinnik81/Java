enum Color {
    RED, GREEN, BLUE
}

enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
}

/*
final class SeasonClass {
    public static final SeasonClass SPRING = new SeasonClass("SPRING");
    public static final SeasonClass SUMMER = new SeasonClass("SUMMER");
    public static final SeasonClass AUTUMN = new SeasonClass("AUTUMN");
    public static final SeasonClass WINTER = new SeasonClass("WINTER");
    private String name;
    private int value;
    private static int index = 0;
    private SeasonClass(String name) {
        this.name = name;
        value = SeasonClass.index++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
*/

class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

interface Movable {
    void speed();
}

enum Direction implements Movable {
    UP( 0, -1) {
        @Override
        public Direction opposite() {
            return DOWN;
        }
    }, DOWN(0, 1) {
        @Override
        public Direction opposite() {
            return UP;
        }
    }, LEFT(-1, 0) {
        @Override
        public Direction opposite() {
            return RIGHT;
        }
    }, RIGHT(1, 0) {
        @Override
        public Direction opposite() {
            return LEFT;
        }
    };
    private final int xStep, yStep;
    static int stepLength = 1;

    Direction(int xStep, int yStep) {
        this.xStep = xStep;
        this.yStep = yStep;
    }

    public static void setStepLength(int stepLength) {
        if (stepLength > 0) {
            Direction.stepLength = stepLength;
        }
    }

    public void step(Point point) {
        point.x += xStep * stepLength;
        point.y += yStep * stepLength;
    }

    public abstract Direction opposite();

    @Override
    public void speed() {
        System.out.println("Call speed");
    }
}
class Player {
    private Point currentPosition;
    private Direction currentDirection;



    public Player(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    /*public  void move(int direct) {
        switch (direct) {
            case 0: currentPosition.y--;
                break;
            case 1: currentPosition.y++;
                break;
            case 2: currentPosition.x--;
                break;
            case 3: currentPosition.x++;
                break;
        }
    }*/

    public  void move() {
        this.currentDirection.step(this.currentPosition);
    }
    /*public  void move() {
        switch (this.currentDirection) {
            case UP: currentPosition.y--;
                break;
            case DOWN: currentPosition.y++;
                break;
            case LEFT: currentPosition.x--;
                break;
            case RIGHT: currentPosition.x++;
                break;
        }
    }*/
    /*public  void move(Direction direct) {
        switch (direct) {
            case UP: currentPosition.y--;
                break;
            case DOWN: currentPosition.y++;
                break;
            case LEFT: currentPosition.x--;
                break;
            case RIGHT: currentPosition.x++;
                break;
        }
    }*/

    public void opposite() {
        this.currentDirection = this.currentDirection.opposite();
    }

    @Override
    public String toString() {
        return "x: " + this.currentPosition.x + " y: " + this.currentPosition.y;
    }
}

public class Main {
    public static void main(String[] args) {

     Player player = new Player(new Point(5, 5));
     player.setCurrentDirection(Direction.DOWN);
     player.opposite();
     Direction.setStepLength(3);
     player.move();
     player.setCurrentDirection(Direction.RIGHT);
     player.opposite();
     player.move();

        System.out.println(player);

     /*player.move(Direction.UP);
     player.move(Direction.LEFT);*/

//     player.move();

/*SeasonClass seasonClass = SeasonClass.WINTER;

if (seasonClass == SeasonClass.WINTER) {
    seasonClass = SeasonClass.AUTUMN;
}

        System.out.println(seasonClass);*/

//        Season season = Season.AUTUMN;
//        System.out.println(season.ordinal());

/*Color color = Color.BLUE;

switch (color) {
    case RED : {
        System.out.println("RED");
        break;
    }
    case GREEN : {
        System.out.println("GREEN");
        break;
    }
    case BLUE : {
        System.out.println("BLUE");
        break;
    }
    default : {
        System.out.println("UNKNOWN");
    }*/


/*
switch (color) {
    case RED -> System.out.println("RED");
    case GREEN -> System.out.println("GREEN");
    case BLUE -> System.out.println("BLUE");
    default -> System.out.println("UNKNOWN");
}
*/

/*if (color == Color.BLUE) {
    color = Color.GREEN;
}*/
    }
}
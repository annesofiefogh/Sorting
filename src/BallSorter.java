import java.util.Arrays;

public class BallSorter {

    public void start() {
        Ball[] balls = new Ball[10];
        for(int i=0; i < balls.length; i++) {
            balls[i] = new Ball();
        }

        System.out.println("Før sortering: " + Arrays.toString(balls));
        //Kan bruge Arrays.sort is stedet for Quicksort da Comparable er blevet implementeret i klassen Ball
        //Kan lade sig gøre fordi comparable indeholder arrays.sort
        Arrays.sort(balls);
        System.out.println("Efter sortering: " + Arrays.toString(balls));
    }

    public static void main(String[] args) {
        BallSorter app = new BallSorter();
        app.start();
    }
}

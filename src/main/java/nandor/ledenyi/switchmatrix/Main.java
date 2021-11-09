package nandor.ledenyi.switchmatrix;

import java.time.LocalTime;
import java.util.Random;

public class Main {

    static int steps = 0;

    public static void main(String[] args) {
        SwitchMatrix switchMatrix = new SwitchMatrix(6);
        Random random = new Random();
        switchMatrix.randomize();
        System.out.println(switchMatrix);

        while (!switchMatrix.isSolved()) {
            switchMatrix.toggle(random.nextInt(6), random.nextInt(6));
            System.out.println(switchMatrix);
            steps++;
        }
        System.out.println("Required steps: " + steps);
    }

    public static void status() {
        System.out.println("Actual local time: " + LocalTime.now());
        System.out.println("Steps taken: " + steps);
        System.out.println();
    }
}

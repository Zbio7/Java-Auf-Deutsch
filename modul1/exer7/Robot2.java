package exer7;

public class Robot2 {
    boolean hasTask;
    boolean batteryEmpty;
    int taskCounter;

    void helpDuke() {
        if (!hasTask) {
            System.out.println("Ich hab gerade nichts zu tun.");
        } else if (batteryEmpty) {
            batteryEmpty = false;
            System.out.println("Ich lade meine Batterie.");
        } else if (taskCounter == 3) {
            taskCounter = 0;
            System.out.println("Duke! Ich brauch Mal ne Pause... Frag mich später nochmal!");
        } else {
            taskCounter++;
            System.out.println("Das erledige ich gern für dich.");
        }
    }
}
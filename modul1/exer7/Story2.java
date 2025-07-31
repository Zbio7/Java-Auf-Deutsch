package exer7;

class Story2 {
    public static void main(String[] args) {
        Robot2 robin = new Robot2();

        robin.hasTask = false;
        robin.batteryEmpty = false;
        robin.taskCounter = 0;

        robin.helpDuke(); // Ich hab gerade nichts zu tun.

        robin.hasTask = true;
        robin.helpDuke(); // Das erledige ich gern für dich.
        robin.helpDuke(); // Das erledige ich gern für dich.

        robin.batteryEmpty = true;
        robin.helpDuke(); // Ich lade meine Batterie.

        robin.helpDuke(); // Das erledige ich gern für dich.
        robin.helpDuke(); // Duke! Ich brauch Mal ne Pause...
        robin.helpDuke(); // Das erledige ich gern für dich.
        robin.helpDuke(); // Das erledige ich gern für dich.
    }
}
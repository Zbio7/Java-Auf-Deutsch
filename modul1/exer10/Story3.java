package exer10;

public class Story3 {


    public static void main(String[] args) {
        ReplacementPart screw = new ReplacementPart("screw", "grau", 5);
        System.out.println("screw angelegt mit den Attributen type: " + screw.type + ", color: " + screw.color  + ", size: " + screw.size);
        ReplacementPart display = new ReplacementPart("display", "multicolor", 100);
        System.out.println("display angelegt mit den Attributen type: " + display.type + ", color: " + display.color  + ", size: " + display.size);
    }

}
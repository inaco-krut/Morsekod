import java.util.Scanner;

public class MainKlass {
    public static void main(String[] args) {
        System.out.println("Välj 1 eller 2");
        Scanner scn = new Scanner(System.in);
        String menuChoice = scn.nextLine();

        switch (menuChoice) {
                case "1":
                    System.out.println("Skriv en text för att konvertera till morse");
                    ConvertToMorse textTillMorse = new ConvertToMorse();
                    System.out.println(textTillMorse);
                case "2":
                    System.out.println("Skriv ett morseord för att konvertera till engelska");
                    ConvertToText morseTillText = new ConvertToText();
                    System.out.println(morseTillText);
                default:
                    System.err.println("error, fel inmatning");
        }
    }
}



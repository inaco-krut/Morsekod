import java.util.Scanner;

public class MainKlass {

    public static void main(String[] args) {

            System.out.println("press 1 to convert from text to morse\npress 2 to convert from morse to English");
            Scanner scn = new Scanner(System.in);
            String menuChoice = scn.nextLine();

            switch (menuChoice) {
                case "1":
                    System.out.println("Write the text you would like to convert");
                    ConvertToMorse textTillMorse = new ConvertToMorse();
                    System.out.println(textTillMorse);
                case "2":
                    System.out.println("Write the morse code that you would like to convert to English, add spaces between each morse code");
                    ConvertToText morseTillText = new ConvertToText();
                    System.out.println(morseTillText.getConverterToText(scn.nextLine()));
                    break;
                default:
                    System.err.println("error, enter the correct value");
            }
        }
    }

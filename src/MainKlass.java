import java.util.Scanner;

public class MainKlass {
    public static void main(String[] args) {
try {

        while (true) {
            System.out.println("press 1 to convert from text to morse\npress 2 to convert from morse to English");
                Scanner meny = new Scanner(System.in);
                int menuChoice = meny.nextInt();

                switch (menuChoice) {
                    case 1:
                        System.out.println("Write the text you want to translate");
                        ConvertToMorse textTillMorse = new ConvertToMorse();
                        System.out.println(textTillMorse);
                    case 2:
                        System.out.println("Write the morse code you want to translate, add a space between each morse code");
                        ConvertToText MorseTillText = new ConvertToText();
                        Scanner scn = new Scanner(System.in);
                        System.out.println(MorseTillText.getConverterToText(scn.nextLine()));
                        break;
                        default:
                        System.out.println("not an option, try again");
                    }
                }
            }catch (Exception e){
                System.out.println("wrong character, use 1 or 2");
        }
    }
}
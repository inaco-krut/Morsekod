import java.util.HashMap;
import java.util.Scanner;

public class ConvertToMorse {
        HashMap<Character, String> converter = new HashMap<>();

    public ConvertToMorse() {
        converter.put('a', ".-  ");
        converter.put('b', "-...  ");
        converter.put('c', "-.-.  ");
        converter.put('d', "-..  ");
        converter.put('e', ".  ");
        converter.put('f', "..-.  ");
        converter.put('g', "--.  ");
        converter.put('h', "....  ");
        converter.put('i', "..  ");
        converter.put('j', ".---  ");
        converter.put('k', "-.-  ");
        converter.put('l', ".-..  ");
        converter.put('m', "--  ");
        converter.put('n', "-.  ");
        converter.put('o', "---  ");
        converter.put('p', ".--.  ");
        converter.put('q', "--.-  ");
        converter.put('r', ".-.  ");
        converter.put('s', "...  ");
        converter.put('t', "-  ");
        converter.put('u', "..-  ");
        converter.put('v', "...-  ");
        converter.put('w', ".--  ");
        converter.put('x', "-..-  ");
        converter.put('y', "-.--  ");
        converter.put('z', "--..  ");
        converter.put('1', ".----  ");
        converter.put('2', "..---  ");
        converter.put('3', "...--  ");
        converter.put('4', "....-  ");
        converter.put('5', ".....  ");
        converter.put('6', "-....  ");
        converter.put('7', "--...  ");
        converter.put('8', "---..  ");
        converter.put('9', "----.  ");
        converter.put('0', "-----  ");
        converter.put('.', ".-.-.-  ");
        converter.put(',', "--..--  ");
        converter.put('?', "..--..  ");
        converter.put(' ', " ");

        {
            Scanner scn = new Scanner(System.in);
            String input = scn.nextLine().toLowerCase();
            int i = 0;
            while (i < input.length()) {
                System.out.print(converter.get(input.charAt(i)));
                i++;

            }
        }System.exit(0);
    }
}
package birthday;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static Set<String> history = new HashSet<>();

    private static Scanner scannerCommand = new Scanner(System.in);

    private static String result;

    public static void main(String[] args) {

        scan();

    }

    private static void check() {

        if (result.equals("birthday")) {
            System.out.println("23.05.1995");
            scan();
        } else if (result.equals("age")) {
            System.out.println(21);
            scan();
        } else if (result.equals("exit")) {
            System.out.println("bye, see you");
            scannerCommand.close();
        } else if (result.equals("history")) {
            printHistory();
            scan();
        } else {
            System.out.println("command not found");
            scan();
        }
    }

    private static void printHistory() {

        history.forEach(System.out::println);
    }

    private static void scan() {
        result = scannerCommand.next();
        history.add("* " + result);
        check();
    }
}

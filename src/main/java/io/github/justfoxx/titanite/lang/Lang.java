package io.github.justfoxx.titanite.lang;

public class Lang {
    public static void run(String s) {
        Scanner scanner = new Scanner(source);
        List<Token> tokens = scanner.scanTokens();

        for (Token token : tokens) {
            System.out.println(token);
        }
    }
}

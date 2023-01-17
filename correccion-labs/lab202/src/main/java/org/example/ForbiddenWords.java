package org.example;

import java.util.Arrays;

public class ForbiddenWords {

    /// Método con dos loops
    public static boolean findForbiddenWord(String input) {
        String [] forbiddenWords = new String[]{ "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };

        String[] inputArray = input.split(" ");

        for(String s : inputArray){
            for(String s2 : forbiddenWords){
                if (s.equals(s2)) return true;
            }
        }


        return false;

    }

    // Método con un loop

    public static boolean hasForbbidenWord(String input) {
        String[] forbbiden = new String[]{"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};
        for (String wordF :
                forbbiden) {
            if(input.contains(" "+wordF+" ")){
                return true;
            }

        }

        return false;
    }

    // Método con stream

    public static boolean hasForbbidenWord2(String input) {
        String[] forbbiden = new String[]{"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while"};
        for (String wordF :
                forbbiden) {
            if (Arrays.stream(input.split(" ")).map(s -> s.toLowerCase()).toList().contains(wordF)) {
                return true;
            }

        }
        return false;
    }
}

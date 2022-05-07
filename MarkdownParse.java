//https://howtodoinjava.com/java/io/java-read-file-to-string-examples/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParse {

    public static ArrayList<String> getLinks(String markdown) {
        ArrayList<String> toReturn = new ArrayList<>();
        // find the next [, then find the ], then find the (, then read link upto next )
        int currentIndex = 0;
        int iteratingIndex = 0;
        while(currentIndex < markdown.length()) {
            iteratingIndex += 1;
            if (iteratingIndex == markdown.length()) {
                break;
            }
            int openBracket = markdown.indexOf("[", currentIndex);
            if (openBracket > 0) {
                int exclamation = markdown.indexOf("!", currentIndex);
                if (exclamation == openBracket - 1) {
                    break;
                }
            }

            if (openBracket == -1) {
                break;
            }
            
            int closeBracket = markdown.indexOf("]", openBracket);
            int openParen = markdown.indexOf("(", closeBracket);
            if (closeBracket + 1 != openParen) {
                continue;
            }
            int closeParen = markdown.indexOf(")", openParen);
            
            if (currentIndex == closeParen + 1) {
                continue;
            }
            
            boolean endLink = false;
            while (endLink == false) {
                if (markdown.length() == closeParen + 1) {
                    endLink = true;
                }

                else if (markdown.charAt(closeParen + 1) == ')') {
                    closeParen += 1;
                }
                
                else {
                    endLink = true;
                }
            }

            toReturn.add(markdown.substring(openParen + 1, closeParen));
            currentIndex = closeParen + 1;

        }

        return toReturn;
    }

    
    public static void main(String[] args) throws IOException {
        Path fileName = Path.of(args[0]);
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
	    System.out.println(links);
        System.out.println("Lab 4");
    }
}

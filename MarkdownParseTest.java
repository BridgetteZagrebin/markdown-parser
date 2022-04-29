import static org.junit.Assert.*;
import java.beans.Transient;
import java.io.IOException;
import java.util.ArrayList;
import org.junit.*;

import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void markdownParseTest() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test1-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-page.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest2() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test2-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://youtube.com");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest3() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test3-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest4() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test4-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest5() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-thing.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest6() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("https://something.com");
        testList.add("some-page.html");
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest7() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest8() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest9() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest10() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest11() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(testList, links);
    }

    @Test
    public void markdownParseTest12() throws IOException{
        ArrayList<String> testList = new ArrayList<>();
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        testList.add("a link on the first line");
        assertEquals(testList, links);
    }
}
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String input = "main.hs";
        String output = "res.txt";
        try {
            FPParser parser = new FPParser(new CommonTokenStream(new FPLexer(CharStreams.fromFileName(input, StandardCharsets.UTF_8))));
            FPConverterVisitor visitor = new FPConverterVisitor();
            String converterVisitor = visitor.visitProgram(parser.program());
            try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(output), StandardCharsets.UTF_8)) {
                writer.write(converterVisitor);
            } catch (IOException e) {
                System.err.println("Failed to write obfuscation result: " + e.getMessage());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

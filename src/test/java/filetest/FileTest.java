package filetest;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class FileTest {

    @Test
    void testFile() throws IOException {
        File file = new File("/tmp/saad.txt");
        Path path = file.toPath();

        assumeTrue(file.exists());
        assertFalse(Files.isWritable(path));
    }

}



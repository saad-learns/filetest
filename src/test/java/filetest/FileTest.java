package filetest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.AccessMode;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.io.File.createTempFile;
import static org.junit.jupiter.api.Assertions.*;

public class FileTest {

    @TempDir
    File m_tempDir;

    @Test
    void testFile() throws IOException {
        File file = new File("/tmp/saad.txt");
        Path path = file.toPath();

        assertFalse(Files.isWritable(path));
    }

}



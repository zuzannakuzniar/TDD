package Mockito;
import java.util.UUID;

public class FileNameGenerator {

    public String generate() {
        return UUID.randomUUID().toString();
    }
}
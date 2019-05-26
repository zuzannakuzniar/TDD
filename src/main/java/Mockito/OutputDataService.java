package Mockito;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OutputDataService {

    public static final String CHAT_ROOM_FOLDER = "chat";

    public void saveDataToFile(String filename, String message) throws IOException {
        Path chatRoomFolder = Paths.get(CHAT_ROOM_FOLDER);
        if (!Files.exists(chatRoomFolder)) {
            Files.createDirectory(chatRoomFolder);
        }

        Path messageFile = Paths.get(CHAT_ROOM_FOLDER + "/" + filename);

        try(OutputStream outputStream = Files.newOutputStream(messageFile)) {
            outputStream.write(message.getBytes());
        }
    }
}
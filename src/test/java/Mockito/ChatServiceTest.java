package Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ChatServiceTest {

    @Mock
    FileNameGenerator fileNameGenerator;
    @Mock
    InputDataService inputDataService;
    @Mock
    OutputDataService outputDataService;

    @InjectMocks
    ChatService chatService;

    @Test
    void getAndSave() throws IOException {
        // Given
        Mockito.when(fileNameGenerator.generate()).thenReturn("test");
        Mockito.when(inputDataService.readLine()).thenReturn("test");

        // When
        chatService.getAndSave();

        // Then
        Mockito.verify(fileNameGenerator, Mockito.times(1)).generate();
        Mockito.verify(inputDataService, Mockito.times(1)).readLine();
        Mockito.verify(outputDataService, Mockito.times(1)).saveDataToFile(Mockito.eq("test"), Mockito.anyString());
    }
}
package Mockito;

import java.io.IOException;

public class ChatService {

    FileNameGenerator fileNameGenerator;
    InputDataService inputDataService;
    OutputDataService outputDataService;

    public ChatService(FileNameGenerator fileNameGenerator, InputDataService inputDataService, OutputDataService outputDataService) {
        this.fileNameGenerator = fileNameGenerator;
        this.inputDataService = inputDataService;
        this.outputDataService = outputDataService;
    }

    public void getAndSave() throws IOException {
        String message = inputDataService.readLine();
        outputDataService.saveDataToFile(fileNameGenerator.generate(), message);
    }
}
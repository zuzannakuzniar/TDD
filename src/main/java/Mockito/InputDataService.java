package Mockito;

import java.util.Scanner;

public class InputDataService {

    private Scanner scanner;

    public InputDataService(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readLine() {
        return scanner.nextLine();
    }
}

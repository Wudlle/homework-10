import model.Student;
import service.FileService;
import service.StudentServiceImpl;

import java.io.File;

public class Main {
    public static final String URL = "text.txt";

    public static void main(String[] args) throws Exception {
        StudentServiceImpl service = new StudentServiceImpl();
        FileService.writeInFiles(service.convert(FileService.read(URL)));
    }
}


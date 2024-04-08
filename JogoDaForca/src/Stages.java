import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Stages {
    // ascii: https://gist.github.com/chrishorton/8510732aa9a80a03c829b09f12e20d9c?permalink_comment_id=4637411
    public static List<String> getStageAscii(int stage) throws IOException {
        String filePath = "src/stages/stage" + stage + ".txt";
        return Files.readAllLines(Paths.get(filePath));
    }
    public static void printStages(int stage) {
        try {
            switch (stage){
                case 0, 1, 2, 3,4,5,6 -> {
                    getStageAscii(stage).forEach(System.out::println);
                }
                default -> {
                    throw new IOException();
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }


}

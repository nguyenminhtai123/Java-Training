import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exception {
    public int getPlayerScore(String playerFile) {
        Scanner contents;
        try {
            contents = new Scanner(new File(playerFile));
            return Integer.parseInt(contents.nextLine());
        } catch (FileNotFoundException noFile ) {
            logger.warn("File not found, resetting score.");
            return 0;
        } finally {
            try {
                if (contents != null) {
                    contents.close();
                }
            } catch (IOException io) {
                logger.error("Couldn't close the reader!", io);
            }
        }
    }
}

import javax.management.modelmbean.XMLParseException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainCheckedAndUncheckedException {
//    public static void main(String[] args) {
//
//        BufferedReader br = null;
//
//        try {
//
//            String sCurrentLine;
//
//            br = new BufferedReader(new FileReader("C:testing.txt"));
//
//            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (br != null)
//                    br.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//    }

    public static void main(String[] args) {
        try {
            doParseXML();
        } catch (XMLParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void doParseXML() throws XMLParseException, IOException {
        doOpenXML();
        // Do parse XML. This method may be thrown a checked exception
    }

    private static void doOpenXML() throws IOException {
        // Do open XML. This method may be thrown a checked exception
    }
}

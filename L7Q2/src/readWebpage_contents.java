import java.io.*;
import java.net.MalformedURLException;
import java.util.*;
import java.net.URL;
import java.net.URLConnection;
public class readWebpage_contents {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            FileWriter fileCreate = new FileWriter("index.htm");
            BufferedWriter writer = new BufferedWriter(fileCreate);
            while (in.hasNextLine()){
                writer.write(in.nextLine());
                writer.newLine();
            }
            writer.close();
            in.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

import javax.swing.*;
import java.awt.event.*;
import java.io.FileReader;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class JsonButton {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("JSON Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        JButton button = new JButton("Mostrar JSON");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                printJsonInfo();
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    private static void printJsonInfo() {
        try {
            String filePath = "C:\\Users\\eliud\\git\\repository\\src\\archivo.json";
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(new FileReader(filePath));

            System.out.println("Contenido del archivo JSON:");
            System.out.println(json.toJSONString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
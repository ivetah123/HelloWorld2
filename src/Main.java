
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        JFrame frame = new JFrame("Hello, Java!");
        frame.add(new HelloComponent("blaaaaaaa"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}

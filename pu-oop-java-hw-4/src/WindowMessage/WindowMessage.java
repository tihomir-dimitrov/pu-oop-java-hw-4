package WindowMessage;

import javax.swing.*;

public class WindowMessage extends JDialog {

    public WindowMessage(JFrame parent, String title, String message) {
        super(parent, title, true);

        JPanel panel = new JPanel();
        JLabel label = new JLabel(message);
        panel.add(label);
        getContentPane().add(panel);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void render(JFrame parent, String title, String message) {
        new WindowMessage(parent, title, message);
    }

    public static void win(JFrame parent, String title, String message, String s) {
    }
}

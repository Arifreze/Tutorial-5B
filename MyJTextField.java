import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJTextField extends JFrame implements ActionListener {
    private JTextField my_text1 = new JTextField();
    private JTextField my_text2 = new JTextField();

    public MyJTextField() {
        Container pane = getContentPane();
        pane.setBackground(Color.WHITE);
        pane.setLayout(new BorderLayout());
        pane.add(new JLabel("Type something in the 1st text field:"), BorderLayout.NORTH);
        pane.add(my_text1, BorderLayout.CENTER);
        pane.add(my_text2, BorderLayout.SOUTH);
        my_text1.addActionListener(this);
        my_text2.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = my_text1.getText();
        if (input.equals("")) {
            my_text2.setText("You didn't type anything");
        } else {
            my_text2.setText(input);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyJTextField frame = new MyJTextField();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My Frame");
            frame.setSize(350, 120);
            frame.setVisible(true);
        });
    }
}

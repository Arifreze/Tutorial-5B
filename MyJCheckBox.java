import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJCheckBox extends JFrame implements ItemListener {
    private JCheckBox my_box1 = new JCheckBox("Red");
    private JCheckBox my_box2 = new JCheckBox("Green");
    private JCheckBox my_box3 = new JCheckBox("Blue");
    private JLabel selection = new JLabel();

    public MyJCheckBox() {
        Container pane = getContentPane();
        pane.setBackground(Color.WHITE);
        pane.setLayout(new GridLayout(6, 1));
        pane.add(new JLabel("Select your favourite color(s):"));
        pane.add(my_box1);
        pane.add(my_box2);
        pane.add(my_box3);
        my_box1.addItemListener(this);
        my_box2.addItemListener(this);
        my_box3.addItemListener(this);
        pane.add(new JLabel("You have selected:"));
        pane.add(selection);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String input = "";
        if (my_box1.isSelected()) input += " " + my_box1.getText();
        if (my_box2.isSelected()) input += " " + my_box2.getText();
        if (my_box3.isSelected()) input += " " + my_box3.getText();
        selection.setText(input.trim());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyJCheckBox frame = new MyJCheckBox();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My Frame");
            frame.setSize(350, 200);
            frame.setVisible(true);
        });
    }
}

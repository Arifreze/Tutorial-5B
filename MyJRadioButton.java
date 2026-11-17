import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Question 4(a): Modified layout with four radio buttons, including Yellow.
public class MyJRadioButton extends JFrame implements ActionListener {
    private JRadioButton blue = new JRadioButton("Blue");
    private JRadioButton green = new JRadioButton("Green");
    private JRadioButton red = new JRadioButton("Red");
    private JRadioButton yellow = new JRadioButton("Yellow");
    private JLabel selection = new JLabel("You have selected: ", JLabel.CENTER);

    public MyJRadioButton() {
        Container pane = getContentPane();
        pane.setBackground(Color.WHITE);
        pane.setLayout(new BorderLayout());
        JLabel prompt = new JLabel("Select your MOST favourite color:", JLabel.CENTER);
        JPanel choices = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ButtonGroup group = new ButtonGroup();
        for (JRadioButton button : new JRadioButton[]{blue, green, red, yellow}) {
            group.add(button);
            choices.add(button);
            button.addActionListener(this);
        }
        pane.add(prompt, BorderLayout.NORTH);
        pane.add(choices, BorderLayout.CENTER);
        pane.add(selection, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JRadioButton selected = (JRadioButton) e.getSource();
        selection.setText("You have selected: " + selected.getText());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyJRadioButton frame = new MyJRadioButton();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("My Frame");
            frame.setSize(350, 200);
            frame.setVisible(true);
        });
    }
}

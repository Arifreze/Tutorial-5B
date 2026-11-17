import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JTextField textNum1, textNum2, textResult;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public SimpleCalculator() {
        label1 = new JLabel("Simple Calculator");
        label2 = new JLabel("Enter first number:");
        label3 = new JLabel("Enter second number:");
        label4 = new JLabel("Result:");

        textNum1 = new JTextField(10);
        textNum2 = new JTextField(10);
        textResult = new JTextField(10);
        textResult.setEditable(false);

        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        for (JButton button : new JButton[]{addButton, subtractButton, multiplyButton, divideButton}) {
            button.addActionListener(this);
        }

        setLayout(new GridLayout(5, 2, 5, 5));
        add(label1);
        add(new JLabel(""));
        add(label2);
        add(textNum1);
        add(label3);
        add(textNum2);
        add(label4);
        add(textResult);
        JPanel operations = new JPanel(new GridLayout(1, 4, 3, 0));
        operations.add(addButton);
        operations.add(subtractButton);
        operations.add(multiplyButton);
        operations.add(divideButton);
        add(new JLabel(""));
        add(operations);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(textNum1.getText());
            double num2 = Double.parseDouble(textNum2.getText());
            double result;
            Object source = e.getSource();
            if (source == addButton) result = num1 + num2;
            else if (source == subtractButton) result = num1 - num2;
            else if (source == multiplyButton) result = num1 * num2;
            else {
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                    return;
                }
                result = num1 / num2;
            }
            textResult.setText(String.valueOf(result));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleCalculator frame = new SimpleCalculator();
            frame.setTitle("Simple Calculator");
            frame.setSize(380, 220);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}

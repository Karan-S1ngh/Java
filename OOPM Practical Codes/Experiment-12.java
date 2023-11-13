import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScientificCalculator implements ActionListener {
    private JFrame frame;
    private JTextField textField;
    private JLabel equationLabel; // New label for displaying the entire equation
    private double firstNumber, secondNumber, result;
    private String operator;
    private StringBuilder equation; // A StringBuilder to build the equation string

    public ScientificCalculator() {
        frame = new JFrame("Scientific Calculator");
        frame.setLayout(new BorderLayout());

        equation = new StringBuilder(); // Initialize the equation StringBuilder

        textField = new JTextField();
        frame.add(textField, BorderLayout.NORTH);

        equationLabel = new JLabel(""); // Create a label for the equation
        frame.add(equationLabel, BorderLayout.SOUTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4));

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "sqrt", "sin", "cos"
        };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(this);
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ScientificCalculator());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = ((JButton) e.getSource()).getText();

        if (isNumeric(command)) {
            textField.setText(textField.getText() + command);
        } else if (command.equals("=")) {
            secondNumber = Double.parseDouble(textField.getText());
            result = performOperation();

            // Build and display the entire equation
            equation.append(textField.getText()).append(" = ").append(result);
            equationLabel.setText(equation.toString());

            textField.setText(String.valueOf(result));
        } else if (command.equals("C")) {
            textField.setText("");
            equationLabel.setText(""); // Clear the equation label
            equation.setLength(0); // Clear the equation StringBuilder
            firstNumber = secondNumber = result = 0;
            operator = null;
        } else {
            firstNumber = Double.parseDouble(textField.getText());
            operator = command;

            // Build and display the entire equation
            equation.append(textField.getText()).append(" ").append(operator);
            equationLabel.setText(equation.toString());

            textField.setText("");
        }
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private double performOperation() {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                return firstNumber / secondNumber;
            default:
                return secondNumber;
        }
    }
}

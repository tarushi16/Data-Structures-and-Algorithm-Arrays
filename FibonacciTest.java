import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

    public class FibonacciTest extends JFrame {

        private static final long serialVersionUID = 1L;

        private JTextField inputTextField;
        private JLabel outputLabel;
        private JButton generateButton;

        public FibonacciTest() {
            super("Fibonacci Number Generator");

            JPanel panel = new JPanel();

            inputTextField = new JTextField(10);
            panel.add(inputTextField);

            generateButton = new JButton("Generate");
            generateButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int n = Integer.parseInt(inputTextField.getText());
                    int fibonacciNumber = generateFibonacciNumber(n);
                    outputLabel.setText("The Fibonacci number at position " + n + " is " + fibonacciNumber);
                }
            });
            panel.add(generateButton);

            outputLabel = new JLabel();
            panel.add(outputLabel);

            add(panel);

            setSize(300, 200);
            setVisible(true);
        }

        private int generateFibonacciNumber(int n) {
            if (n < 0) {
                throw new IllegalArgumentException("n must be non-negative");
            }

            if (n == 0 || n == 1) {
                return n;
            } else {
                return generateFibonacciNumber(n - 1) + generateFibonacciNumber(n - 2);
            }
        }

        public static void main(String[] args) {
            new FibonacciTest();
        }
    }



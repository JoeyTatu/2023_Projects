import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

public class PasswordGeneratorUI extends JFrame implements ActionListener {

    // Define character sets for password generation
    private static final String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARS = "!@#$%^&*()-_=+[]{}|;:,.<>?";
    private static final String ALL_CHARS = UPPER_CASE + LOWER_CASE + NUMBERS + SPECIAL_CHARS;

    // UI components
    private JTextField lengthField;
    private JButton generateButton;
    private JTextArea passwordArea;

    public PasswordGeneratorUI() {
        setTitle("Password Generator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Components initialization
        lengthField = new JTextField(10);
        generateButton = new JButton("Generate Password");
        generateButton.addActionListener(this);
        passwordArea = new JTextArea(10, 30);
        passwordArea.setEditable(false);
        passwordArea.setLineWrap(true); // Enable word wrap for the password display area
        passwordArea.setWrapStyleWord(true);

        // Layout configuration
        setLayout(new FlowLayout());
        add(new JLabel("Password Length (1-1024):"));
        add(lengthField);
        add(generateButton);
        add(new JScrollPane(passwordArea)); // Add passwordArea inside a JScrollPane for scrolling

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            try {
                int passwordLength = Integer.parseInt(lengthField.getText());

                // Enforce the maximum password length of 1024 characters
                passwordLength = Math.min(passwordLength, 1024);

                String generatedPassword = generatePassword(passwordLength);
                passwordArea.setText(generatedPassword);
            } catch (NumberFormatException ex) {
                passwordArea.setText("Invalid input. Please enter a valid number.");
            }
        }
    }

    // Method to generate a password of the specified length
    private String generatePassword(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Password length must be positive.");
        }

        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        do {
            password.setLength(0); // Clear the StringBuilder before generating a new password

            // Ensure the password starts with a letter
            password.append(getRandomChar(UPPER_CASE, random));
            password.append(getRandomChar(LOWER_CASE, random));

            // Add at least one number and one special character
            password.append(getRandomChar(NUMBERS, random));
            password.append(getRandomChar(SPECIAL_CHARS, random));

            // Generate the remaining characters
            for (int i = 4; i < length; i++) {
                password.append(getRandomChar(ALL_CHARS, random));
            }

            shufflePassword(password, random);
        } while (isInvalidFirstOrLastCharacter(password));

        return password.toString();
    }

    // Method to check if the password starts or ends with a number or special character
    private boolean isInvalidFirstOrLastCharacter(StringBuilder password) {
        char firstChar = password.charAt(0);
        char lastChar = password.charAt(password.length() - 1);
        return !Character.isLetter(firstChar) || !Character.isLetter(lastChar);
    }

    // Method to get a random character from a character set
    private char getRandomChar(String characterSet, SecureRandom random) {
        int index = random.nextInt(characterSet.length());
        return characterSet.charAt(index);
    }

    // Method to shuffle the password characters for added randomness
    private void shufflePassword(StringBuilder password, SecureRandom random) {
        for (int i = password.length() - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(index));
            password.setCharAt(index, temp);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PasswordGeneratorUI());
    }
}

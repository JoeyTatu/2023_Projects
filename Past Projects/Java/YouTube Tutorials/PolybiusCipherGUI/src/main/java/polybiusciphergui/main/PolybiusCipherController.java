package polybiusciphergui.main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PolybiusCipherController {

    private static final char[][] POLYBIUS_GRID = {
            {'A', 'B', 'C', 'D', 'E'},
            {'F', 'G', 'H', 'I', 'K'},
            {'L', 'M', 'N', 'O', 'P'},
            {'Q', 'R', 'S', 'T', 'U'},
            {'V', 'W', 'X', 'Y', 'Z'}
    };
    @FXML
    private TextArea inputTextArea;
    @FXML
    private TextArea outputTextArea;

    @FXML
    private void encryptClicked(ActionEvent event) {
        String inputText = inputTextArea.getText();
        String encryptedText = encrypt(inputText);
        outputTextArea.setText(encryptedText);
    }

    @FXML
    private void decryptClicked(ActionEvent event) {
        String inputText = inputTextArea.getText();
        String decryptedText = decrypt(inputText);
        outputTextArea.setText(decryptedText);
    }

    private String encrypt(String plaintext) {
        StringBuilder encryptedText = new StringBuilder();

        for (char ch : plaintext.toUpperCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                for (int row = 0; row < 5; row++) {
                    for (int col = 0; col < 5; col++) {
                        if (POLYBIUS_GRID[row][col] == ch || (ch == 'J' && POLYBIUS_GRID[row][col] == 'I')) {
                            encryptedText.append(row + 1).append(col + 1).append(" ");
                            break;
                        }
                    }
                }
            } else {
                encryptedText.append(ch); // Leave non-letter characters unchanged
            }
        }

        return encryptedText.toString().trim();
    }

    private String decrypt(String ciphertext) {
        StringBuilder decryptedText = new StringBuilder();
        String[] pairs = ciphertext.split(" ");

        for (String pair : pairs) {
            int row = Integer.parseInt(pair.substring(0, 1)) - 1;
            int col = Integer.parseInt(pair.substring(1, 2)) - 1;

            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                char ch = POLYBIUS_GRID[row][col];
                if (ch == 'I') {
                    decryptedText.append("(I/J)");
                } else {
                    decryptedText.append(ch);
                }
            }
        }

        return decryptedText.toString();
    }
}

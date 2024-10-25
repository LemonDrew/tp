package seedu.address.ui;

import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * A Command display page
 */
public class CommandDisplay {

    private static final String COMMANDS = "• Add a candidate\n"
            + "• Delete a candidate\n"
            + "• Find a candidate\n"
            + "• Hire a candidate\n"
            + "• Reject a candidate\n"
            + "• Sort candidates in ascending order based on interview scores\n"
            + "• Sort candidates in descending order based on interview scores\n"
            + "• View a candidate's status\n";

    private Stage commandWindow; // Stage reference to the command window

    /**
     * Displays the command window with a list of commands.
     */
    public void showCommands() {
        // Check if the window is already open
        if (commandWindow == null || !commandWindow.isShowing()) {
            commandWindow = new Stage();
            commandWindow.setTitle("Available Commands");

            TextArea textArea = new TextArea();
            textArea.setEditable(false);
            textArea.setWrapText(true);

            textArea.setText(COMMANDS);

            textArea.setStyle("-fx-font-size: 14px; -fx-background-color: #f9f9f9; "
                    + "-fx-border-color: #cccccc; -fx-border-width: 1px; "
                    + "-fx-padding: 10px; -fx-background-radius: 5;");

            Scene scene = new Scene(textArea, 300, 200);
            commandWindow.setScene(scene);

            commandWindow.setMinWidth(300);
            commandWindow.setMinHeight(200);

            commandWindow.show();
        } else {
            commandWindow.requestFocus(); // Bring the window to the front if it's already open
        }
    }

    /**
     * Hides the command window if it's currently displayed.
     */
    public void hide() {
        if (commandWindow != null && commandWindow.isShowing()) {
            commandWindow.hide();
        }
    }
}

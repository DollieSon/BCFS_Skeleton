package dollieson.bcfs_skeleton;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public Button btnLogIn;
    public TextField tfUsername;
    public TextField tfPassword;
    public Button btnSignIn;
    public TextField tfDisplayName;
    @FXML
    protected void onLoginClick() {
        String password = tfPassword.getText();
        String username = tfUsername.getText();

    }
}
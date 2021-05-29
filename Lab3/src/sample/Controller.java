package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {
    public Button btn1;
    public Text txtLicznik;
    public Text txtLicznik1;
    int clickCounter = 0;

    public void OnAction(ActionEvent actionEvent) {
        ++clickCounter;
        txtLicznik1.setText(Integer.toString(clickCounter));
        System.out.println("Kliknięcie nr: " + txtLicznik1.getText());
    }
}

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class CalculatorLayout {

    private FlowPane flowpane = new FlowPane();
    private FlowPane flowpane1 = new FlowPane();
    private FlowPane flowpane2 = new FlowPane();
    private FlowPane flowpane3 = new FlowPane();
    private FlowPane flowpane4 = new FlowPane();
    private static TextField textField = new TextField();

    public GridPane createCalculatorDisplay() {
        ButtonsCreator buttonsCreator = new ButtonsCreator();
        Button[] options = buttonsCreator.getOptions();
        buttonsCreator.setButtonsAction();
        for (int i = 0; i < 4; i++) {
            options[i].setPrefHeight(100);
            options[i].setPrefWidth(100);
            options[i].setStyle("-fx-font-color:#200c30;-fx-font-size:30px;");
            flowpane.getChildren().add(options[i]);
        }
        for (int i = 4; i < 8; i++) {
            options[i].setPrefHeight(100);
            options[i].setPrefWidth(100);
            options[i].setStyle("-fx-font-color:#200c30;-fx-font-size:30px;");
            flowpane1.getChildren().add(options[i]);
        }
        for (int i = 8; i < 12; i++) {
            options[i].setPrefHeight(100);
            options[i].setPrefWidth(100);
            options[i].setStyle("-fx-font-color:#200c30;-fx-font-size:30px;");
            flowpane2.getChildren().add(options[i]);
        }
        for (int i = 12; i < 16; i++) {
            options[i].setPrefHeight(100);
            options[i].setPrefWidth(100);
            options[i].setStyle("-fx-color:#878999;-fx-font-size:23px;");
            flowpane3.getChildren().add(options[i]);
        }

        flowpane4.getChildren().add(textField);
        textField.setPrefSize(400, 100);
        textField.setStyle("-fx-font-size:30px;");
        GridPane gridPane = new GridPane();
        gridPane.add(flowpane4, 1, 1, 1, 1);
        gridPane.add(flowpane, 1, 2, 1, 1);
        gridPane.add(flowpane1, 1, 3, 1, 1);
        gridPane.add(flowpane2, 1, 4, 1, 1);
        gridPane.add(flowpane3, 1, 5, 1, 1);
        return gridPane;
    }

    public TextField getTextField() {
        return textField;
    }
}


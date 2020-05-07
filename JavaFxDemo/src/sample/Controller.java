package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;


public class Controller {
    @FXML
    Canvas _canvas;

    @FXML
    ColorPicker _colorPicker;

    @FXML
    Slider _slider;

    @FXML
    private CheckBox _eraser;

    public void initialize() {
        GraphicsContext graphicsContext = _canvas.getGraphicsContext2D();
        _canvas.setOnMouseDragged(event -> {
            double size = _slider.getValue();
            double x = event.getX() - size / 2;
            double y = event.getY() - size / 2;

            if (_eraser.isSelected()) {
                graphicsContext.clearRect(x, y, size, size);

            } else {
                graphicsContext.setFill(_colorPicker.getValue());
                graphicsContext.fillOval(x, y, size, size);
            }
        });
    }

    public void onExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }


    public void onClearClick(ActionEvent actionEvent) {
        GraphicsContext graphicsContext = _canvas.getGraphicsContext2D();
        graphicsContext.clearRect(0, 0, 1000000000, 1000000000);

    }


}

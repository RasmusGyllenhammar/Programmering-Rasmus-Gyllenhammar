package TillampadProg;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Stack;

public class Main extends Application implements EventHandler<ActionEvent> {


    public static void main(String[] args) {
        launch(args);
    }

    //define all main GUI elements
    Stage _window;

    Scene _mainScene;

    //Buttons
//Underscore är fält
    Button _sweKey;
    Button _japKey;

    StackPane _sverige;
    Group _japan;
    HBox _knappar;


    @Override
    public void start(Stage primaryStage) {

        _window = primaryStage;


        Group container = new Group();

        _mainScene = new Scene(container, 300, 200);

        _sverige = sweden();
        _japan = japan();
        _japan.setVisible(false);
        container.getChildren().add(_japan);
        container.getChildren().add(_sverige);

        _knappar = buttons();
        container.getChildren().add(_knappar);

        primaryStage.setScene(_mainScene);
        primaryStage.show();


    }

    private HBox buttons() {
        HBox buttonBox = new HBox();
        buttonBox.setNodeOrientation(NodeOrientation.RIGHT_TO_LEFT);
        
        _sweKey = new Button("Sweden");
        _sweKey.setOnAction(this);

        _japKey = new Button("Japan");

        _japKey.setTextFill(Color.RED);

        _japKey.setOnAction(this);


        buttonBox.getChildren().add(_japKey);
        return buttonBox;
    }

    private Group japan() {
        Circle circle = new Circle();
        circle.setRadius(50);

        circle.setFill(Color.RED);
        circle.setCenterX(150);
        circle.setCenterY(100);

        Group flagOfJapan = new Group(circle);

        _mainScene.setFill(Color.WHITE);

        return flagOfJapan;
    }

    private StackPane sweden() {
        Rectangle horizontalLine = new Rectangle(50, 200, Color.WHITE);
        Rectangle verticalLine = new Rectangle(300, 50, Color.WHITE);
        Rectangle blueBackGround = new Rectangle(_mainScene.getWidth(), _mainScene.getHeight(), Color.BLUE);
        Rectangle smallHorizontalLine = new Rectangle(25, 200, Color.RED);
        Rectangle smallVerticalLine = new Rectangle(300, 25, Color.RED);

        StackPane flagOfSweden = new StackPane();
        flagOfSweden.getChildren().addAll(blueBackGround,horizontalLine, verticalLine, smallHorizontalLine, smallVerticalLine);


        return flagOfSweden;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if (actionEvent.getSource() == _sweKey) {
            _japan.setVisible(false);
            _sverige.setVisible(true);

            _knappar.getChildren().add(_japKey);
            _knappar.getChildren().remove(_sweKey);
            return;
        }

        if (actionEvent.getSource() == _japKey) {
            _japan.setVisible(true);
            _sverige.setVisible(false);

            _knappar.getChildren().add(_sweKey);
            _knappar.getChildren().remove(_japKey);
            return;
        }
    }


}


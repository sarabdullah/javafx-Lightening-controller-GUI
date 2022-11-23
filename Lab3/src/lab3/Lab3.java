/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package lab3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.geometry.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Label;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
/**
 *
 * @author almso
 */
public class Lab3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        Button btn1 = new Button(" ON ");

        Button btn2 = new Button(" OFF ");
        
        RadioButton type1 = new RadioButton("Ambient");
        RadioButton type2 = new RadioButton("Flash");
        

        Image image = new Image("lamppp.png");
        ImageView lamp = new ImageView(image);
        lamp.setX(230);
        lamp.setY(450);
        lamp.setFitHeight(100);
        lamp.setFitWidth(100);
        lamp.setPreserveRatio(true);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(25);
        rectangle.setY(25);
        rectangle.setWidth(300);
        rectangle.setHeight(550);
        rectangle.setFill(Color.LAVENDER);
        rectangle.setArcWidth(30.0);
        rectangle.setArcHeight(20.0);

        Text text1 = new Text("home lighting controller");
        text1.setX(50);
        text1.setY(50);
        text1.setFont(Font.font("Eras Bold ITC", FontWeight.BOLD, FontPosture.REGULAR, 20));
        text1.setFill(Color.PALEVIOLETRED);
        Text cold = new Text("cold");
         cold.setX(170);
         cold.setY(210);
         
         
         Text warm = new Text("warm");
         warm.setX(280);
         warm.setY(210);
         
         
        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(40);
        slider.setShowTickLabels(false);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);

        Text colLabel = new Text("lighting tempreture");
        colLabel.setFont(Font.font("Eras Bold ITC", FontWeight.BOLD, FontPosture.REGULAR, 10));
        colLabel.setFill(Color.CORNFLOWERBLUE);

        Text colLabel1 = new Text("lighting color");
        colLabel1.setFont(Font.font("Eras Bold ITC", FontWeight.BOLD, FontPosture.REGULAR, 10));
        colLabel1.setFill(Color.CORNFLOWERBLUE);
        
        
        Text colLabel2 = new Text("lighting mode");
        colLabel2.setFont(Font.font("Eras Bold ITC", FontWeight.BOLD, FontPosture.REGULAR, 10));
        colLabel2.setFill(Color.CORNFLOWERBLUE);


        ChoiceBox col = new ChoiceBox();
        col.getItems().addAll("white", "blue", "pink", "red", "green", "yellow");

        BorderPane pane = new BorderPane();

        HBox top = new HBox();
        top.setSpacing(100);
        top.getChildren().addAll(btn1, btn2);
        top.setPadding(new Insets(70, 60, 40, 80));
        pane.setTop(top);

        VBox left = new VBox();
        left.setSpacing(90);
        left.getChildren().addAll(colLabel, colLabel1,colLabel2);
        left.setPadding(new Insets(50, 10, 550, 50));
        pane.setLeft(left);

        VBox center = new VBox();
        center.setSpacing(80);
        center.getChildren().addAll(slider, col);
        center.setPadding(new Insets(50, 50, 550, 10));
        pane.setCenter(center);

        HBox bottom = new HBox();
        bottom.setSpacing(60);
        bottom.getChildren().addAll(type1,type2);
        bottom.setPadding(new Insets(450, 100, 50, 50));
        pane.setBottom(bottom);

        Group root = new Group(rectangle, pane, bottom,cold,warm,lamp,text1);
        Scene scene = new Scene(root, 350, 600);

        primaryStage.setTitle("Lab3_Smart_Home1");
        primaryStage.setScene(scene);
        scene.setFill(Color.LAVENDERBLUSH);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Conroy Ricketts
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application
{
    public static void main(String[] args)
    {
        //launch app
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws  Exception
    {
        //load the FXML file (GUI)
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("GUI-Mockup.fxml")));

        //set the title of the GUI window
        primaryStage.setTitle("Title");

        //set the size of the GUI window
        primaryStage.setScene(new Scene(root, 1920, 720));

        //render the GUI window
        primaryStage.show();
    }
}

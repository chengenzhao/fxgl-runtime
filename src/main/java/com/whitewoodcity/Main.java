package com.whitewoodcity;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage stage) {
    stage.setScene(new Scene(new Group(new Label("Hello World~!"))));

    stage.show();
  }

  public static void main(String[] args) {
    Main.launch(Main.class, args);
  }
}

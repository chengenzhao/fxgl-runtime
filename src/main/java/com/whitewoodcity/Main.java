package com.whitewoodcity;

import module javafx.controls;

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

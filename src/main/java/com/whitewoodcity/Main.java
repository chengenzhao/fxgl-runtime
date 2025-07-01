package com.whitewoodcity;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
  @Override
  public void start(Stage stage) {
    stage.setScene(new Scene(GameApp.embeddedLaunch(new GameApp())));

    stage.show();
  }

  public static void main(String[] args) {
    Main.launch(Main.class, args);
  }
}

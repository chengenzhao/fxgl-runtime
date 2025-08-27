package com.whitewoodcity;

import module javafx.controls;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whitewoodcity.fxgl.vectorview.svgpathcommand.*;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
  @Override
  public void start(Stage stage) {
    var rect = new Rectangle(0,0,200,100);
    var rect1 = new Rectangle(0,0,200,100);
    stage.setScene(new Scene(new Group(new HBox(rect, rect1))));

    rect.setFill(Color.web("#ff0000aa"));
    rect1.setFill(Color.web("#ff0000ff"));

    stage.show();
  }



  void main(String[] args) {
    Main.launch(Main.class, args);
  }
}

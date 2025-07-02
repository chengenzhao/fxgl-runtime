package com.whitewoodcity;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

public class GameApp extends GameApplication {

  @Override
  protected void initSettings(GameSettings settings) {}

  @Override
  protected void initGame(){
    FXGL.getAssetLoader().clearCache();

    try {

//      String path = GameApp.class.getProtectionDomain().getCodeSource().getLocation().getPath();
//      String decodedPath = URLDecoder.decode(path, "UTF-8");
//      System.out.println(decodedPath);

      var path = new File("").getAbsolutePath();

      Media audio = new Media(new File(path+File.separator+"music"+File.separator+"maou_game_theme01.mp3").toURI().toURL().toExternalForm());
      var mediaPlayer = new MediaPlayer(audio);
      mediaPlayer.play();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}

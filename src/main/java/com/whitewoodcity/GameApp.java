package com.whitewoodcity;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;
import javafx.animation.Transition;
import javafx.util.Duration;

public class GameApp extends GameApplication {

  @Override
  protected void initSettings(GameSettings settings) {}

  @Override
  protected void initGame() {
    FXGL.getAssetLoader().clearCache();

    var bgm = FXGL.loopBGM("maou_game_theme01.mp3");
    bgm.getAudio().setVolume(0);
    new Transition() {
      {
        setCycleDuration(Duration.seconds(1));
      }

      protected void interpolate(double frac) {
        bgm.getAudio().setVolume(FXGL.getSettings().getGlobalMusicVolume() * frac);
      }
    }.play();
  }
}

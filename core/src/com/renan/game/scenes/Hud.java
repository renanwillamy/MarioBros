package com.renan.game.scenes;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.renan.game.MarioBros;

import java.util.Locale;

public class Hud {
    private Stage stage;
    private Viewport viewport;

    private Integer worldTime;
    private float timeCount;
    private Integer score;

    Label countdownLabel;
    Label scoreLabel;
    Label timeLabel;
    Label levelLabel;
    Label worldLabel;
    Label marioLabel;

    public Hud(SpriteBatch sb) {
        worldTime = 300;
        timeCount = 0;
        score = 0;

        viewport = new FillViewport(MarioBros.V_WIDTH, MarioBros.V_HEIGHT,
                new OrthographicCamera());
        stage = new Stage(viewport, sb);

        Table table = new Table();
        table.top();
        table.setFillParent(true);

        countdownLabel = new Label(String.format(Locale.getDefault(), "%3d", worldTime), new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));
        scoreLabel = new Label(String.format(Locale.getDefault(), "%6d", score), new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));
        timeLabel = new Label("TIME", new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));
        levelLabel = new Label("1-1", new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));
        worldLabel = new Label("WORLD", new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));
        marioLabel = new Label("MARIO", new Label
                .LabelStyle(new BitmapFont(), Color.WHITE));

    }
}

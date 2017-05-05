package com.renan.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.renan.game.MarioBros;

public class DesktopLauncher {

    private static final int WIDTH = 1500;
    private static final int HEIGHT = 800;

    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = WIDTH;
        config.height = HEIGHT;
        new LwjglApplication(new MarioBros(), config);
    }
}

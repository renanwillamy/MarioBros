package com.renan.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.renan.game.MarioBros;

public class DesktopLauncher {
    public static void main(String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = MarioBros.V_WIDTH;
        config.height = MarioBros.V_HEIGHT;
        new LwjglApplication(new MarioBros(), config);
    }
}

package com.kanya.bottlebird.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.kanya.bottlebird.BottleBirdGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.height = 540;
		config.width = 320;
		config.title = "Bottle Bird";
		config.resizable = false;
		new LwjglApplication(new BottleBirdGame(), config);
	}
}

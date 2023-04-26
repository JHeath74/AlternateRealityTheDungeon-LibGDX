package com.alternaterealitythedungeon.game;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import AlternateRealityTheDungeon.ARTDMain;


// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {

		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("AlternateRealityTheDungeon");
		//config.setFullscreenMode(Lwjgl3ApplicationConfiguration.getDisplayMode()); // Full Screen Mode
		config.setWindowedMode(2900, 1700); // Windowed Mode

		new Lwjgl3Application(new ARTDStart(), config);
		//new Lwjgl3Application(new ARTDMain(), config);
	}
}

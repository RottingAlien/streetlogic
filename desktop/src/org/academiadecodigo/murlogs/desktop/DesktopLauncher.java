package org.academiadecodigo.murlogs.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import org.academiadecodigo.murlogs.Globals;
import org.academiadecodigo.murlogs.StreetLogic;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width= Globals.GAME_WIDTH;
		config.height = Globals.GAME_HEIGHT;
		config.title=Globals.GAME_TITLE;
		new LwjglApplication(new StreetLogic(), config);
	}
}

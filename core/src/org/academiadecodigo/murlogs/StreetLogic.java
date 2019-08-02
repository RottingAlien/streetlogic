package org.academiadecodigo.murlogs;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.academiadecodigo.murlogs.screens.GameScreen;
import org.academiadecodigo.murlogs.screens.InitialMenu;

public class StreetLogic extends Game {
    public SpriteBatch batch;
    public BitmapFont font;


    @Override
    public void create() {
        batch = new SpriteBatch();
        font = new BitmapFont();
        setScreen(new InitialMenu(this));
    }

    @Override
    public void render() {
        super.render();
    }

}

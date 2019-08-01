package org.academiadecodigo.murlogs.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import org.academiadecodigo.murlogs.Globals;
import org.academiadecodigo.murlogs.StreetLogic;

public class GameScreen implements Screen {

    StreetLogic game;
    Texture img;
    private OrthographicCamera camera;
    private Viewport viewport;

    public GameScreen(StreetLogic game) {
        this.game = game;
        img = new Texture("badlogic.jpg");
        camera = new OrthographicCamera();
        camera.position.x=Globals.GAME_WIDTH/2;
        camera.position.y=Globals.GAME_HEIGHT/2;
        viewport = new FitViewport(Globals.GAME_WIDTH, Globals.GAME_HEIGHT, camera);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.batch.draw(img, 0, 0);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        img.dispose();
    }
}

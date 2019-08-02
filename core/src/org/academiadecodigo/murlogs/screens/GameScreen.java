package org.academiadecodigo.murlogs.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
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
    private TmxMapLoader tmxMapLoader;
    private TiledMap tiledMap;
    private OrthogonalTiledMapRenderer orthogonalTiledMapRenderer;


    public GameScreen(StreetLogic game) {
        this.game = game;
        img = new Texture("badlogic.jpg");
        camera = new OrthographicCamera();
        camera.position.x=Globals.GAME_WIDTH/2;
        camera.position.y=Globals.GAME_HEIGHT/2;
        viewport = new FitViewport(Globals.GAME_WIDTH, Globals.GAME_HEIGHT, camera);
        tmxMapLoader = new TmxMapLoader();
        tiledMap = tmxMapLoader.load("streetlogicmap.tmx");
        orthogonalTiledMapRenderer = new OrthogonalTiledMapRenderer(tiledMap);
    }

    @Override
    public void show() {

    }

    public void handleInput (float dt) {
        if (Gdx.input.isTouched()) {
            camera.position.x += 100 * dt;
        }
    }

    public void update(float dt) {
        handleInput(dt);

        camera.update();
        orthogonalTiledMapRenderer.setView(camera);
    }

    @Override
    public void render(float delta) {
        update(delta);

        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        orthogonalTiledMapRenderer.render();

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

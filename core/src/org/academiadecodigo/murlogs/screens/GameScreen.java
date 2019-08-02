package org.academiadecodigo.murlogs.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.Background;
import org.academiadecodigo.murlogs.StreetLogic;
import org.academiadecodigo.murlogs.Walls;
import org.academiadecodigo.murlogs.characters.AbstractCharacter;
import org.academiadecodigo.murlogs.characters.Granny;
import org.academiadecodigo.murlogs.characters.Npc;
import org.academiadecodigo.murlogs.characters.Player;

import java.util.LinkedList;
import java.util.List;

public class GameScreen implements Screen {

    StreetLogic game;
    private OrthographicCamera camera;
    Background background;
    private Player player;
    private Walls walls;
    Granny granny;
    List<AbstractCharacter> npcList;

    public GameScreen(StreetLogic game) {
        this.game = game;
        npcList = new LinkedList<>();
        walls = new Walls();
        background = new Background();
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 320, 180);
        player = new Player();
        player.x = 262;
        player.y = 140;
        player.width = 16;
        player.height = 32;
        granny = new Granny(game.batch);
        camera.position.x = player.x + player.width / 2;
        camera.position.y = player.y + player.height / 2;
        npcList.add(granny);

    }

    @Override
    public void show() {

    }

    public void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) {
            player.moveRight();
            if (checkCollisions()) {
                player.moveLeft();
                player.playerState = Player.PlayerState.GOINGRIGHT;
            }

        }
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) {
            player.moveLeft();
            if (checkCollisions()) {
                player.moveRight();
                player.playerState = Player.PlayerState.GOINGLEFT;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) {
            player.moveUp();
            if (checkCollisions()) {
                player.moveDown();
                player.playerState = Player.PlayerState.GOINGUP;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) {
            player.moveDown();
            if (checkCollisions()) {
                player.moveUp();
                player.playerState = Player.PlayerState.GOINGDOWN;
            }
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)) {
            camera.zoom += 0.1;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.Z)) {
            camera.zoom -= 0.1;
        }

    }

    public void update() {

        if (!(player.playerState == Player.PlayerState.CANTMOVE)) {
            handleInput();
        }


        if (player.x > 160) {
            camera.position.x = player.x + (player.width / 2);
        }
        if (player.y > 91) {
            camera.position.y = player.y + (player.height / 2);
        }
        camera.update();
        player.updatePlayerState();

    }

    public boolean checkCollisions() {
        for (Rectangle wall : walls.rectangles) {
            if (player.overlaps(wall)) {
                System.out.println("colliding");
                return true;
            }
        }

        for (AbstractCharacter npc : npcList) {
            if (player.overlaps(npc)) {
                player.playerState = Player.PlayerState.CANTMOVE;
                npc.talk();
                player.playerState = Player.PlayerState.IDLE;
                return true;
            }
        }
        return false;
    }

    @Override
    public void render(float delta) {
        update();
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.batch.setProjectionMatrix(camera.combined);
        game.batch.begin();
        game.batch.draw(background.sprite, 0, 0);
        game.batch.draw(player.bodySprite, player.x, player.y);
        game.batch.draw(granny.bodySprite, granny.x, granny.y);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {
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
    }
}


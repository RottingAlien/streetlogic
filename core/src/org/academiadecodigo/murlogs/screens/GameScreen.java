package org.academiadecodigo.murlogs.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.Background;
import org.academiadecodigo.murlogs.StreetLogic;
import org.academiadecodigo.murlogs.Walls;
import org.academiadecodigo.murlogs.characters.*;

import java.util.LinkedList;
import java.util.List;

public class GameScreen implements Screen {

    StreetLogic game;
    private OrthographicCamera camera;
    Background background;
    private Player player;
    private Walls walls;
    Granny granny;
    Nikki nikki;
    GrandChild grandChild1;
    GrandChild2 grandChild2;
    Assassin assassin;
    Car car;
    private Sound voiceSound;
    private Music streetMusic;

    List<AbstractCharacter> npcList;

    public GameScreen(StreetLogic game) {
        this.game = game;
        npcList = new LinkedList<>();
        walls = new Walls();
        background = new Background();
        voiceSound = Gdx.audio.newSound(Gdx.files.internal("sound/bla_bla_man.wav"));
        streetMusic = Gdx.audio.newMusic(Gdx.files.internal("sound/nikki_song.mp3"));
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 320, 180);
        player = new Player();
        player.x = 262;
        player.y = 140;
        player.width = 16;
        player.height = 32;
        granny=new Granny();
        nikki=new Nikki();
        assassin=new Assassin();
        grandChild1=new GrandChild();
        grandChild2=new GrandChild2();
        car=new Car();
        streetMusic.setLooping(true);
        streetMusic.play();



        camera.position.x = player.x + player.width / 2;
        camera.position.y = player.y + player.height / 2;
        npcList.add(granny);
        npcList.add(nikki);
        npcList.add(grandChild1);
        npcList.add(grandChild2);
        npcList.add(assassin);
        npcList.add(car);
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
                voiceSound.play();
                System.out.println("colliding");
                npc.isTalking = true;
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
        game.batch.draw(nikki.bodySprite,nikki.x,nikki.y);
        game.batch.draw(grandChild1.bodySprite,grandChild1.x,grandChild2.y);
        game.batch.draw(grandChild2.bodySprite,grandChild2.x,grandChild2.y);
        game.batch.draw(assassin.bodySprite,assassin.x,assassin.y);
        game.batch.draw(car.bodySprite,car.x,car.y);
        for (AbstractCharacter npc : npcList) {
            if (npc instanceof Npc && npc.isTalking) {

                Npc npc1 = (Npc) npc;
                    game.batch.draw(npc1.talk(), player.x-75, player.y-60);
                    player.playerState= Player.PlayerState.CANTMOVE;
                    if(Gdx.input.isKeyJustPressed(Input.Keys.ENTER)){
                        npc.isTalking=false;
                        player.playerState= Player.PlayerState.IDLE;
                    };
            }
        }
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


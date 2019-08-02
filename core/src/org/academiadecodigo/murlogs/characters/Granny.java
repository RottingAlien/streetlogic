package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.academiadecodigo.murlogs.screens.InitialMenu;

public class Granny extends AbstractCharacter implements Npc {


    public boolean finishedTalk;
    private SpriteBatch batch;

    Texture dialogTexture;
    public static Sprite dialogSprite;

    public Granny() {

        bodyTexture = new Texture("granny.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        dialogPosX = 100;
        dialogPosY = 100;
        dialogTexture = new Texture("talk/grandfather/1.lostwallet.png");
        dialogSprite = new Sprite(dialogTexture);


    }

    public void create() {
        x = 368;
        y = 160;
        width = 16;
        height = 32;
    }

    @Override
    public Sprite talk() {
        return dialogSprite;

    }


    public int getDialogPosX() {
        return dialogPosX;
    }

    public int getDialogPosY() {
        return dialogPosY;
    }
}

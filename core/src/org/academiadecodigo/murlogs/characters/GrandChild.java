package org.academiadecodigo.murlogs.characters;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class GrandChild extends AbstractCharacter implements Npc{


Texture dialogTexture;
Sprite dialogSprite;

    public boolean finishedTalk;

    public GrandChild() {

        bodyTexture = new Texture("twin.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        dialogPosX = 100;
        dialogPosY = 100;
        dialogTexture = new Texture("talk/grandfather/1.lostwallet.png");
        dialogSprite = new Sprite(dialogTexture);


    }

    public void create() {
        x = 438;
        y = 769;
        width = 16;
        height = 32;
    }





    public int getDialogPosX() {
        return dialogPosX;
    }

    public int getDialogPosY() {
        return dialogPosY;
    }

    @Override
    public Sprite talk() {
        return Granny.dialogSprite;
    }
}

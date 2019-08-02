package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Car extends AbstractCharacter implements Npc{


Texture dialogTexture;
Sprite dialogSprite;

    public boolean finishedTalk;

    public Car() {

        bodyTexture = new Texture("borkencar.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        dialogPosX = 100;
        dialogPosY = 100;
        dialogTexture = new Texture("talk/grandfather/1.lostwallet.png");
        dialogSprite = new Sprite(dialogTexture);


    }

    public void create() {
        x = 914;
        y = 391;
        width = 74;
        height = 51;
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

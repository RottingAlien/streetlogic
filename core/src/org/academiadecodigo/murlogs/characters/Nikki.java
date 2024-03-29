package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Nikki extends AbstractCharacter implements Npc{




    public boolean finishedTalk;

    public Nikki() {

        bodyTexture = new Texture("nikki.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        dialogPosX = 100;
        dialogPosY = 100;


    }

    public void create() {
        x = 841;
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

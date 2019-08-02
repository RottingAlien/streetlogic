package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Assassin extends AbstractCharacter implements Npc{




    public boolean finishedTalk;

    public Assassin() {

        bodyTexture = new Texture("assassin.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        dialogPosX = 100;
        dialogPosY = 100;


    }

    public void create() {
        x = 1259;
        y = 914;
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

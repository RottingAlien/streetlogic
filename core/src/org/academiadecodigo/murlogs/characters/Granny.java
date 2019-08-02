package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Granny extends AbstractCharacter implements Npc {

    SpriteBatch batch;

    public boolean finishedTalk;

    public Granny(SpriteBatch batch) {
        this.batch = batch;
        bodyTexture = new Texture("granny.png");
        bodySprite = new Sprite(bodyTexture);
        create();

    }

    public void create() {
        x = 368;
        y = 160;
        width = 16;
        height = 32;
    }

    @Override
    public void talk(){
        if(!finishedTalk){

        }
    }
}

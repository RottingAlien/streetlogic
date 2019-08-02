package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import org.academiadecodigo.murlogs.screens.InitialMenu;

public class Granny extends AbstractCharacter implements Npc {

    SpriteBatch batch;
    Texture lostWalletDialog;
    Sprite lostWalletSprite;


    public boolean finishedTalk;
    public boolean isTalking;

    public Granny(SpriteBatch batch) {
        this.batch = batch;
        bodyTexture = new Texture("granny.png");
        bodySprite = new Sprite(bodyTexture);
        create();
        lostWalletDialog = new Texture("talk/grandfather/1_lostWallet.png");
        lostWalletSprite = new Sprite(lostWalletDialog);



    }

    public void create() {
        x = 368;
        y = 160;
        width = 16;
        height = 32;
    }

    @Override
    public void talk() {
        while (!finishedTalk) {



        }
    }
}

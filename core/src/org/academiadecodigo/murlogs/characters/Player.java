package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.items.Wallet;

public class Player extends AbstractCharacter {

    private int goodDecisions = 0;
    private int badDecisions = 0;

    public Player(Texture texture, SpriteBatch spriteBatch) {
        super(texture, spriteBatch);
    }

    public void increaseGoodDecisions(){
        goodDecisions++;
    }

    public void increaseBadDecisions(){
        badDecisions++;
    }

    public int getGoodDecisions() {
        return goodDecisions;
    }

    public int getBadDecisions() {
        return badDecisions;
    }

}
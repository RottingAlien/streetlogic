package org.academiadecodigo.murlogs.items;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class AbstractItem extends Rectangle {

    protected Texture texture;
    protected SpriteBatch spriteBatch;

    public AbstractItem (Texture texture, SpriteBatch spriteBatch) {
        this.spriteBatch = spriteBatch;
        this.texture = texture;
    }

}

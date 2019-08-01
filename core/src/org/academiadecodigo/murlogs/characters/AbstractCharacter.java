package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

public class AbstractCharacter extends Rectangle {

    protected Texture texture;
    protected SpriteBatch spriteBatch;


    public AbstractCharacter (Texture texture, SpriteBatch spriteBatch){
        this.texture = texture;
        this.spriteBatch = spriteBatch;
    }

}

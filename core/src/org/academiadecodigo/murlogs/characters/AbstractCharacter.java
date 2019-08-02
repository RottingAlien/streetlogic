package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.Interface.Colidable;

import java.awt.*;

public abstract class AbstractCharacter extends Rectangle implements Colidable {

    public Texture bodyTexture;
    public Sprite bodySprite;

    public void talk(){}

    public void create(){}



}

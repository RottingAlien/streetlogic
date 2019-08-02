package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.Interface.Colidable;
import org.academiadecodigo.murlogs.Progress;

import java.awt.*;

public abstract class AbstractCharacter extends Rectangle implements Npc {

    public Texture bodyTexture;
    public Sprite bodySprite;
    public boolean isTalking;
    public int dialogPosX;
    public int dialogPosY;



    public void create(){}



}

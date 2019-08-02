package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.Globals;
import org.academiadecodigo.murlogs.items.Wallet;

public class Player extends AbstractCharacter {

    private enum PlayerState{
        IDLE,
        GOINGRIGHT,
        GOINGLEFT,
        GOINGUP,
        GOINGDOWN


    }



    public PlayerState playerState = PlayerState.IDLE;

    public boolean movingRight;
    public boolean movingLeft;
    public boolean movingUp;
    public boolean movingDown;

    public int goodDecisions = 0;
    public int badDecisions = 0;

    public Player(){
        characterBodyTexture = new Texture("playeridle.png");
        sprite =  new Sprite(characterBodyTexture);
    }



    public void moveRight(){
        playerState = PlayerState.GOINGRIGHT;
        x+= Globals.PLAYER_SPEED;

    }

    public void moveLeft(){
        playerState = PlayerState.GOINGLEFT;
        x-=Globals.PLAYER_SPEED;

    }

    public void moveUp(){
        playerState = PlayerState.GOINGUP;
        y+=Globals.PLAYER_SPEED;


    }

    public void moveDown(){
        playerState = PlayerState.GOINGDOWN;
        y-=Globals.PLAYER_SPEED;

    }

    public void updatePlayerState(){
        if(playerState==PlayerState.IDLE){
            characterBodyTexture=new Texture("playeridle.png");
            sprite = new Sprite(characterBodyTexture);
        }
        if(playerState==PlayerState.GOINGRIGHT){
            characterBodyTexture=new Texture("playerright.png");
            sprite = new Sprite(characterBodyTexture);
        }
        if(playerState==PlayerState.GOINGLEFT){
            characterBodyTexture=new Texture("playerleft.png");
            sprite = new Sprite(characterBodyTexture);
        }
        if(playerState==PlayerState.GOINGUP){
            characterBodyTexture=new Texture("playerup.png");
            sprite = new Sprite(characterBodyTexture);
        }
        if(playerState==PlayerState.GOINGDOWN){
            characterBodyTexture=new Texture("playeridle.png");
            sprite = new Sprite(characterBodyTexture);
        }
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
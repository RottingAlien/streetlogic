package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import org.academiadecodigo.murlogs.Globals;

public class Player extends AbstractCharacter {


    @Override
    public Sprite talk() {
        return null;
    }

    public enum PlayerState{
        IDLE,
        GOINGRIGHT,
        GOINGLEFT,
        GOINGUP,
        GOINGDOWN,
        CANTMOVE


    }



    public PlayerState playerState = PlayerState.IDLE;

    public boolean movingRight;
    public boolean movingLeft;
    public boolean movingUp;
    public boolean movingDown;

    public int goodDecisions = 0;
    public int badDecisions = 0;

    public Player(){
        bodyTexture = new Texture("playeridle.png");
        bodySprite =  new Sprite(bodyTexture);
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
            bodyTexture =new Texture("playeridle.png");
            bodySprite = new Sprite(bodyTexture);
        }
        if(playerState==PlayerState.GOINGRIGHT){
            bodyTexture =new Texture("playerright.png");
            bodySprite = new Sprite(bodyTexture);
        }
        if(playerState==PlayerState.GOINGLEFT){
            bodyTexture =new Texture("playerleft.png");
            bodySprite = new Sprite(bodyTexture);
        }
        if(playerState==PlayerState.GOINGUP){
            bodyTexture =new Texture("playerup.png");
            bodySprite = new Sprite(bodyTexture);
        }
        if(playerState==PlayerState.GOINGDOWN){
            bodyTexture =new Texture("playeridle.png");
            bodySprite = new Sprite(bodyTexture);
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
package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.items.Wallet;

public class Granny extends Rectangle {

    private Wallet wallet;

    public boolean hasMoney(){
        if(!wallet.hasMoney()){
            return false;
        }
        return true;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
}

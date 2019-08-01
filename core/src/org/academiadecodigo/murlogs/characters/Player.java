package org.academiadecodigo.murlogs.characters;

import com.badlogic.gdx.math.Rectangle;
import org.academiadecodigo.murlogs.items.Wallet;

public class Player extends Rectangle {

    private int goodDecisions;
    private int badDecisions;
    private Wallet wallet;
    private boolean stoleMoney;
    private boolean helpedGranny;
    private boolean hasGift;
    private boolean sawGift;
    private boolean hasBag;
    private boolean helpedGrandChild;
    private boolean isRobbed;
    private boolean hasComplained;
    private boolean hasMurdered;
    private boolean helpedVictim;


    public void walletAction(){
        if(!stoleMoney){
            goodDecisions++;
        }
        wallet.setHasMoney(false);
        badDecisions++;
    }

    public void giftAction(){
        if(!sawGift){
            goodDecisions++;
        }
        badDecisions++;
    }

    public void accidentAction(){
        if(!helpedVictim){
            badDecisions++;
        }
        goodDecisions++;
    }

    private void giveWallet(Granny granny){
        granny.setWallet(wallet);
    }

    public int getGoodDecisions() {
        return goodDecisions;
    }

    public int getBadDecisions() {
        return badDecisions;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public boolean hasStoleMoney() {
        return stoleMoney;
    }

    public void setStoleMoney(boolean stoleMoney) {
        this.stoleMoney = stoleMoney;
    }

    public boolean hasHelpedGranny() {
        return helpedGranny;
    }

    public void setHelpedGranny(boolean helpedGranny) {
        this.helpedGranny = helpedGranny;
    }

    public boolean hasGift() {
        return hasGift;
    }

    public void setHasGift(boolean hasGift) {
        this.hasGift = hasGift;
    }

    public boolean hasSawGift() {
        return sawGift;
    }

    public void setSawGift(boolean sawGift) {
        this.sawGift = sawGift;
    }

    public boolean hasBag() {
        return hasBag;
    }

    public void setHasBag(boolean hasBag) {
        this.hasBag = hasBag;
    }

    public boolean hasHelpedGrandChild() {
        return helpedGrandChild;
    }

    public void setHelpedGrandChild(boolean helpedGrandChild) {
        this.helpedGrandChild = helpedGrandChild;
    }

    public boolean hasRobbed() {
        return isRobbed;
    }

    public void setRobbed(boolean robbed) {
        isRobbed = robbed;
    }

    public boolean hasComplained() {
        return hasComplained;
    }

    public void setHasComplained(boolean hasComplained) {
        this.hasComplained = hasComplained;
    }

    public boolean hasMurdered() {
        return hasMurdered;
    }

    public void setHasMurdered(boolean hasMurdered) {
        this.hasMurdered = hasMurdered;
    }

    public boolean helpedVictim() {
        return helpedVictim;
    }

    public void setHelpedVictim(boolean helpedVictim) {
        this.helpedVictim = helpedVictim;
    }
}

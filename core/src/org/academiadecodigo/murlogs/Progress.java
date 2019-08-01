package org.academiadecodigo.murlogs;

import org.academiadecodigo.murlogs.characters.Granny;
import org.academiadecodigo.murlogs.characters.Player;

public class Progress {

    private boolean stoleMoney;
    private boolean helpedGranny;
    private boolean hasWallet;
    private boolean hasGift;
    private boolean sawGift;
    private boolean hasBag;
    private boolean helpedGrandChild;
    private boolean isRobbed;
    private boolean hasGun;
    private boolean hasComplained;
    private boolean hasMurdered;
    private boolean helpedVictim;
    private Player player;
    private Granny granny;

    public void walletAction() {
        if (!stoleMoney) {
            player.increaseGoodDecisions();
            return;
        }
        player.increaseBadDecisions();
    }

    public void giftAction() {
        if (!sawGift) {
            player.increaseGoodDecisions();
            return;
        }
        player.increaseBadDecisions();
    }

    public void accidentAction() {
        if (!helpedVictim) {
            player.increaseBadDecisions();
            return;
        }
        player.increaseGoodDecisions();
    }

    private void giveWallet() {
        if (hasWallet) {
            helpedGranny = true;
            if (!stoleMoney) {
                //granny.happytalk();
                return;
            }
                //granny.sadtalk();
        }
    }

    public boolean isHasWallet() {
        return hasWallet;
    }

    public void setHasWallet(boolean hasWallet) {
        this.hasWallet = hasWallet;
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

    public boolean isHasGun() {
        return hasGun;
    }

    public void setHasGun(boolean hasGun) {
        this.hasGun = hasGun;
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



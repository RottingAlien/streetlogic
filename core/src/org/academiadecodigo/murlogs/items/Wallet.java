package org.academiadecodigo.murlogs.items;

public class Wallet {
    private boolean hasMoney;

    public Wallet() {
        hasMoney = true;
    }

    public boolean hasMoney() {
        return hasMoney;
    }

    public void setHasMoney(boolean hasMoney) {
        this.hasMoney = hasMoney;
    }
}

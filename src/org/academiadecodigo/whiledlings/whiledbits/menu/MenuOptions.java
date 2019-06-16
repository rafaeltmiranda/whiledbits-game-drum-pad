package org.academiadecodigo.whiledlings.whiledbits.menu;

import org.academiadecodigo.whiledlings.whiledbits.Game;

public enum MenuOptions {
    PLAY(Game.resourcesPathImages + "menu/menuPlay"),
    INST(Game.resourcesPathImages + "menu/menuInst"),
    KCS(Game.resourcesPathImages + "menu/menuKcs");

    private String path;
    private String pathSelected;

    MenuOptions(String path){
        this.path = path + ".png";
        this.pathSelected = path + "Glow.png";
    }

    public String getPath() {
        return path;
    }

    public String getPathSelected() {
        return pathSelected;
    }

}

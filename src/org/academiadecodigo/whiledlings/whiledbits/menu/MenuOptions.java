package org.academiadecodigo.whiledlings.whiledbits.menu;

public enum MenuOptions {
    PLAY("./resources/images/menu/menuPlay"),
    INST("./resources/images/menu/menuInst"),
    KCS("./resources/images/menu/menuKcs");

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

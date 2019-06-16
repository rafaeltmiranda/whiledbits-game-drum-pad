package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.whiledbits.menu.MenuOptions;

public class GfxMenu {

    private String pathImages = "./resources/images/menu/";
    private Picture menuBackground;
    private Picture[] menuOps = new Picture[3];
    private Picture[] menuSelected = new Picture[3];
    private Picture[] menuWalls = new Picture[2];
    private int lastSelected = 0;

    public GfxMenu(){
        drawMenu();
    }

    public void drawMenu() {

        menuBackground = new Picture(0, 0, pathImages + "menuBackground.png");
        menuBackground.draw();

        menuOps[0] = new Picture(115.5, 595.6, MenuOptions.PLAY.getPath());
        menuSelected[0] = new Picture(115.5, 595.6, MenuOptions.PLAY.getPathSelected());
        menuOps[0].draw();

        menuOps[1] = new Picture(549.3, 595.6, MenuOptions.INST.getPath());
        menuSelected[1] = new Picture(549.3, 595.6, MenuOptions.INST.getPathSelected());
        menuOps[1].draw();

        menuOps[2] = new Picture(977.5, 595.6, MenuOptions.KCS.getPath());
        menuSelected[2] = new Picture(977.5, 595.6, MenuOptions.KCS.getPathSelected());
        menuOps[2].draw();

        menuWalls[0] = new Picture(0,0,pathImages + "menuBackground.png");
        menuWalls[1] = new Picture(0,0, pathImages + "menuBackground.png");

    }

    public void selectOps(int ops){
        menuSelected[lastSelected].delete();
        menuSelected[ops].draw();
        lastSelected = ops;
    }


}

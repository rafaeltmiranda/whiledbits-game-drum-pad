package org.academiadecodigo.whiledlings.whiledbits.menu;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.whiledbits.Game;
import org.academiadecodigo.whiledlings.whiledbits.Player;
import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxMenu;

public class MenuHandler {

    private GfxMenu gfxMenu;
    private MenuOptions menuOpsSelected;
    private Game game;
    private Player player;
    private boolean mainMenu;
    private Picture menuOptionImg;

    public MenuHandler(Game game){
        this.game = game;
        gfxMenu = new GfxMenu();
        gfxMenu.drawMenu();
        gfxMenu.selectOps(0);

        player = new Player(this);
        player.init();

        menuOpsSelected = MenuOptions.PLAY;
        mainMenu = true;
    }

    public void keyLeft() {

        if (!mainMenu){
            return;
        }

        if (menuOpsSelected.ordinal() - 1 >= 0) {
            menuOpsSelected = MenuOptions.values()[menuOpsSelected.ordinal() - 1];
            gfxMenu.selectOps(menuOpsSelected.ordinal());
            System.out.println(menuOpsSelected.ordinal());
        }
    }

    public void keyRight(){

        if (!mainMenu){
            return;
        }
        
        if (menuOpsSelected.ordinal() + 1 < MenuOptions.values().length) {
            menuOpsSelected = MenuOptions.values()[menuOpsSelected.ordinal() + 1];
            gfxMenu.selectOps(menuOpsSelected.ordinal());
            System.out.println(menuOpsSelected.ordinal());
        }

    }

    public void keySpace() {
        if (menuOpsSelected.ordinal() == 0) {
            System.out.println("play");
            mainMenu = false;
            player.outMenu();
            game.startPad();
            return;
        }

        if (menuOpsSelected.ordinal() == 1) {
            System.out.println("Inst");
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallInst.png");
            mainMenu = false;
            menuOptionImg.draw();
            return;
        }

        if (menuOpsSelected.ordinal() == 2) {
            System.out.println("kcs");
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallKcs.png");
            mainMenu = false;
            menuOptionImg.draw();
            return;
        }
    }

    public void keyQ(){
        System.out.println("Exit");
        if (!mainMenu){
            mainMenu = true;
            menuOptionImg.delete();
        }
    }



}

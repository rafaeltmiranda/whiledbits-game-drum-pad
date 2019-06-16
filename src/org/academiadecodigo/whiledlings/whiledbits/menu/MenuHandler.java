package org.academiadecodigo.whiledlings.whiledbits.menu;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.whiledbits.Game;
import org.academiadecodigo.whiledlings.whiledbits.Player;
import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxMenu;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;

public class MenuHandler {

    private GfxMenu gfxMenu;
    private MenuOptions menuOpsSelected;
    private Game game;
    private Player player;
    private boolean mainMenu;
    private Picture menuOptionImg;
    private boolean menuOption;
    private SoundMechanism sound;

    public MenuHandler(Game game){
        this.game = game;
        gfxMenu = new GfxMenu();
        gfxMenu.drawMenu();
        gfxMenu.selectOps(0);

        player = new Player(this);
        player.init();

        sound = new SoundMechanism("/resources/sounds/introSong.wav");
        sound.play(true);

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

        if (!mainMenu){
            return;
        }

        if (menuOpsSelected.ordinal() == 0) {
            System.out.println("play");
            sound.stop();
            mainMenu = false;
            player.outMenu();
            game.startPad();
            return;
        }

        if (menuOpsSelected.ordinal() == 1) {
            System.out.println("Inst");
            mainMenu = false;
            menuOption = true;
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallInst.png");
            menuOptionImg.draw();
            return;
        }

        if (menuOpsSelected.ordinal() == 2) {
            System.out.println("kcs");
            mainMenu = false;
            menuOption = true;
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallKcs.png");
            menuOptionImg.draw();
            return;
        }
    }

    public void keyQ(){
        System.out.println("Exit");
        if (!mainMenu){
            mainMenu = true;
            menuOptionImg.delete();
            menuOption = false;
            return;
        }

        if (!menuOption){
            System.exit(0);
        }
    }

}

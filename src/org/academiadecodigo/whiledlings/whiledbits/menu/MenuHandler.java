package org.academiadecodigo.whiledlings.whiledbits.menu;

import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.whiledbits.Game;
import org.academiadecodigo.whiledlings.whiledbits.Player;
import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxMenu;
import org.academiadecodigo.whiledlings.whiledbits.sound.PathNotes;
import org.academiadecodigo.whiledlings.whiledbits.sound.PathSamples;
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

    private SoundMechanism soundArrows = new SoundMechanism(PathNotes.PAD_0.getPath());
    private SoundMechanism soundConfirm = new SoundMechanism(PathSamples.PAD_7.getPath());

    public MenuHandler(Game game){
        this.game = game;
        gfxMenu = new GfxMenu();
        gfxMenu.drawMenu();
        gfxMenu.selectOps(0);

        player = new Player(this);
        player.init();

        sound = new SoundMechanism("/resources/sounds/introSong.wav");
        sound.setLoop(4);
        sound.play(true);

        menuOpsSelected = MenuOptions.PLAY;
        mainMenu = true;
    }

    public void keyLeft() {

        if (!mainMenu){
            return;
        }

        if (menuOpsSelected.ordinal() - 1 >= 0) {

            soundArrows.stop();
            soundArrows = new SoundMechanism(PathNotes.values()[(int) (Math.random() * PathNotes.values().length)].getPath());
            soundArrows.play(true);

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

            soundArrows.stop();
            soundArrows = new SoundMechanism(PathNotes.values()[(int) (Math.random() * PathNotes.values().length)].getPath());
            soundArrows.play(true);

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

            sound.stop();
            soundArrows.stop();

            soundConfirm.play(true);

            mainMenu = false;
            player.outMenu();
            game.startPad();
            return;
        }

        soundArrows.stop();
        soundArrows = new SoundMechanism(PathNotes.values()[(int) (Math.random() * PathNotes.values().length)].getPath());
        soundArrows.play(true);

        if (menuOpsSelected.ordinal() == 1) {
            mainMenu = false;
            menuOption = true;
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallInst.png");
            menuOptionImg.draw();
            return;
        }

        if (menuOpsSelected.ordinal() == 2) {
            mainMenu = false;
            menuOption = true;
            menuOptionImg = new Picture(0, 0, game.resourcesPathImages + "/menu/menuWallKcs.png");
            menuOptionImg.draw();
            return;
        }
    }

    public void keyQ(){
        if (!mainMenu){

            soundArrows.stop();
            soundArrows = new SoundMechanism(PathNotes.values()[(int) (Math.random() * PathNotes.values().length)].getPath());
            soundArrows.play(true);

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

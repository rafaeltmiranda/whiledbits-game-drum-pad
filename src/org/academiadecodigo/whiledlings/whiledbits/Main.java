package org.academiadecodigo.whiledlings.whiledbits;


import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxLoading;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        GfxLoading loading = new GfxLoading();
        loading.loadingThing();

        Game game = new Game();

        game.startMenu();



    }

}

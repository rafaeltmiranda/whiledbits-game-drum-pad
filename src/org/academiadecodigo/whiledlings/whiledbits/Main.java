package org.academiadecodigo.whiledlings.whiledbits;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Game game = new Game();
        game.startPad();




        //SoundMechanism sound = new SoundMechanism("/resources/sounds/testSounds/puddipuddimusic.wav");
        //sound.play(true);

        Thread.sleep(600);

    }

}

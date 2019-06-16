package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.whiledlings.whiledbits.sound.PathSamples;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;

public class GfxLoading {

    SoundMechanism bits = new SoundMechanism(PathSamples.PAD_3.getPath());
    SoundMechanism lastBip = new SoundMechanism(PathSamples.PAD_2.getPath());

    public void loadingThing() {

        Rectangle viewLoading = new Rectangle(0,0,1440,900);
        viewLoading.setColor(Color.BLACK);
        viewLoading.fill();

        Text loadingText = new Text(650,400,"<PrepareYourselves_>");
        loadingText.grow(250, 40);
        loadingText.setColor(Color.PINK);


        for (int i=0 ; i<3 ; i++) {

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loadingText.draw();
            bits.play(true);

            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loadingText.delete();
            bits.stop();

        }

        try {
            Thread.sleep(700);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lastBip.play(true);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        viewLoading.delete();

    }
}

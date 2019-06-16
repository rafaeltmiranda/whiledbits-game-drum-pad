package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;

public class GfxLoading {

    public void loadingThing() {

        Rectangle viewLoading = new Rectangle(0,0,1440,900);
        viewLoading.setColor(Color.BLACK);
        viewLoading.fill();

        Text loadingText = new Text(650,400,"<PrepareYourselves_>");
        loadingText.grow(250, 40);
        loadingText.setColor(Color.PINK);


        for (int i=0 ; i<4 ; i++) {

            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loadingText.draw();

            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            loadingText.delete();

        }

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        viewLoading.delete();

    }
}

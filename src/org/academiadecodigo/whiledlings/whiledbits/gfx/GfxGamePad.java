package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxGamePad {

    private String pathImages = "./resources/images/";

    public void drawPad() throws InterruptedException {

        // Draw background rectangle

        Rectangle view = new Rectangle(0,0,1440,900);
        view.setColor(Color.BLACK);
        view.fill();

        // Draw logo image

        Picture logo = new Picture(80, 80, pathImages + "logo.png");
        logo.draw();


        // Draw function icons

        Picture drums = new Picture(650, 130, pathImages + "buttons/functional/drum.png");
        drums.draw();

        Picture samples = new Picture(950, 130, pathImages + "buttons/functional/sample.png");
        samples.draw();

        Picture notes = new Picture(1240, 130, pathImages + "buttons/functional/notes.png");
        notes.draw();


        //Draw pads 1st line

        Picture pad00 = new Picture(80, 360, pathImages + "buttons/pads/pad.png");
        pad00.draw();

        Picture pad01 = new Picture(350, 360, pathImages + "buttons/pads/pad.png");
        pad01.draw();

        Picture pad02 = new Picture(620, 360, pathImages + "buttons/pads/pad.png");
        pad02.draw();

        Picture pad03 = new Picture(890, 360, pathImages + "buttons/pads/pad.png");
        pad03.draw();

        Picture pad04 = new Picture(1160, 360, pathImages + "buttons/pads/pad.png");
        pad04.draw();

        //Draw pads 2nd line

        Picture pad10 = new Picture(80, 620, pathImages + "buttons/pads/pad.png");
        pad10.draw();

        Picture pad11 = new Picture(350, 620, pathImages + "buttons/pads/pad.png");
        pad11.draw();

        Picture pad12 = new Picture(620, 620, pathImages + "buttons/pads/pad.png");
        pad12.draw();

        Picture pad13 = new Picture(890, 620, pathImages + "buttons/pads/pad.png");
        pad13.draw();

        Picture pad14 = new Picture(1160, 620, pathImages + "buttons/pads/pad.png");
        pad14.draw();


    }

}

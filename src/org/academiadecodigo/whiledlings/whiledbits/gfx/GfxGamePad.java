package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxGamePad {

    public void drawPad() {

        Rectangle view = new Rectangle(10,10,960,540);
        view.setColor(Color.BLACK);
        view.fill();

        Picture pad = new Picture(100,200,"./resources/images/pad_pink.png");
        pad.draw();

    }

}

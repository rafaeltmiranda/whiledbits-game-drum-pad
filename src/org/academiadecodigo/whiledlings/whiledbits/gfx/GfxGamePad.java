package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GfxGamePad {

    private String pathImages = "./resources/images/";

    private Picture drums, drumsSelected, samples, samplesSelected, notes, notesSelected;
    private Picture[] pads = new Picture[10];
    private Picture[] padsSelected = new Picture[10];

    public void drawPad(){

        // Draw background rectangle

        Rectangle view = new Rectangle(0,0,1440,900);
        view.setColor(Color.BLACK);
        view.fill();

        // Draw Background Neon

        Picture neon = new Picture(0, 0, pathImages + "backGroundNeon_1.png");
        neon.draw();

        // Draw logo image

        Picture logo = new Picture(80, 80, pathImages + "logo.png");
        logo.draw();


        // Draw function icons

        drums = new Picture(660, 130, pathImages + "buttons/functional/drum.png");
        drumsSelected = new Picture(600,130, pathImages + "buttons/functional/drum.png");
        drums.draw();

        samples = new Picture(930, 130, pathImages + "buttons/functional/sample.png");
        samplesSelected = new Picture(930, 130, pathImages + "buttons/functional/sample.png");
        samples.draw();

        notes = new Picture(1200, 130, pathImages + "buttons/functional/notes.png");
        notesSelected = new Picture(1200, 130, pathImages + "buttons/functional/notes.png");
        notes.draw();



        // Draw pads 1st line

        for (int i = 0 ; i < 5 ; i++ ) {
            GfxPadsPics randomButtom = GfxPadsPics.values()[(int) (Math.random() * GfxPadsPics.values().length)];

            pads[i] = new Picture(80 + 270 * i, 360, randomButtom.getPath());
            pads[i].draw();

            padsSelected[i] = new Picture(80 + 270 * i, 360, randomButtom.getPath());
        }

        // Draw pads 2nd line

        for (int i = 5 ; i < 10 ; i++ ) {
            GfxPadsPics randomButtom = GfxPadsPics.values()[(int) (Math.random() * GfxPadsPics.values().length)];

            pads[i] = new Picture(80 + 270 * (i-5), 620, randomButtom.getPath());
            pads[i].draw();

            padsSelected[i] = new Picture(80 + 270 * (i-5), 620, randomButtom.getPath());
        }

    }

    public void selectPad(int index) {
        //pads[index].draw();
        //padsSelected[index].delete();
    }

    public void unselectPad(int index) {
        //pads[index].delete();
        //padsSelected[index].draw();
    }

    public void selectDrumGroup() {
        drumsSelected.draw();
        samplesSelected.delete();
        notesSelected.delete();
    }

    public void selectSampleGroup() {
        drumsSelected.delete();
        samplesSelected.draw();
        notesSelected.delete();
    }

    public void selectNotesGroup() {
        drumsSelected.delete();
        samplesSelected.delete();
        notesSelected.draw();
    }

}

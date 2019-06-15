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
        drumsSelected = new Picture(660,130, pathImages + "buttons/functional/drumGlow.png");
        drums.draw();

        samples = new Picture(930, 130, pathImages + "buttons/functional/sample.png");
        samplesSelected = new Picture(930, 130, pathImages + "buttons/functional/sampleGlow.png");
        samples.draw();

        notes = new Picture(1200, 130, pathImages + "buttons/functional/notes.png");
        notesSelected = new Picture(1200, 130, pathImages + "buttons/functional/notesGlow.png");
        notes.draw();


        int index;
        // Draw pads 1st line

        for (int i = 0 ; i <= 2 ; i++ ) {

            GfxPadsPics pathPad = GfxPadsPics.values()[i];
            GfxPadsPicsGlow pathPadSelected = GfxPadsPicsGlow.values()[i];

            pads[i] = new Picture(80 + 270 * i, 360, pathPad.getPath());
            pads[i].draw();

            padsSelected[i] = new Picture(80 + 270 * i, 360, pathPadSelected.getPath());

            pads[i+5] = new Picture(80 + 270 * i, 620, pathPad.getPath());
            pads[i+5].draw();

            padsSelected[i+5] = new Picture(80 + 270 * i, 620, pathPadSelected.getPath());

        }

        // Draw pads 2nd line

        for (int i = 0 ; i < 2 ; i++ ) {
            GfxPadsPics pathPad = GfxPadsPics.values()[i];
            GfxPadsPicsGlow pathPadSelected = GfxPadsPicsGlow.values()[i];

            pads[i+3] = new Picture(80 + 270 * (i+3), 360, pathPad.getPath());
            pads[i+3].draw();

            padsSelected[i+3] = new Picture(80 + 270 * (i+3), 360, pathPadSelected.getPath());

            pads[i+8] = new Picture(80 + 270 * (i+3), 620, pathPad.getPath());
            pads[i+8].draw();

            padsSelected[i+8] = new Picture(80 + 270 * (i+3), 620, pathPadSelected.getPath());
        }

    }

    public void selectPad(int index) {
        System.out.println(index);
        padsSelected[index].draw();
    }

    public void unselectPad(int index) {
        System.out.println(index);
        padsSelected[index].delete();
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

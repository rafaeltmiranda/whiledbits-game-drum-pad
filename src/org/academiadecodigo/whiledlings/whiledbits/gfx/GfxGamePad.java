package org.academiadecodigo.whiledlings.whiledbits.gfx;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.whiledlings.whiledbits.Game;

public class GfxGamePad {

    private Picture drums, drumsSelected, samples, samplesSelected, notes, notesSelected, mcsSelected;
    private Picture[] pads = new Picture[10];
    private Picture[] padsSelected = new Picture[10];
    private Picture neon;
    private Picture logo;
    private Rectangle view;


    public void drawPad(){

        // InitializeObjects
        initializeAllGfx();

        // Draw Initial Objects
        drawInitialGfx();

    }

    public void initializeAllGfx() {

        // General
        view = new Rectangle(0,0,1440,900);
        view.setColor(Color.BLACK);
        neon = new Picture(0, 0, Game.resourcesPathImages + "backGroundNeon_1.png");
        logo = new Picture(80, 80, Game.resourcesPathImages + "logo.png");

        // GroupSounds Selectors
        drums = new Picture(660, 130, Game.resourcesPathImages + "buttons/functional/drum.png");
        drumsSelected = new Picture(660,130, Game.resourcesPathImages + "buttons/functional/drumGlow.png");

        samples = new Picture(930, 130, Game.resourcesPathImages + "buttons/functional/sample.png");
        samplesSelected = new Picture(930, 130,  Game.resourcesPathImages + "buttons/functional/sampleGlow.png");

        notes = new Picture(1200, 130, Game.resourcesPathImages + "buttons/functional/notes.png");
        notesSelected = new Picture(1200, 130, Game.resourcesPathImages + "buttons/functional/notesGlow.png");

        mcsSelected = new Picture(660,50, Game.resourcesPathImages +"buttons/functional/mcsPad.png");

        // Pads
        for (int i = 0 ; i <= 2 ; i++ ) {

            GfxPadsPics pathPad = GfxPadsPics.values()[i];
            GfxPadsPicsGlow pathPadSelected = GfxPadsPicsGlow.values()[i];

            pads[i] = new Picture(80 + 270 * i, 360, pathPad.getPath());
            padsSelected[i] = new Picture(80 + 270 * i, 360, pathPadSelected.getPath());

            pads[i+5] = new Picture(80 + 270 * i, 620, pathPad.getPath());
            padsSelected[i+5] = new Picture(80 + 270 * i, 620, pathPadSelected.getPath());

        }

        for (int i = 0 ; i < 2 ; i++ ) {
            GfxPadsPics pathPad = GfxPadsPics.values()[i];
            GfxPadsPicsGlow pathPadSelected = GfxPadsPicsGlow.values()[i];

            pads[i+3] = new Picture(80 + 270 * (i+3), 360, pathPad.getPath());
            padsSelected[i+3] = new Picture(80 + 270 * (i+3), 360, pathPadSelected.getPath());

            pads[i+8] = new Picture(80 + 270 * (i+3), 620, pathPad.getPath());
            padsSelected[i+8] = new Picture(80 + 270 * (i+3), 620, pathPadSelected.getPath());
        }
    }

    public void drawInitialGfx() {

        // General
        view.fill();
        neon.draw();
        logo.draw();

        // GroupSounds Selector
        drums.draw();
        samples.draw();
        notes.draw();

        // Pads
        for (int i=0 ; i<10 ; i++) {
            pads[i].draw();
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
        mcsSelected.delete();
    }

    public void selectSampleGroup() {
        drumsSelected.delete();
        samplesSelected.draw();
        notesSelected.delete();
        mcsSelected.delete();
    }

    public void selectNotesGroup() {
        drumsSelected.delete();
        samplesSelected.delete();
        notesSelected.draw();
        mcsSelected.delete();
    }

    public void selectMcsGroup() {

        drumsSelected.delete();
        samplesSelected.delete();
        notesSelected.delete();
        mcsSelected.draw();
    }




}
package org.academiadecodigo.whiledlings.whiledbits;


import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsNotes;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsSample;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class Game {

    private SoundsGroup selectedGroup;
    private PadsSample drums = new PadsSample(SoundsGroup.DRUMS);
    private PadsSample samples = new PadsSample(SoundsGroup.SAMPLES);
    private PadsNotes notes = new PadsNotes(SoundsGroup.NOTES);

    public void startPad() {

        GfxGamePad gfxGamePad = new GfxGamePad();
        gfxGamePad.drawPad();

        selectedGroup = SoundsGroup.DRUMS;


    }

}

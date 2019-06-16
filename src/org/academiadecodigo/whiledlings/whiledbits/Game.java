package org.academiadecodigo.whiledlings.whiledbits;


import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.pads.Pads;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsNotes;
import org.academiadecodigo.whiledlings.whiledbits.pads.PadsSample;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;


public class Game {

    private SoundsGroup selectedGroup;
    private Pads selectedPadGroup;
    private GfxGamePad gfxGamePad;
    private PadsSample drums;
    private PadsNotes samples;
    private PadsNotes notes;
    private PadsNotes mcs;

    public void startPad() {

        gfxGamePad = new GfxGamePad();
        gfxGamePad.drawPad();

        drums = new PadsSample(SoundsGroup.DRUMS, gfxGamePad);
        samples = new PadsNotes(SoundsGroup.SAMPLES, gfxGamePad);
        notes = new PadsNotes(SoundsGroup.NOTES, gfxGamePad);
        mcs = new PadsNotes(SoundsGroup.MCS, gfxGamePad);

        selectGroup(SoundsGroup.DRUMS);

        Player player = new Player(drums, samples, notes, mcs, this);
        player.init();

    }

    public void selectGroup(SoundsGroup soundsGroup) {

        selectedGroup = soundsGroup;

        switch (selectedGroup) {
            case DRUMS:
                selectedPadGroup = drums;
                gfxGamePad.selectDrumGroup();
                redrawPadsGroupGfx(drums);
                break;
            case SAMPLES:
                selectedPadGroup = samples;
                gfxGamePad.selectSampleGroup();
                redrawPadsGroupGfx(samples);
                break;
            case NOTES:
                selectedPadGroup = notes;
                gfxGamePad.selectNotesGroup();
                redrawPadsGroupGfx(notes);
                break;
            case MCS:
                selectedPadGroup = mcs;
                gfxGamePad.selectSampleGroup();
                redrawPadsGroupGfx(mcs);
        }



    }

    public SoundsGroup getSelectedGroup() {
        return selectedGroup;
    }

    public Pads getSelectedPadGroup() {
        return selectedPadGroup;
    }

    private void redrawPadsGroupGfx(Pads pad) {

        for (int i=0; i<10; i++) {

            if (pad.activePad() != null) {
                if (pad.activePad()[i]) {
                    gfxGamePad.selectPad(i);
                    continue;
                }
                gfxGamePad.unselectPad(i);
            }

        }

    }

}

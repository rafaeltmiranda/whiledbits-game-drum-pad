package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsNotes extends Pads{

    private SoundsGroup soundsGroup;

    public PadsNotes (SoundsGroup soundsGoup, GfxGamePad gfxGamePad) {

        this.soundsGroup = soundsGoup;

    }


    @Override
    public void padPressed(int pad) {

    }

    @Override
    public void padReleased(int pad) {

    }

    @Override
    public boolean[] activePad() {
        return null;
    }
}

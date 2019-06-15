package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsSample extends Pads{

    private SoundsGroup soundsGroup;
    private GfxGamePad gfxGamePad;

    public PadsSample(SoundsGroup soundsGroup, GfxGamePad gfxGamePad) {

        this.soundsGroup = soundsGroup;
        this.gfxGamePad = gfxGamePad;

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

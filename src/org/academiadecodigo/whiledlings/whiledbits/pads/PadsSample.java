package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsSample extends Pads{

    private SoundsGroup soundsGroup;

    public PadsSample(SoundsGroup soundsGroup) {

        this.soundsGroup = soundsGroup;

    }


    @Override
    public void padPressed(int pad) {

    }

    @Override
    public void padReleased(int pad) {

    }

    @Override
    public int activePad() {
        return 0;
    }
}

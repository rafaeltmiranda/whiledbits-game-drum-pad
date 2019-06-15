package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsSample extends Pads{

    private SoundsGroup soundsGroup;
<<<<<<< HEAD
    private boolean[] playing;
=======
    private GfxGamePad gfxGamePad;
>>>>>>> 751099ec684b3b0a619452edd01ba3c89ad1d88d

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
<<<<<<< HEAD
        return playing;
=======
        return null;
>>>>>>> 751099ec684b3b0a619452edd01ba3c89ad1d88d
    }
}

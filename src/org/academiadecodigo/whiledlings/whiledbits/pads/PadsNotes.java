package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsNotes extends Pads{

    private SoundsGroup soundsGroup;
    private SoundMechanism sound;

    public PadsNotes (SoundsGroup soundsGroup) {

        this.soundsGroup = soundsGroup;

    }


    @Override
    public void padPressed(int pad) {

        switch (pad) {

            case 0:
                sound = new SoundMechanism(PathNotes.PAD_0.getPath());
                sound.play(true);
                break;

            case 1:
                sound = new SoundMechanism(PathNotes.PAD_1.getPath());
                sound.play(true);
                break;

            case 2:
                sound = new SoundMechanism(PathNotes.PAD_2.getPath());
                sound.play(true);
                break;

            case 3:
                sound = new SoundMechanism(PathNotes.PAD_3.getPath());
                sound.play(true);
                break;

            case 4:
                sound = new SoundMechanism(PathNotes.PAD_4.getPath());
                sound.play(true);
                break;

            case 5:
                sound = new SoundMechanism(PathNotes.PAD_5.getPath());
                sound.play(true);
                break;

            case 6:
                sound = new SoundMechanism(PathNotes.PAD_6.getPath());
                sound.play(true);
                break;

            case 7:
                sound = new SoundMechanism(PathNotes.PAD_7.getPath());
                sound.play(true);
                break;

            case 8:
                sound = new SoundMechanism(PathNotes.PAD_8.getPath());
                sound.play(true);
                break;

            case 9:
                sound = new SoundMechanism(PathNotes.PAD_9.getPath());
                sound.play(true);
                break;
        }
    }

    @Override
    public void padReleased(int pad) {

    }

    @Override
    public int activePad() {
        return -1;
    }
}

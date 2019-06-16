package org.academiadecodigo.whiledlings.whiledbits.pads;

import org.academiadecodigo.whiledlings.whiledbits.Game;
import org.academiadecodigo.whiledlings.whiledbits.gfx.GfxGamePad;
import org.academiadecodigo.whiledlings.whiledbits.sound.PathDrums;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundMechanism;
import org.academiadecodigo.whiledlings.whiledbits.sound.SoundsGroup;

public class PadsSample extends Pads{

    private SoundsGroup soundsGroup;
    private SoundMechanism[] sound;
    private GfxGamePad gfxGamePad;
    private boolean[] playing;


    public PadsSample(SoundsGroup soundsGroup, GfxGamePad gfxGamePad) {

        this.gfxGamePad = gfxGamePad;
        this.soundsGroup = soundsGroup;

        playing = new boolean[10];
        sound = new SoundMechanism[10];

        for(int i=0; i<sound.length;i++){
            sound[i]= new SoundMechanism(PathDrums.values()[i].getPath());
            playing[i] = false;
        }
    }


    @Override
    public void padPressed(int pad) {
        if(!playing[pad]) {
            sound[pad].setLoop(Game.soundLoop);
            gfxGamePad.selectPad(pad);
            playing[pad] = true;
            return;
        }
        sound[pad].stop();
        gfxGamePad.unselectPad(pad);
        playing[pad]=false;
    }

    @Override
    public void padReleased(int pad) {
    }

    @Override
    public boolean[] activePad() {
        return playing;
    }

    @Override
    public void stopAllSongs() {
        for (int i = 0; i < sound.length; i++){
            sound[i].stop();
        }
    }
}

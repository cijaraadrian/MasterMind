package controllers;

import utils.Codes;
import utils.Track;

public class ControllerTracks {

    private Track track;

    public ControllerTracks() {
        this.track = new Track();
    }

    public void SetTracks(Codes codes) {
        this.track.calculateTrack(codes);
    }

    public Track getTracks() {
        return this.track;
    }

}

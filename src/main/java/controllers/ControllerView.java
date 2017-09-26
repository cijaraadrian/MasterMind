package controllers;

import utils.Codes;
import utils.Track;
import views.View;

public class ControllerView {
    private View view;

    public ControllerView() {
        view = new View();
    }

    public String GetUserCode() {
        return view.GetUserCode();
    }

    public String GetPlayMode() {
        return view.GetPlayMode();
    }

    public void Win() {
        view.Win();

    }

    public void ShowTracks(Track track) {
        view.ShowTracks(track);

    }

    public void ShowResult(String password) {
        view.ShowResult(password);

    }

    public void ShowTry(Codes codes) {
        view.ShowTry(codes);// TODO Auto-generated method stub

    }

    public String Continue() {
        return view.Continue();
    }

}

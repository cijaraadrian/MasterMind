package views;

import utils.Codes;
import utils.Track;

public class View {
    
    private ViewConsole viewConsole;
    
    public View() {
        viewConsole = new ViewConsole();
    }
    
    public String GetPlayMode() {
        return viewConsole.GetPlayMode();
    }

    public String GetUserCode() {
        return viewConsole.GetUserConsole();
    }

    public void Win() {
        viewConsole.ShowWin();        
    }

    public void ShowTracks(Track track) {
        viewConsole.ShowTracks(track);        
    }

    public void ShowResult( String password) {
        viewConsole.ShowResult(password);        
    }

    public void ShowTry(Codes codes) {
        viewConsole.ShowTry(codes);        
    }

    public String Continue() {
        return viewConsole.Continue();
    }
}

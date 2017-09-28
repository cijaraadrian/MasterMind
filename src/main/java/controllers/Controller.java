package controllers;

public class Controller {

    private ControllerView controllerView;

    private ControllerCodes controllerCodes;

    private ControllerTypeOfGame controllerTypeOfGame;

    private ControllerTracks controllerTracks;
    
    private ControllerGet controllerGet;

    private int trys;

    public Controller() {
        this.controllerView = new ControllerView();
        this.controllerCodes = new ControllerCodes();
        this.controllerTypeOfGame = new ControllerTypeOfGame();
        this.controllerTracks = new ControllerTracks();
        this.controllerGet = new ControllerGet();
        this.trys = 0;
    }

    public void GetUserCode() {        
        controllerGet.GetUserCode(controllerTypeOfGame,controllerView,controllerCodes);
    }

    public void PlayMode() {
        controllerGet.GetPlayMode(controllerView,controllerTypeOfGame);        
        this.trys = 0;
    }

    public void GeneratePassWord() {
        controllerCodes.GeneratePassword();
    }

    public boolean isVictory() {
        return controllerCodes.isVictory();
    }

    public void Win() {
        controllerView.Win();
    }

    public boolean end() {
        return this.isVictory() || this.trys == 10;
    }

    public void ShowTracks() {
        controllerTracks.SetTracks(controllerCodes.GetCodes());
        controllerView.ShowTry(controllerCodes.GetCodes());
        controllerView.ShowTracks(controllerTracks.getTracks());
        this.trys++;
    }

    public void ShowResult() {
        controllerView.ShowResult(this.controllerCodes.GetPassword());
    }

    public boolean Play() {
        return controllerView.Continue().startsWith("S");
    }

}

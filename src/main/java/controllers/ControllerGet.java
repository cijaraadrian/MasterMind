package controllers;

public class ControllerGet {
    

    public void GetUserCode(ControllerTypeOfGame CtypeOfGame, ControllerView Cview, ControllerCodes Ccodes) {
        String code = "";
        boolean ok = false;

        switch (CtypeOfGame.GetTypeOfGame()) {
        case "0":
            do {
                code = Cview.GetUserCode();
                ok = Ccodes.isValid(code);
            } while (!ok);
            Ccodes.SetUserCode(code);
            break;
        case "1":
            code = Ccodes.GetRandomCode();
            Ccodes.SetUserCode(code);
            break;
        }
        
    }

    public void GetPlayMode(ControllerView Cview, ControllerTypeOfGame CtypeOfGame) {
        boolean ok = false;
        String playMode = "";
        do {
            playMode = Cview.GetPlayMode();
            ok = CtypeOfGame.valid(playMode);
        } while (!ok);
        CtypeOfGame.SetMode(playMode);
        
    }

}

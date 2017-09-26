package controllers;

public class Machine {
    public void Init() {
        Controller MachineController = new Controller();
        do {
            MachineController.PlayMode();
            MachineController.GeneratePassWord();
            do {
                MachineController.GetUserCode();
                if (MachineController.isVictory()) {
                    MachineController.Win();
                    return;
                } else {
                    MachineController.ShowTracks();
                }
            } while (!MachineController.end());
            MachineController.ShowResult();

        } while (MachineController.Play());
    }

}

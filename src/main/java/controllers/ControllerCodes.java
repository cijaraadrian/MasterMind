package controllers;

import utils.Codes;
import utils.Colors;

public class ControllerCodes {

    private Codes codes;

    private Colors color;

    public ControllerCodes() {
        codes = new Codes();
        color = new Colors();
    }

    public void SetUserCode(String code) {
        this.codes.setUserCode(code);
    }

    public Codes GetCodes() {
        return this.codes;
    }

    public boolean isValid(String code) {
        boolean ok = false;
        int i = 1;

        do {
            ok = this.color.isIn(code.substring(i - 1, i));
            i++;
        } while (!ok && i <= codes.getLenght());

        return ok;
    }

    public String GetRandomCode() {
        return this.codes.generateRandomCode();
    }

    public void GeneratePassword() {
        this.codes.generatePassword();
    }

    public boolean isVictory() {
        return codes.equals();
    }

    public String GetPassword() {
        return this.codes.getpassword();
    }

}

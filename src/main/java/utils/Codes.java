package utils;

public class Codes {

    private String userCode;

    private String password;

    private int lenght;

    public Codes() {
        userCode = "";
        password = "";
        lenght = 4;
    }

    public void setUserCode(String code) {
        userCode = code;
    }

    public String getuserCode() {
        return userCode;
    }

    public void setpassword(String code) {
        this.password = code;
    }

    public String getpassword() {
        return password;
    }

    public int getLenght() {
        return lenght;
    }

    public void generatePassword() {
        this.password = this.generateRandomCode();
    }

    public String generateRandomCode() {
        String code = "";
        Colors valids = new Colors();

        for (int i = 1; i <= 4; i++) {
            code += (valids.get((int) (Math.random() * valids.size())));
        }
        return code;
    }

    public boolean equals() {
        return password.equals(userCode);
    }

    public String getLetterUser(int position) {
        return this.userCode.substring(position - 1, position);
    }

    public String getLetterPassword(int position) {
        return this.password.substring(position - 1, position);
    }

    public boolean isInPassword(String letter) {
        return this.password.contains(letter);
    }
}

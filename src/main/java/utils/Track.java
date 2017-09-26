package utils;

public class Track {
    private int dead;

    private int hurt;

    public Track() {
        dead = 0;
        hurt = 0;
    }

    public int getDead() {
        return dead;
    }

    public int getHurt() {
        return hurt;
    }

    public void calculateTrack(Codes codes) {
        String procesed = "";
        String letterUser = "";
        String letterPassword = "";
        this.initilize();
        for (int i = 1; i <= codes.getLenght(); i++) {

            letterUser = codes.getLetterUser(i);
            letterPassword = codes.getLetterPassword(i);

            if (letterPassword.contains(letterUser)) {
                this.dead++;
            } else if (codes.isInPassword(letterUser) && !procesed.contains(letterUser)) {
                this.hurt++;
                procesed += letterUser;
            }
        }
    }

    private void initilize() {
        this.dead = 0;
        this.hurt = 0;
    }
}

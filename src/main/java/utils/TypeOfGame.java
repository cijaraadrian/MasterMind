package utils;

public class TypeOfGame {
    private String type;

    public void SetType(String type) {
        this.type = type;
    }

    public boolean isIn(String data) {
        return data.contentEquals("0") || data.contentEquals("1");
    }

    public String getType() {
        // TODO Auto-generated method stub
        return this.type;
    }

}

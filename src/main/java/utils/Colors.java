package utils;

import java.util.ArrayList;

public class Colors {

    private static ArrayList<String> ArrayColor = new ArrayList<String>();

    public Colors() {

        ArrayColor.add("A");
        ArrayColor.add("R");
        ArrayColor.add("V");
        ArrayColor.add("Z");
        ArrayColor.add("B");
        ArrayColor.add("N");
    }

    public int size() {
        // TODO Auto-generated method stub
        return ArrayColor.size();
    }

    public String get(int d) {
        // TODO Auto-generated method stub
        return ArrayColor.get(d);
    }

    public boolean isIn(String letter) {
        return ArrayColor.contains(letter);
    }

}

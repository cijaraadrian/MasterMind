package views;

import utils.Codes;
import utils.IO;
import utils.Track;

public class ViewConsole {
    
    private IO io;
    
    public ViewConsole() {
        io = new IO();
    }
    
    public String GetPlayMode() {
        return io.read("Elije el modo de juego, 0 - Contra la maquina, 1 - Demo", 1);
    }
    
    public String GetUserConsole() {
        return io.read("Elije codigo de colores A-amarillo, R-rojo, V-verde, Z-azul,B-blanco, N-negro",4 );
    }

    public void ShowWin() {
        io.write("Has ganado");
    }

    public void ShowTracks(Track track) { 
        io.write("Heridos : " + track.getHurt() +" muertos : " + track.getDead());
    }

    public void ShowResult( String password) {
        
        io.write("Has perdido , el codigo secreto era "+password);
        
    }

    public void ShowTry(Codes codes) {
        io.write("Se intentó "+codes.getuserCode());
    }

    public String Continue() {
       return io.read("¿Otra partida? S/N",1);
    }

}

package Source;

import java.awt.event.KeyEvent;

public class ValidarNumeros {
    
    public void SoloNumeros (KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }
}

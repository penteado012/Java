import java.awt.*;
import java.awt.event.*;

class fecharJanela extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        System.exit(0);
    }
}

public class Form extends Frame{    
    public static void main(String[] args) {
        Form f = new Form();
        
        Label l1 = new Label("Primeiro", Label.LEFT);
        Label l2 = new Label("Segundo", Label.CENTER);
        Label l3 = new Label("Terceiro", Label.RIGHT);

        f.setTitle("Exemplo com Labels");
        f.setLocation(50,50);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(new Label("... é o fim"));

        f.setVisible(true);
        f.addWindowListener(new fecharJanela());        
    }
}

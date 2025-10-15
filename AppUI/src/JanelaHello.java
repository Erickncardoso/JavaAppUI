import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaHello {
    public static void main(String[] args) {

        //DONE: Criar janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Trabalhand com Frames e Labels");
        frame.setSize(800,600);//Definindo tamanho da janela

        //Calculopara a posição centealizada da jaenla

        Dimension tamenhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (tamenhoTela.width - frame.getWidth()) /2;
        int y = (tamenhoTela.height - frame.getHeight()) / 2;
        frame.setLocation(x,y);

        //Indicando função para o botão fechar
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        //DONE: Criar Elementos de interface
        Label label = new Label("Bem-vindo(a) ao AWT!");
        label.setAlignment(Label.CENTER);
        frame.add(label);



        //Exbindo janela
        frame.setVisible(true);
    }
}
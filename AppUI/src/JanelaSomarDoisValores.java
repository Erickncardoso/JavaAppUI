import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JanelaSomarDoisValores {

    public static void main(String[] args) {
        //DONE: Criar janela
        //Elemento Frame - A nossa Janela
        Frame frame = new Frame("Soma de Dois Valores");
        frame.setSize(600,300);//Definindo tamanho da janela

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

        //Definindo que a janela tera layout com subdivisões
        frame.setLayout(new GridBagLayout());

        Panel painelCentralizado = new Panel(new FlowLayout(FlowLayout.CENTER));

        //TODO: Criação dos componentes
        Label labelValorA = new Label("Valor A:");
        Label labelValorB = new Label("Valor B:");
        Label labelResultado= new Label("Valor Resultado:");

        TextField campoValorA = new TextField(5);
        TextField campoValorB = new TextField(5);
        TextField resultado = new TextField(5);
        resultado.setEditable(false);

        Button botaoSomar = new Button("Somar");
        Button botaoLimpar = new Button("Limpar");


        //Adicionando os componentes
        frame.add(painelCentralizado);

        painelCentralizado.add(labelValorA);
        painelCentralizado.add(campoValorA);
        painelCentralizado.add(labelValorB);
        painelCentralizado.add(campoValorB);
        painelCentralizado.add(botaoSomar);
        painelCentralizado.add(labelResultado);
        painelCentralizado.add(resultado);
        painelCentralizado.add(botaoLimpar);

        //Listener para o botão somar
        botaoSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    double valorA = Double.parseDouble(campoValorA.getText());
                    double valorB = Double.parseDouble(campoValorA.getText());
                    double soma = valorA + valorB;
                    resultado.setText(String.valueOf(soma));
                }
                catch (NumberFormatException exception){
                    System.out.println(exception);
                    resultado.setText("Erro!");

                }
            }
        });


        //Listener de botão Limpar
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                campoValorA.setText("");
                campoValorB.setText("");
                resultado.setText("");
            }
        });


        //Exibindo Janela
        frame.setVisible(true);
    }

}

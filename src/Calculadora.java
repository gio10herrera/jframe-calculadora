import javax.swing.*;
import java.awt.*;

public class Calculadora {
    static JFrame jFrameCalculadora;
    static JLabel txtLabelX, txtLabelY, txtLabelResult;
    static JTextField txtFieldX, txtFieldY, txtFieldResult;
    static JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPunto, btn0, btnCe, btnSumar, btnRestar, btnResultado, btnMultiplicar, btnDividir, btnC;
    static int x, y;
    static JPanel panelBotones = new JPanel(new GridLayout(6, 3, 5, 5));
    static JPanel panelText = new JPanel(new GridLayout(1, 1, 5, 5));

    public static void main(String[] args) {
        inicializarJFrameCalculadora();
        instanciarComponentes();
    }

    private static void instanciarComponentes() {
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btnPunto = new JButton(".");
        btn0 = new JButton("0");
        btnCe = new JButton("CE");
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnResultado = new JButton("=");
        btnMultiplicar = new JButton("*");
        btnDividir = new JButton("/");
        btnC = new JButton("C");
    }

    private static void inicializarJFrameCalculadora() {
        //creacion del JFrame
        jFrameCalculadora = new JFrame();
        jFrameCalculadora.setSize(400, 400);
        //jFrameInterfaz.pack();
        jFrameCalculadora.setLocationRelativeTo(null);
        jFrameCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrameCalculadora.setResizable(false);
        jFrameCalculadora.setTitle("Calculadora");
    }
}

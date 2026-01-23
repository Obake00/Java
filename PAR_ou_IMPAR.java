import javax.swing.*;
import java.awt.*;

public class PAR_ou_IMPAR {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Par ou Ímpar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLocationRelativeTo(null);

        JLabel titulo = new JLabel("=== VERIFICADOR DE PAR E ÍMPAR ===");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField campoNumero = new JTextField();

        JButton botaoVerificar = new JButton("Verificar");

        JLabel resultado = new JLabel("", SwingConstants.CENTER);

        botaoVerificar.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(campoNumero.getText());

                if (numero % 2 == 0) {
                    resultado.setText("O número digitado (" + numero + ") é PAR");
                } else {
                    resultado.setText("O número digitado (" + numero + ") é ÍMPAR");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                        frame,
                        "Digite um número válido!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        });

        frame.setLayout(new GridLayout(4, 1, 5, 5));
        frame.add(titulo);
        frame.add(campoNumero);
        frame.add(botaoVerificar);
        frame.add(resultado);

        frame.setVisible(true);
    }
}

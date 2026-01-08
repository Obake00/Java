import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class MegaSenaFrame extends JFrame {

    private JTextArea areaTexto;
    private ArrayList<Integer> loto;

    public MegaSenaFrame() {
        setTitle("Mega Sena");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Lista de números de 0 a 60
        loto = new ArrayList<>();
        for (int i = 0; i <= 60; i++) {
            loto.add(i);
        }

        JLabel titulo = new JLabel("MEGA SENA", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));

        JButton btnSimples = new JButton("Jogo Simples");
        JButton btnVarios = new JButton("Vários Jogos");
        JButton btnSair = new JButton("Sair");

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 14));

        JScrollPane scroll = new JScrollPane(areaTexto);

        btnSimples.addActionListener(e -> jogoSimples());
        btnVarios.addActionListener(e -> variosJogos());
        btnSair.addActionListener(e -> {
            areaTexto.append("OBRIGADO!!!\n");
            dispose();
        });

        JPanel botoes = new JPanel(new GridLayout(1, 3, 5, 5));
        botoes.add(btnSimples);
        botoes.add(btnVarios);
        botoes.add(btnSair);

        setLayout(new BorderLayout(10, 10));
        add(titulo, BorderLayout.NORTH);
        add(botoes, BorderLayout.CENTER);
        add(scroll, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void jogoSimples() {
        Collections.shuffle(loto);
        var jogo = loto.subList(0, 6);
        Collections.sort(jogo);
        areaTexto.append("JOGO >>> " + jogo + "\n\n");
    }

    private void variosJogos() {
        String entrada = JOptionPane.showInputDialog(
                this,
                "Quantos jogos deseja sortear?"
        );

        if (entrada == null) return;

        try {
            int total = Integer.parseInt(entrada);

            for (int i = 0; i < total; i++) {
                Collections.shuffle(loto);
                var jogo = loto.subList(0, 6);
                Collections.sort(jogo);
                areaTexto.append("JOGO >>> " + jogo + "\n");
            }
            areaTexto.append("\n");

        } catch (NumberFormatException e) {
            mostrarErro(entrada);
        }
    }

    private void mostrarErro(String valor) {
        JOptionPane.showMessageDialog(
                this,
                valor + " NÃO É UMA ENTRADA VÁLIDA!",
                "Erro",
                JOptionPane.ERROR_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MegaSenaFrame::new);
    }
}

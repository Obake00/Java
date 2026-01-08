import javax.swing.*;
import java.awt.*;

public class EstrategiaGol {
    public static class EstrategiaDoGolFrame extends JFrame {

        private JTextArea areaTexto;

        public EstrategiaDoGolFrame() {
            setTitle("Estratégia do Gol");
            setSize(450, 420);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null);

            JLabel titulo = new JLabel("ESTRATÉGIA DO GOL!", SwingConstants.CENTER);
            titulo.setFont(new Font("Arial", Font.BOLD, 18));
            titulo.setForeground(Color.CYAN);

            areaTexto = new JTextArea();
            areaTexto.setEditable(false);
            areaTexto.setFont(new Font("Monospaced", Font.PLAIN, 14));

            JScrollPane scroll = new JScrollPane(areaTexto);

            JButton btnAnalisar = new JButton("Fazer Análise");
            JButton btnSair = new JButton("Sair");

            btnAnalisar.addActionListener(e -> analisar());
            btnSair.addActionListener(e -> finalizar());

            JPanel botoes = new JPanel();
            botoes.add(btnAnalisar);
            botoes.add(btnSair);

            setLayout(new BorderLayout(10, 10));
            add(titulo, BorderLayout.NORTH);
            add(scroll, BorderLayout.CENTER);
            add(botoes, BorderLayout.SOUTH);

            textoInicial();

            setVisible(true);
        }

        private void textoInicial() {
            areaTexto.append("------------------\n");
            areaTexto.append("ESTRATÉGIA DO GOL!\n");
            areaTexto.append("------------------\n\n");
            areaTexto.append("Esta estratégia se baseia em avaliar um jogo\n");
            areaTexto.append("A PARTIR do minuto 70!\n");
            areaTexto.append("Pois a taxa de acerto é maior após esse minuto.\n\n");
        }

        private void analisar() {
            try {
                String ataqueStr = JOptionPane.showInputDialog(
                        this,
                        "Insira o maior número de ataques perigosos:"
                );
                if (ataqueStr == null) return;

                int ataque = Integer.parseInt(ataqueStr);

                int tempo;
                while (true) {
                    String tempoStr = JOptionPane.showInputDialog(
                            this,
                            "Insira o tempo do jogo (somente minutos, a partir de 70):"
                    );
                    if (tempoStr == null) return;

                    tempo = Integer.parseInt(tempoStr);

                    if (tempo >= 70 && tempo <= 120) break;

                    JOptionPane.showMessageDialog(
                            this,
                            "DADOS INVÁLIDOS! Tempo deve ser entre 70 e 120.",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE
                    );
                }

                areaTexto.append("PROCESSANDO...\n\n");

                double ponto = (double) ataque / tempo;

                if (ponto < 0.98) {
                    areaTexto.append(
                            String.format(
                                    "Pontuação: %.2f\nEntrada NÃO muito favorável!\n\n",
                                    ponto
                            )
                    );
                } else {
                    areaTexto.append(
                            String.format(
                                    "Pontuação: %.2f\nEntrada VALE A PENA considerar!\n\n",
                                    ponto
                            )
                    );
                }

                areaTexto.append(
                        "ENTRADA PARA 1 GOL + NA PARTIDA.\n" +
                                "Mais gols ficam a seu critério!\n\n"
                );

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(
                        this,
                        "Insira apenas valores numéricos!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        private void finalizar() {
            areaTexto.append("Finalizando programa...\n");
            areaTexto.append("FIM DO PROGRAMA\n");
            dispose();
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(EstrategiaDoGolFrame::new);
        }
    }

}

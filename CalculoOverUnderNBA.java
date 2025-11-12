import javax.swing.JOptionPane;

public class CalculoOverUnderNBA {

    public static void main(String[] args) {
        int resp = 0;

        JOptionPane.showMessageDialog(null, "=-=-=-= Cálculo OVER/UNDER para NBA =-=-=-=");

        while (resp != 3) {
            String menu = """
                    Escolha uma das opções abaixo:
                    [1] Média de pontos
                    [2] Apostas para OVER ou UNDER
                    [3] Sair
                    """;

            resp = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (resp) {
                case 1 -> {
                    JOptionPane.showMessageDialog(null,
                            "Para esta opção, tenha os 4 últimos jogos e pontuações positivas e negativas do time!");

                    // Pontos FEITOS
                    double pf1 = Double.parseDouble(JOptionPane.showInputDialog("Pontos FEITOS - Jogo 1:"));
                    double pf2 = Double.parseDouble(JOptionPane.showInputDialog("Pontos FEITOS - Jogo 2:"));
                    double pf3 = Double.parseDouble(JOptionPane.showInputDialog("Pontos FEITOS - Jogo 3:"));
                    double pf4 = Double.parseDouble(JOptionPane.showInputDialog("Pontos FEITOS - Jogo 4:"));

                    // Pontos SOFRIDOS
                    double ps1 = Double.parseDouble(JOptionPane.showInputDialog("Pontos SOFRIDOS - Jogo 1:"));
                    double ps2 = Double.parseDouble(JOptionPane.showInputDialog("Pontos SOFRIDOS - Jogo 2:"));
                    double ps3 = Double.parseDouble(JOptionPane.showInputDialog("Pontos SOFRIDOS - Jogo 3:"));
                    double ps4 = Double.parseDouble(JOptionPane.showInputDialog("Pontos SOFRIDOS - Jogo 4:"));

                    double mediaPos = (pf1 + pf2 + pf3 + pf4) / 4;
                    double mediaNeg = (ps1 + ps2 + ps3 + ps4) / 4;

                    JOptionPane.showMessageDialog(null,
                            String.format("A média de pontos FEITOS é %.1f\nA média de pontos SOFRIDOS é %.1f",
                                    mediaPos, mediaNeg));
                }

                case 2 -> {
                    JOptionPane.showMessageDialog(null,
                            "Para este cálculo, tenha os 4 últimos jogos dos 2 times a serem avaliados!");

                    // Time A
                    double pfa1 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos FEITOS - Jogo 1:"));
                    double pfa2 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos FEITOS - Jogo 2:"));
                    double pfa3 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos FEITOS - Jogo 3:"));
                    double pfa4 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos FEITOS - Jogo 4:"));

                    double psa1 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos SOFRIDOS - Jogo 1:"));
                    double psa2 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos SOFRIDOS - Jogo 2:"));
                    double psa3 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos SOFRIDOS - Jogo 3:"));
                    double psa4 = Double.parseDouble(JOptionPane.showInputDialog("Time A - Pontos SOFRIDOS - Jogo 4:"));

                    // Time B
                    double pfb1 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos FEITOS - Jogo 1:"));
                    double pfb2 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos FEITOS - Jogo 2:"));
                    double pfb3 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos FEITOS - Jogo 3:"));
                    double pfb4 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos FEITOS - Jogo 4:"));

                    double psb1 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos SOFRIDOS - Jogo 1:"));
                    double psb2 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos SOFRIDOS - Jogo 2:"));
                    double psb3 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos SOFRIDOS - Jogo 3:"));
                    double psb4 = Double.parseDouble(JOptionPane.showInputDialog("Time B - Pontos SOFRIDOS - Jogo 4:"));

                    double mediaPos1a = (pfa1 + pfa2 + pfa3 + pfa4) / 4;
                    double mediaNeg1a = (psa1 + psa2 + psa3 + psa4) / 4;
                    double mediaPos2b = (pfb1 + pfb2 + pfb3 + pfb4) / 4;
                    double mediaNeg2b = (psb1 + psb2 + psb3 + psb4) / 4;

                    double mediaFinal = (mediaPos1a + mediaNeg1a + mediaPos2b + mediaNeg2b) / 2;

                    JOptionPane.showMessageDialog(null,
                            String.format("O resultado da verificação dos 2 times retorna uma linha de entrada em torno de %.1f pontos.",
                                    mediaFinal));
                }

                case 3 -> JOptionPane.showMessageDialog(null, "Finalizando o programa...");

                default -> JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA! Escolha conforme a tabela!");
            }
        }

        JOptionPane.showMessageDialog(null, "=-=-=-= FIM DO PROGRAMA =-=-=-");
    }
}

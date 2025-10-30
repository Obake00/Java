import javax.swing.JOptionPane;

public class TesteJSwing {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "A, " + nome + " É o amor da vida do marido dela!!!", "Forever...", JOptionPane.INFORMATION_MESSAGE);
    }
    
}

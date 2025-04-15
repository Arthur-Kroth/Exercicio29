package principal;
import model.Veiculo;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        
        v1.setQuilometros(Integer.parseInt(JOptionPane.showInputDialog("Digite a quilometragem percorrida")));
        v1.setLitros(Integer.parseInt(JOptionPane.showInputDialog("Digite os litros consumidos")));
        
        JOptionPane.showMessageDialog(null, "O consumo de " + v1.Consumo());
    }
}
import javax.swing.JOptionPane;
class avaliacao2
{
    public static void main(String args[])
    {
        float prova1, prova2, prova3, media;

        prova1 = Float.parseFloat(
        JOptionPane.showInputDialog("Digite a nota da primeira prova: "));
        prova2 = Float.parseFloat(
        JOptionPane.showInputDialog("Digite a nota da segunda prova: "));
        prova3 = Float.parseFloat(
        JOptionPane.showInputDialog("Digite a nota da terceira prova: "));

        prova1 = (prova1 * 2) / 10;
        prova2 = (prova2 * 3) / 10;
        prova3 = (prova3 * 5) / 10;
        media = prova1 + prova2 + prova3;

        if (media >= 6)
        {
            JOptionPane.showMessageDialog(null,"Parabés você foi APROVADO com média: "+media);
            System.out.print("Parabés você foi APROVADO com média: "+media);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"REPROVADO com média: "+media);
            System.out.print("REPROVADO com média: "+media);
        }
    }
}
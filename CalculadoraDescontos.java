package controle.desafios.descontos.src;

import javax.swing.*;


public class CalculadoraDescontos {
    public static void main(String[] args) {
        //Obtendo a idade do usuario
        String idade = JOptionPane.showInputDialog("Informe a sua Idade");
        int idadefinal = Integer.parseInt(idade);

        //Condição se a idade for menor que 18
        if (idadefinal <= 18){
           String valorDesconto18 = JOptionPane.showInputDialog("Certo, já que você tem " + idadefinal + " anos, " + " Informe o valor do seu produto para aplicar o desconto:" );
           double valorFinalDesconto18 = Double.parseDouble(valorDesconto18);
           double porcentagemdesconto18 = 20.0;
           double resultadoDescontoFinal18 = valorFinalDesconto18 * (porcentagemdesconto18 /100);
           double resultadoFinal18 = valorFinalDesconto18 - resultadoDescontoFinal18;
           JOptionPane.showInputDialog("O valor Final do seu produto será:"  +  resultadoFinal18);
        }
        //definindo variavel condicional para o periodo de idade maior que 18 ou menor que 30 anos
        boolean ResultadoDescontomaior = idadefinal >=18 && idadefinal<=30;

        //Condição se a idade for maior que 18 e menor ou igual a 30
        if (ResultadoDescontomaior) {
            String valorDesconto2 = JOptionPane.showInputDialog("Certo já que você tem " + idadefinal + " anos" + "Informe o valor do produto para aplicar o desconto");
            double valorFinalDesconto2 = Double.parseDouble(valorDesconto2);
            double porcentagemFesconto2 = 10.0;
            double resultadoDescontofinal2 = valorFinalDesconto2 * (porcentagemFesconto2 / 100);
            double resultadoFinalmaior =  valorFinalDesconto2 - resultadoDescontofinal2;
            JOptionPane.showInputDialog("O valor final do seu produto com o desconto é: " + resultadoFinalmaior);
           //condição se a idade for maior que 30 anos
        } else if (idadefinal >=30) {
             String valorDesconto30 = JOptionPane.showInputDialog("Certo, já que você tem: " + idadefinal + " anos,  " + "Informe o valor do seu produto para aplicar o desconto");
             double valorfinalDesconto30= Double.parseDouble(valorDesconto30);
             double porcentagemDesconto30 = 5.0;
             double resultadoDescontoFinal30 = valorfinalDesconto30  *  (porcentagemDesconto30/100);
             double resultadoFinal30 = valorfinalDesconto30 -resultadoDescontoFinal30;

             JOptionPane.showInputDialog("O valor Final do seu produto com o desconto aplicado é: " + resultadoFinal30 +" Reais");
        }


    }
}

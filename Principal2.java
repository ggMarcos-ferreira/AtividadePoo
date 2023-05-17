/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package postgresql.principal2;

/**
 *
 * @author aluno
 */
public class Principal2 {
    public static void main(String[] args) {
        CadastroDeContas cadastro = new CadastroDeContas();

        Conta conta1 = new ContaDeAgua("José", 10, 15.5, 3.5);
        Conta conta2 = new ContaDeEnergia("Joana", 5, 200, 0.8);
        Conta conta3 = new ContaDeAgua("Adalto", 20, 25.3, 2.9);

        cadastro.adicionarConta(conta1);
        cadastro.adicionarConta(conta2);
        cadastro.adicionarConta(conta3);

        Conta contaEncontrada = cadastro.pesquisarContaPorNome("José");
        if (contaEncontrada != null) {
            System.out.println("Conta encontrada: " + contaEncontrada.nomeDoCliente);
            System.out.println("Valor a ser pago: " + contaEncontrada.calcularValor());
        } else {
            System.out.println("Conta não encontrada.");
        }

        System.out.println("Clientes cadastrados:");
        cadastro.exibirClientesPorNome();

        System.out.println("Valor total de todas as contas cadastradas: " + cadastro.calcularValorTotalContas());
    }
}

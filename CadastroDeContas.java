/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal2;

import java.util.Set;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author aluno
 */
class CadastroDeContas {
    private Set<Conta> contas;

    public CadastroDeContas() {
        contas = new TreeSet<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta pesquisarContaPorNome(String nomeDoCliente) {
        for (Conta conta : contas) {
            if (conta.getNomeDoCliente().equals(nomeDoCliente)) {
                return conta;
            }
        }
        return null;
    }

    public void exibirClientesPorNome() {
        for (Conta conta : contas) {
            System.out.println(conta.getNomeDoCliente());
        }
    }

    public double calcularValorTotalContas() {
        double valorTotal = 0;
        for (Conta conta : contas) {
            valorTotal += conta.calcularValor();
        }
        return valorTotal;
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal2;


/**
 *
 * @author aluno
 */
class Conta implements Comparable<Conta> {
    protected String nomeDoCliente;
    protected int diaDePagamento;

    public Conta(String nomeDoCliente, int diaDePagamento) {
        this.nomeDoCliente = nomeDoCliente;
        this.diaDePagamento = diaDePagamento;
    }

    public double calcularValor() {
        return 0.0;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public int getDiaDePagamento() {
        return diaDePagamento;
    }

    @Override
    public int compareTo(Conta outraConta) {
        return nomeDoCliente.compareTo(outraConta.nomeDoCliente);
    }
}






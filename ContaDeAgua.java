/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal2;

/**
 *
 * @author aluno
 */
class ContaDeAgua extends Conta {
    private double consumoEmMetroCubico;
    private double valorPorMetroCubico;

    public ContaDeAgua(String nomeDoCliente, int diaDePagamento, double consumoEmMetroCubico, double valorPorMetroCubico) {
        super(nomeDoCliente, diaDePagamento);
        this.consumoEmMetroCubico = consumoEmMetroCubico;
        this.valorPorMetroCubico = valorPorMetroCubico;
    }

    @Override
    public double calcularValor() {
        return consumoEmMetroCubico * valorPorMetroCubico + 30;
    }
}

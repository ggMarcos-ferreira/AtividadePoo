/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package postgresql.principal2;

/**
 *
 * @author aluno
 */
class ContaDeEnergia extends Conta {
    private double consumoEmkWh;
    private double tarifaPorkWh;

    public ContaDeEnergia(String nomeDoCliente, int diaDePagamento, double consumoEmkWh, double tarifaPorkWh) {
        super(nomeDoCliente, diaDePagamento);
        this.consumoEmkWh = consumoEmkWh;
        this.tarifaPorkWh = tarifaPorkWh;
    }

    @Override
    public double calcularValor() {
        return consumoEmkWh * tarifaPorkWh + 22;
    }
}

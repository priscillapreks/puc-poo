/* POO - AULA 02:
 * Modificadores de Acesso e Encapsulamento
 * Exercício 2 - Getter e Setter 
 */

package aula02_encapsulamento;

public class Conta {

    private double saldo;
    private String dono;

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
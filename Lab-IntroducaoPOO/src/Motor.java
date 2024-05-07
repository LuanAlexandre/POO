/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
public class Motor {
    int tipo;
    double capacidade;
    int potencia;
    
    Motor() {
        this(1, 2.85, 130);
    }
    
    Motor(int tipo, double capacidade, int potencia) {
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }
    
    public String getTipoString() {
        switch (this.tipo) {
            case 1: return "Gasolina";
            case 2: return "Alcool";
            case 3: return "Flex";
            case 4: return "Diesel";
            case 5: return "Eletrico";
            default: return "Outros";
        }
    }
    
    public String getDescricao() {
        String tipo = "Motor: tipo=" + getTipoString();
        String capacidade = ", capacidade=" + this.capacidade + "L";
        String potencia = ", potencia=" + this.potencia + "CV.";
        String descricao = tipo + capacidade + potencia;
        
        return descricao;
    }
}

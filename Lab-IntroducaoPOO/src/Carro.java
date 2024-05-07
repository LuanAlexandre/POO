/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
public class Carro {
    String marca;
    String modelo;
    Proprietario proprietario;
    Placa placa;
    Motor motor;
    
    Carro(String marca, String modelo, Proprietario proprietario, Placa placa, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.proprietario = proprietario;
        this.placa = placa;
        this.motor = motor;
    }
    
    public String getDescricao() {
        String marca = "Carro " + this.marca + "/";
        String modelo = this.modelo + ".";
        String proprietario = this.proprietario.getDescricao();
        String placa = this.placa.getDescricao();
        String motor = this.motor.getDescricao();
        String carro = marca + modelo + " " + proprietario + " " + placa + " " + motor;
        
        return carro;
        
    }
}

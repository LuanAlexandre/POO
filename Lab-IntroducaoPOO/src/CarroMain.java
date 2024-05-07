/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author axlre
 */
public class CarroMain {
    public static void main (String[] args) {
        //Teste da classe Proprietario
        Proprietario novo = new Proprietario("Luan Barreto", 87248977, 1997);
        Proprietario novoVazio = new Proprietario();
        
        String descricao = novo.getDescricao();
        String descricaoVazio = novoVazio.getDescricao();
        
        int idade = novo.getIdade(2024);
        int idadeVazio = novoVazio.getIdade(2024);
        
        System.out.println(descricao);
        System.out.println(descricaoVazio);
        System.out.println();
        
        //Teste da classe Placa
        Placa novaPlaca = new Placa();
        Placa novaPlacaUm = new Placa("NOT-5238", 3);
        
        String descricaoPlaca = novaPlaca.getDescricao();
        String descricaoPlacaUm = novaPlacaUm.getDescricao();
        
        System.out.println(descricaoPlaca);
        System.out.println(descricaoPlacaUm);
        System.out.println();
        
        //Teste da classe Motor
        Motor motorUm = new Motor();
        Motor motorDois = new Motor(3, 5.9, 220);
        
        String descricaoMotorUm = motorUm.getDescricao();
        String descricaoMotorDois = motorDois.getDescricao();
        
        System.out.println(descricaoMotorUm);
        System.out.println(descricaoMotorDois);
        
        //Teste da classe Carro
        Carro carroUm = new Carro("DeLorean", "DMC-12", novoVazio, novaPlaca, motorUm);
        
        System.out.println(carroUm.getDescricao());
    }
}

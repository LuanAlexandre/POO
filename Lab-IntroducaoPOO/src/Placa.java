/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luan-dev
 */
public class Placa {
   String placa;
   int tipo;
   
   Placa() {
       this("OAT-3966", 6);
   }
   
   Placa(String placa, int tipo) {
       this.placa = placa;
       this.tipo = tipo;
   }
   
   public String getTipoString() {
       switch (this.tipo) {
           case 1: return "Normal";
           case 2: return "Servico";
           case 3: return "Oficial";
           case 4: return "Auto Escola";
           case 5: return "Prototipo";
           case 6: return "Colecionador";
           default: return "Outros";
       }
   }
   
   public boolean temEstacionamentoLivre() {
       switch (this.tipo) {
           case 2: return true;
           case 3: return true;
           default: return false;
       }
   }
   
   public String getDescricao() {
       String tipoPlaca = getTipoString();
       boolean estacionamento = temEstacionamentoLivre();
       
       return "Placa: placa=" + this.placa + ", tipo=" + tipoPlaca + ", estacionamentoLivre=" + estacionamento + ".";
   }
   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapter;

/**
 *
 * @author guilherme
 */
public class Adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mensagem mensagem = new Mensagem();
       mensagem.setDestino("destino42");
       mensagem.setOrigem("origem42");
       mensagem.setTexto("a resposta para a vida o universo e tudo mais, 42!");
       
       SMSDispatcherConcreto smsMensagem = new SMSDispatcherConcreto();
       
       SMSAdapter adaptadorSms = new SMSAdapter(smsMensagem);
       adaptadorSms.enviar(mensagem);
    }
    
}

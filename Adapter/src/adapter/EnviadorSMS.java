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
public class EnviadorSMS implements SMS{

    @Override
    public boolean enviar(Mensagem mensagem) {
        System.out.println("Enviador de mensagens");
        return true;
    }
    
}

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
public class SMSAdapter implements SMS{
private SMSDispatcher sms;

  public SMSAdapter(SMSDispatcher sms){
      this.sms = sms;
  }

    @Override
    public boolean enviar(Mensagem mensagem) {
        sms.send(mensagem.getDestino(), mensagem.getOrigem(), mensagem.getTexto());
    
        return true;
        
        }
        
    }
    


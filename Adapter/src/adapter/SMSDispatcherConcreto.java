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
public class SMSDispatcherConcreto implements SMSDispatcher{

    @Override
    public void send(String target, String origin, String message) {
        System.out.println("SMS Dispatcher\nTarget: "+target+"\nOrgin: "+origin+"\nMessage: "+message+"\n");
    }
    
}

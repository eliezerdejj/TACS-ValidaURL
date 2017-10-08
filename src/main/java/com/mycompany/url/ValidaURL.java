/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.url;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author eliez
 */
public class ValidaURL {
    
    public boolean url(String url){
             
      Pattern protocol = Pattern.compile("http");
      Matcher protocolo = protocol.matcher(url);
      
      Pattern host = Pattern.compile("www");
      Matcher hospede = host.matcher(url);
      
      Pattern domain = Pattern.compile("[a-z]{5,}.\\w{3,3}");
      Matcher dominio = domain.matcher(url);
      
      Pattern path = Pattern.compile("/[a-z]+/");
      Matcher caminho = path.matcher(url);
      
      Pattern parameter = Pattern.compile("[a-z]+=[a-z]+");
      Matcher parametro = parameter.matcher(url);
      
      /**
       * 
      if(protocolo.find()){
        System.out.println("protocolo: "+ protocolo.group());
      } else {
          System.out.println("Não encontrado");
      }
      
      if(hospede.find()){
        System.out.println("host: "+ hospede.group());
      } else  {
          System.out.println("Não encontrado");
      }
      
      if(dominio.find()){
        System.out.println("dominio: "+ dominio.group());
      } else {
          System.out.println("Não encontrado");
          
      }
      
      if(caminho.find()){
        System.out.println("path: "+ caminho.group()); 
      } else{
          System.out.println("Não encontrado");
      } 

     if(parametro.find()){
        System.out.println("path: "+ parametro.group()); 
      } else  {
         System.out.println("Não encontrado");
     }
     */
     
     if (parametro.find() && caminho.find() && dominio.find() && hospede.find() && protocolo.find()){
         System.out.println("protocolo: "+ protocolo.group());
         System.out.println("host: "+ hospede.group());
         System.out.println("dominio: "+ dominio.group());
         System.out.println("path: "+ caminho.group()); 
         System.out.println("path: "+ parametro.group()); 
         return true;
     } else return false;
     
    }
    
}

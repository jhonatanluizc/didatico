/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDados;

/**
 *
 * @author jonat
 */
public class Session {
    public static String nome = "";
    public static String username = "";
    public static String senha = "";
    public static String cargo = "";
    
    public static void Logar(String xnome, String xusername, String xsenha, String xcargo){
        nome = xnome;
        username = xusername;
        senha = xsenha;
        cargo = xcargo;      
    }
    
    public static void Deslogar(){
        nome = "";
        username = "";
        senha = "";
        cargo = "";      
    }
    
    public static boolean Online(){
        if (nome.equals("")) {
            return false;
        }else{
            return true;
        }
          
    }
    
    
    
    
    
    
}



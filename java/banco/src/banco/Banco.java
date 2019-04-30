/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import telas.*;

/**
 *
 * @author jonat
 */
public class Banco {

    principal Tela;

    public Banco() {
        Tela = new principal();
        Tela.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Banco();
    }
    
}

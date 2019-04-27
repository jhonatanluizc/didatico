/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author jonat
 */
public class listas {

    telaPrincipal tela;

    public listas() {
        tela = new telaPrincipal();
        tela.setVisible(true);
    }

    public static void main(String[] args) {
        
        new listas();
    }

}


package sistema;

import telas.telaPrincipal;

public class Sistema {

    telaPrincipal tela;
    
    public Sistema()
    {
        tela = new telaPrincipal();
        tela.setVisible(true);
    }
    
    public static void main(String[] args) {
        
       new Sistema();
    }
    
}

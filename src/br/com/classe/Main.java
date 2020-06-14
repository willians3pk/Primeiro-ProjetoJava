
package br.com.classe;
import br.com.Telas.MenuPrincipal;
import br.com.Telas.TelaLoading;
import java.sql.SQLException;

public class Main {
    
 
    public static void main(String[] args) throws SQLException {
   
        TelaLoading load = new TelaLoading();
        load.setVisible(true);
        
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(10);
                load.loadingNum.setText(Integer.toString(i) +"%");
                load.loadingBar.setValue(i);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        load.setVisible(false);
    }
    
}

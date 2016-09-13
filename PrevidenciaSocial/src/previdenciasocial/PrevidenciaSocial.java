
package previdenciasocial;

import java.io.File;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PrevidenciaSocial {

    public static void main(String[] args) {
        
        URL url;
        
        try{
            
           url = new URL("http://repositorio.dados.gov.br/pessoa-familia-sociedade/previdencia-social/UnidadesOrganicasINSS.csv");
           AgenciaCD agen = new AgenciaCD();
           agen.load(url);
           System.out.println("Obtido da Web: " + agen.toString());
           
           File arq = new File("Agencias.ser");
           agen.save(arq);
           AgenciaCD AgenCD = new AgenciaCD();
           AgenCD.load(arq);
           System.out.println("Obtido Localmente: " + AgenCD.toString());
        }
        catch(Exception ex){
            Logger.getLogger(PrevidenciaSocial.class.getName()).log(Level.SEVERE, null, ex);               
        }        
    }  
}



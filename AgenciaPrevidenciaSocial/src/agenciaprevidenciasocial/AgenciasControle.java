/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaprevidenciasocial;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class AgenciasControle {
    
    private List<Agencia> agencias;

    public List<Agencia> obtemDados() {
        
        AgenciaCD agenciasCD = new AgenciaCD();
        URL url; 
        try {
            
            url = new URL("http://repositorio.dados.gov.br/pessoa-familia-sociedade/previdencia-social/UnidadesOrganicasINSS.csv");
            agenciasCD.load(url);

            agencias = agenciasCD.getAgencia();
            
        } catch (IOException ex) {
            Logger.getLogger(AgenciasControle.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        agencias = agenciasCD.getAgencia();

        return agencias;
    }
}

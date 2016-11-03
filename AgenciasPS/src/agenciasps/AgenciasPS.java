/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciasps;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class AgenciasPS {
    
    private String csvPath = "UnidadesOrganicasINSS.csv";
    private ConjuntoAgencias a;
    
   public AgenciasPS() {
       this.a = new ConjuntoAgencias();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AgenciasPS aps = new AgenciasPS();
        ArrayList<Agencia> agencias = aps.search();
                
         for (Agencia agencia : agencias) {
                System.out.print(agencia.getNomeUnidade());
                //System.out.println(pais.getPercentualUsuarios().get(0));
                //System.out.println(pais.mapaPercentuaisPorAno.get(2015));
         }
    }
    
    public ArrayList search() {
        try {
            a.loadLocal(csvPath);
        } catch (IOException ex) {
            Logger.getLogger(AgenciasPS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (ArrayList) a.getAgencias();
    }
    
    
  
    
}

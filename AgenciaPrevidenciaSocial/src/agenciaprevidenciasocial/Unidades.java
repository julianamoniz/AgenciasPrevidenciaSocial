/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaprevidenciasocial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 *
 * @author Usuario
 */
public class Unidades {
    
    private List<Agencia> agencias;
    AgenciasControle agen = new AgenciasControle();
     
    
    private void atualizar() {
        agencias = agen.obtemDados();
    }
    
    public Map<String, Integer> unidadesPorCidade(String uf){
        atualizar();
    
        Map<String, Integer> repeticao = new HashMap<String, Integer>();
        int qtd = 1;
        for (int i=0; i < agencias.size(); i++){ //percorre agencias
           
          String newuf = agencias.get(i).getUf(); //Pega UF

            if(newuf.equalsIgnoreCase(uf)){ //Se for igual o UF do parametro
        
              String municipio = agencias.get(i).getNomeMunicipio(); //Pega Municipio
              
              if (repeticao.containsKey(municipio))
                repeticao.put(municipio, repeticao.getOrDefault(municipio, 0) + 1);
              else
                repeticao.put(municipio, qtd);
            }
        }

        return repeticao;
    }
}


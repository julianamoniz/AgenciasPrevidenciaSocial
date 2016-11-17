/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaprevidenciasocial;

import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Juliana 
 * @author Lorena
 * @author Caio
 * @author Weslley
 */
public class AgenciaCD {
    
    List<Agencia> agencias;
    
    /**
     * criação de um arrayList
     */
    public AgenciaCD() {
        agencias = new ArrayList<>();
    }
    
    /**
     * @return retorna a lista agencias
     */
    public List<Agencia> getAgencia() {
        return agencias;
    }
    
    /**
     *
     * @param url Variável URL que recebe url
     * @throws IOException
     */
    public void load(URL url) throws IOException {
        
        Reader source = new InputStreamReader(url.openStream());
        CSVReader reader = new CSVReader(source, ',');
        reader.readNext(); 
        String[] line;
        
        while ((line = reader.readNext()) != null) {
            Agencia agencia = new Agencia();
            agencia.setCodigoUnidade(line[0]);
            agencia.setCategoria(line[1]);
            agencia.setDescriçãoCategoria(line[2]);
            agencia.setNomeUnidade(line[3]);
            agencia.setSiglaUnidade(line[4]);
            agencia.setDataCriação(line[5]);
            agencia.setEndereço(line[6]);
            agencia.setComplemento(line[7]);
            agencia.setBairro(line[8]);
            agencia.setCep(line[9]);
            agencia.setCodigoMunicipio(line[10]);
            agencia.setNomeMunicipio(line[11]);
            agencia.setUf(line[12]);
            agencia.setDdd(line[13]);
            agencia.setTelefone(line[14]);
            agencia.setRamal(line[15]);
            agencia.setFax(line[16]);
            agencia.setEmail(line[17]);
            agencia.setPorte(line[18]);
            agencia.setCnpj(line[19]);
            agencia.setUnidadeAtiva(line[20]);
            agencia.setSituaçãoUnidade(line[21]);
            agencia.setDescriçãoSituação(line[22]);
            agencia.setHorarioInicial(line[23]);
            agencia.setHorarioFinal(line[24]);
            
            agencias.add(agencia);
        }
        reader.close();
        source.close();
    }
    
    /**
     *
     * @return Retorna resposta
     */
    @Override
    public String toString(){
        String resposta = "Null";
        if (agencias != null){
            resposta = "[";
            for (Agencia agencia : agencias){
                resposta = resposta.concat(agencia.getCodigoUnidade() + " \n");
            }
            resposta = resposta.concat("]");
        }
        return resposta;
    }
    
}

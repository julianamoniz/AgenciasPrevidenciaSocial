/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciasps;


import java.io.BufferedReader;;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection; 

/**
 *
 * @author Usuario
 */
public class ConjuntoAgencias {
    Collection<Agencia> a;

    public Collection<Agencia> getAgencias() { 
        return a;
    }

    public void setAgencias(Collection<Agencia> agencias) {
        this.a = agencias;
    }
    
    public ConjuntoAgencias(){
	a = new ArrayList<>();
    }
    
    public void loadLocal(String diretorio) throws IOException {
        
        try (BufferedReader br = new BufferedReader(new FileReader(diretorio))) {
        
            String line;
            while ((line = br.readLine()) != null) {

                String[] agencias = line.split(",");

                Agencia agencia = new Agencia();

                agencia.setCodigoUnidade(agencias[0]);
                agencia.setCategoria(agencias[1]);
                agencia.setDescriçãoCategoria(agencias[2]);
                agencia.setNomeUnidade(agencias[3]);
                agencia.setSiglaUnidade(agencias[4]);
                agencia.setDataCriação(agencias[5]);
                agencia.setEndereço(agencias[6]);
                agencia.setComplemento(agencias[7]);
                agencia.setBairro(agencias[8]);
                agencia.setCep(agencias[9]);
                agencia.setCodigoMunicipio(agencias[10]);
                agencia.setNomeMunicipio(agencias[11]);
                agencia.setUf(agencias[12]);
                agencia.setDdd(agencias[13]);
                agencia.setTelefone(agencias[14]);
                agencia.setRamal(agencias[15]);
                agencia.setFax(agencias[16]);
                agencia.setEmail(agencias[17]);
                agencia.setPorte(agencias[18]);
                agencia.setCnpj(agencias[19]);
                agencia.setUnidadeAtiva(agencias[20]);
                agencia.setSituaçãoUnidade(agencias[21]);
                agencia.setDescriçãoSituação(agencias[22]);
               // agencia.setHorarioInicial(agencias[23]);
               // agencia.setHorarioFinal(agencias[24]);

                a.add(agencia);
            }    
        } catch (IOException e) {
            e.printStackTrace();	
        }
    }
}

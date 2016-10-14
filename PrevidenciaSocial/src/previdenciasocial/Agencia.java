/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package previdenciasocial;

import java.io.Serializable;

/**
 *
 * @author Lorena
 */
public class Agencia implements Serializable {
    
    private String codigoUnidade;
    private String categoria;
    private String descriçãoCategoria;
    private String nomeUnidade;
    private String siglaUnidade;
    private String dataCriação;
    private String endereço;
    private String complemento;
    private String bairro;
    private String cep;
    private String codigoMunicipio;
    private String nomeMunicipio;
    private String uf;
    private String ddd;
    private String telefone;
    private String ramal;
    private String fax;
    private String email;
    private String porte;
    private String cnpj;
    private String unidadeAtiva;
    private String situaçãoUnidade;
    private String descriçãoSituação;
    private String horarioInicial;
    private String horarioFinal;
    
        public void setCodigoUnidade(String codigoUnidade){
                this.codigoUnidade = codigoUnidade;    
        }
        public void setCategoria (String categoria){
            this.categoria = categoria;
        }
        public void setDescriçãoCategoria(String descriçãoCategoria){
                this.descriçãoCategoria = descriçãoCategoria;    
        }
        public void setNomeUnidade(String nomeUnidade) {
                this.nomeUnidade = nomeUnidade;
        }
        public void setSiglaUnidade(String siglaUnidade) {
                this.siglaUnidade = siglaUnidade;
        }
        public void setDataCriação(String dataCriação) {
                this.dataCriação = dataCriação;
        }
        public void setEndereço(String endereço) {
                this.endereço = endereço;
        }
        public void setComplemento(String complemento) {
                this.complemento = complemento;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;   
        }
        public void setCep(String cep) {
            this.cep = cep;        
        }
        public void setCodigoMunicipio(String codigoMunicipio) {
            this.codigoMunicipio = codigoMunicipio;
        }
        public void setNomeMunicipio(String nomeMunicipio) {
            this.nomeMunicipio = nomeMunicipio;
        }
        public void setUf(String uf) {
            this.uf = uf;
        }
        public void setDdd(String ddd) {
            this.ddd = ddd;        
        }
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
        public void setRamal(String ramal) {
            this.ramal = ramal;
        }
        public void setFax(String fax) {
            this.fax = fax;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public void setPorte(String porte) {
            this.porte = porte;
        }
        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }
        public void setUnidadeAtiva(String unidadeAtiva) {
            this.unidadeAtiva = unidadeAtiva;
        }
        public void setSituaçãoUnidade(String situaçãoUnidade) {
            this.situaçãoUnidade = situaçãoUnidade;
        }
        public void setDescriçãoSituação(String descriçãoSituação) {
            this.descriçãoSituação = descriçãoSituação;
        }
        public void setHorarioInicial(String horarioInicial) {
           this.horarioInicial = horarioInicial;
        }
        public void setHorarioFinal(String horarioFinal) {
           this.horarioFinal = horarioFinal;
        }
        public String getCodigoUnidade(){
             return codigoUnidade;
        } 
        public String getCategoria(){
            return categoria;
        }
        public String getDescriçãoCategoria(){
             return descriçãoCategoria;
        } 
        public String getNomeUnidade(){
             return nomeUnidade;
         }
        public String getSiglaUnidade() {
            return siglaUnidade;
        }
        public String getDataCriação() {
            return dataCriação;
        }
        public String getEndereço() {
            return endereço;
        }
        public String getComplemento() {
            return complemento;
        }
        public String getBairro() {
            return bairro;
        }
        public String getCep() {
            return cep;
        }
        public String getCodigoMunicipio() {
            return codigoMunicipio;
        }
        public String getNomeMunicipio() {
            return nomeMunicipio;
        }
        public String getUf() {
            return uf;
        }
        public String getDdd() {
            return ddd;
        }
        public String getTelefone() {
            return telefone;
        }
        public String getRamal() {
            return ramal;
        }
        public String getFax() {
            return fax;
        }
        public String getEmail() {
            return email;
        }
        public String getPorte() {
            return porte;
        }
        public String getCnpj() {
            return cnpj;
        }
        public String getUnidadeAtiva() {
            return unidadeAtiva;
        }
        public String getSituaçãoUnidade() {
            return situaçãoUnidade;
        }
        public String getDescriçãoSituação() {
            return descriçãoSituação;
        }
        public String getHorarioInicial() {
            return horarioInicial;
        }
        public String getHorarioFinal() {
            return horarioFinal;
        }
    
}


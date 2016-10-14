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
 * @author Caio
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
    
    /**
     *
     * @param codigoUnidade Variável string que recebe codigo unidade 
     */
    public void setCodigoUnidade(String codigoUnidade){
                this.codigoUnidade = codigoUnidade;    
        }

    /**
     *
     * @param categoria Variável string que recebe categoria
     */
    public void setCategoria (String categoria){
            this.categoria = categoria;
        }

    /**
     *
     * @param descriçãoCategoria Variável string que recebe descrição de categoria
     */
    public void setDescriçãoCategoria(String descriçãoCategoria){
                this.descriçãoCategoria = descriçãoCategoria;    
        }

    /**
     *
     * @param nomeUnidade Variável string que recebe nome unidade
     */
    public void setNomeUnidade(String nomeUnidade) {
                this.nomeUnidade = nomeUnidade;
        }

    /**
     *
     * @param siglaUnidade Variável string que recebe sigla unidade
     */
    public void setSiglaUnidade(String siglaUnidade) {
                this.siglaUnidade = siglaUnidade;
        }

    /**
     *
     * @param dataCriação Variável string que recebe data de criação
     */
    public void setDataCriação(String dataCriação) {
                this.dataCriação = dataCriação;
        }

    /**
     *
     * @param endereço Variável string que recebe endereço
     */
    public void setEndereço(String endereço) {
                this.endereço = endereço;
        }

    /**
     *
     * @param complemento Variável string que recebe complemento
     */ 
    public void setComplemento(String complemento) {
                this.complemento = complemento;
        }

    /**
     *
     * @param bairro Variável string que recebe bairro
     */
    public void setBairro(String bairro) {
            this.bairro = bairro;   
        }

    /**
     *
     * @param cep Variável string que recebe cep
     */
    public void setCep(String cep) {
            this.cep = cep;        
        }

    /**
     *
     * @param codigoMunicipio Variável string que recebe codigo munucipio
     */
    public void setCodigoMunicipio(String codigoMunicipio) {
            this.codigoMunicipio = codigoMunicipio;
        }

    /**
     *
     * @param nomeMunicipio Variável string que recebe nome municipio
     */
    public void setNomeMunicipio(String nomeMunicipio) {
            this.nomeMunicipio = nomeMunicipio;
        }

    /**
     *
     * @param uf Variável string que recebe UF
     */
    public void setUf(String uf) {
            this.uf = uf;
        }

    /**
     *
     * @param ddd Variável string que recebe DDD
     */
    public void setDdd(String ddd) {
            this.ddd = ddd;        
        }

    /**
     *
     * @param telefone Variável string que recebe telefone
     */
    public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

    /**
     *
     * @param ramal Variável string que recebe ramal
     */
    public void setRamal(String ramal) {
            this.ramal = ramal;
        }

    /**
     *
     * @param fax Variável string que recebe fax
     */
    public void setFax(String fax) {
            this.fax = fax;
        }

    /**
     *
     * @param email Variável string que recebe email
     */
    public void setEmail(String email) {
            this.email = email;
        }

    /**
     *
     * @param porte Variável string que recebe porte
     */
    public void setPorte(String porte) {
            this.porte = porte;
        }

    /**
     *
     * @param cnpj Variável string que recebe cnpj
     */
    public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
        }

    /**
     *
     * @param unidadeAtiva Variável string que recebe unidade ativa
     */
    public void setUnidadeAtiva(String unidadeAtiva) {
            this.unidadeAtiva = unidadeAtiva;
        }

    /**
     *
     * @param situaçãoUnidade Variável string que recebe situação unidade 
     */
    public void setSituaçãoUnidade(String situaçãoUnidade) {
            this.situaçãoUnidade = situaçãoUnidade;
        }

    /**
     *
     * @param descriçãoSituação Variável string que recebe descrição de situação
     */
    public void setDescriçãoSituação(String descriçãoSituação) {
            this.descriçãoSituação = descriçãoSituação;
        }

    /**
     *
     * @param horarioInicial Variável string que recebe horário inicial
     */
    public void setHorarioInicial(String horarioInicial) {
           this.horarioInicial = horarioInicial;
        }

    /**
     *
     * @param horarioFinal Variável string que recebe horário final 
     */
    public void setHorarioFinal(String horarioFinal) {
           this.horarioFinal = horarioFinal;
        }

    /**
     *
     * @return Retorna codigo unidade 
     */
    public String getCodigoUnidade(){
             return codigoUnidade;
        } 

    /**
     *
     * @return Retorna categoria
     */
    public String getCategoria(){
            return categoria;
        }

    /**
     *
     * @return Retorna descrição da categoria 
     */
    public String getDescriçãoCategoria(){
             return descriçãoCategoria;
        } 

    /**
     *
     * @return Retorna nome da unidade
     */
    public String getNomeUnidade(){
             return nomeUnidade;
         }

    /**
     *
     * @return Retorna sigla da unidade
     */
    public String getSiglaUnidade() {
            return siglaUnidade;
        }

    /**
     *
     * @return Retorna data criação
     */
    public String getDataCriação() {
            return dataCriação;
        }

    /**
     *
     * @return Retorna endereço
     */
    public String getEndereço() {
            return endereço;
        }

    /**
     *
     * @return Retorna complemento
     */
    public String getComplemento() {
            return complemento;
        }

    /**
     *
     * @return Retorna bairro
     */
    public String getBairro() {
            return bairro;
        }

    /**
     *
     * @return Retorna cep
     */
    public String getCep() {
            return cep;
        }

    /**
     *
     * @return Retorna codigo municipio
     */
    public String getCodigoMunicipio() {
            return codigoMunicipio;
        }

    /**
     *
     * @return Retorna nome municipio
     */
    public String getNomeMunicipio() {
            return nomeMunicipio;
        }

    /**
     *
     * @return Retorna UF
     */
    public String getUf() {
            return uf;
        }

    /**
     *
     * @return Retorna DDD
     */
    public String getDdd() {
            return ddd;
        }

    /**
     *
     * @return Retorna telefone
     */
    public String getTelefone() {
            return telefone;
        }

    /**
     *
     * @return Retorna ramal
     */
    public String getRamal() {
            return ramal;
        }

    /**
     *
     * @return Retorna fax
     */
    public String getFax() {
            return fax;
        }

    /**
     *
     * @return Retorna email 
     */
    public String getEmail() {
            return email;
        }

    /**
     *
     * @return Retorna porte da agencia
     */
    public String getPorte() {
            return porte;
        }

    /**
     *
     * @return Retorna cnpj
     */
    public String getCnpj() {
            return cnpj;
        }

    /**
     *
     * @return Retorna unidade ativa
     */
    public String getUnidadeAtiva() {
            return unidadeAtiva;
        }

    /**
     *
     * @return Retorna situação da unidade
     */
    public String getSituaçãoUnidade() {
            return situaçãoUnidade;
        }

    /**
     *
     * @return Retorna descrição da situação
     */
    public String getDescriçãoSituação() {
            return descriçãoSituação;
        }

    /**
     *
     * @return Retorna horario inicial
     */
    public String getHorarioInicial() {
            return horarioInicial;
        }

    /**
     *
     * @return Retorna o horario final
     */
    public String getHorarioFinal() {
            return horarioFinal;
        }
    
}


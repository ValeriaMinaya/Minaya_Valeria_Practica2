/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Programa;

/**
 *
 * @author OCA-UIE
 */
public class Usuario {
    
    private String paterno;
    private String materno;
    private String nombres;
    private String documento;
    private String tipoDocumento;

    public Usuario(String paterno, String materno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    public Usuario(String paterno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    public Usuario(String materno, String nombres, String documento) {
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = "DNI";
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @Override
    public String toString() {
        return  paterno + "\t" + 
                materno + "\t" + 
                nombres + "\t" + 
                tipoDocumento + "\t" +  
                documento;
    }

    
    
    
}

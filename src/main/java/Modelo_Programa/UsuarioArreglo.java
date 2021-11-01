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
public class UsuarioArreglo {
    private Usuario arregloU [];
    private int indice;

    public UsuarioArreglo(int tamaño) {
        this.indice = 0;
        this.arregloU = new Usuario[tamaño];
    }

    public UsuarioArreglo() {
        this.indice = 0;
        this.arregloU = new Usuario[5];
    }
    
    public boolean agregar(Usuario usuario){
        boolean result = false;
        if (!estaLleno()){
            this.arregloU[this.indice] = usuario;
            this.indice++;
            result= true;
        }
        else{
            crecerArreglo();
            System.out.println("Arreglo lleno, creció");
            this.arregloU[this.indice] = usuario;
            this.indice++;
            result= true;
            	
         }
        return result;
    }
    
    public boolean eliminar(Usuario usuario){
        boolean result = false;
        Usuario temp= new Usuario("","","","",""); // No es necesario
        for (int i = 0; i < this.indice; i++) {
            // Solo se debe comparar por el atributo identificardor
            if (this.arregloU[i].getDocumento().equals(usuario.getDocumento())&&
                    this.arregloU[i].getMaterno().equals(usuario.getMaterno())&&
                    this.arregloU[i].getPaterno().equals(usuario.getPaterno())&&
                    this.arregloU[i].getTipoDocumento().equals(usuario.getTipoDocumento())){
                temp = this.arregloU[i];
                this.arregloU[i] = this.arregloU[this.indice-1];
                this.arregloU[this.indice-1] = temp; // No es necesario
                this.indice--;
                result = true;
            }
        }
        return result;
    }
    
    public boolean eliminar(String documento){
        boolean result = false;
        //eliminar por dni
        Usuario temp = new Usuario("","","","","");
        //eliminar usuario
        for(int i=0;i<this.indice;i++){
            if(this.arregloU[i].getDocumento().equals(documento)){
                temp = this.arregloU[i];
                this.arregloU[i] = this.arregloU[this.indice-1];
                this.arregloU[this.indice-1] = temp;
                this.indice--;
                result = true;
            }
        }
        return result;
    }
    
    public Usuario getUsuario(String documento){
        Usuario result = null;
        for(int i=0;i<this.indice;i++){
            if(this.arregloU[i].getDocumento().equals(documento)){
                result = this.arregloU[i];
            }
        }
        return result;
    }
    
    public boolean documentoRegistrado(String documento){
        boolean result = false;
        for(int i=0;i<this.indice;i++){
            if(this.arregloU[i].getDocumento().equals(documento)){
                result = true;
            }
        }
        return result;
    }
    
    private void crecerArreglo(){
        Usuario temp[] = new Usuario[5]; // esto solo funiona 1 vez
        temp=arregloU;
        arregloU=new Usuario[this.indice+2];
        for(int i=0;i<this.indice;i++){
            arregloU[i]=temp[i];
        }
    }
    
    private boolean estaLleno(){
        boolean result = false;
        if(this.indice==5){ // que pasa cuando crece el arreglo 
            result=true;
        }
        return result;
    }
    
    private boolean estaVAcio(){
        boolean result = false;
        if(this.indice==0){
            result=true;
        }
        return result;
    }
    
    public void ordenarPorPaterno(){
        Usuario temp=new Usuario("","","");
        for(int i=0;i<arregloU.length-1;i++){
            for(int j=i+1;j<arregloU.length-1;j++){
                if(this.arregloU[i].getPaterno().compareTo(this.arregloU[j].getPaterno())>0){
                    temp=this.arregloU[i];
                    this.arregloU[i]=this.arregloU[j];
                    this.arregloU[j]=temp;
                }
            }
        }
    }
    
    public void ordenarPorMaterno(){
        Usuario temp=new Usuario("","","");
        for(int i=0;i<arregloU.length-1;i++){
            for(int j=i+1;j<arregloU.length-1;j++){
                if(this.arregloU[i].getMaterno().compareTo(this.arregloU[j].getMaterno())>0){
                    temp=this.arregloU[i];
                    this.arregloU[i]=this.arregloU[j];
                    this.arregloU[j]=temp;
                }
            }
        }
    }
    
    public void ordenarPorDocumento(){
        Usuario temp=new Usuario("","","");
        for(int i=0;i<arregloU.length-1;i++){
            for(int j=i+1;j<arregloU.length-1;j++){
                if(this.arregloU[i].getDocumento().compareTo(this.arregloU[j].getDocumento())>0){
                    temp=this.arregloU[i];
                    this.arregloU[i]=this.arregloU[j];
                    this.arregloU[j]=temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        String result="";
        for(int i =0 ; i< this.indice ; i++ ){
            result += this.arregloU[i] + "\n";
        }
        return result;
    }

    
}

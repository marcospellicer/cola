/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author Marcos
 */
public class Cola {
    private Object dato;
    private Cola sigiente;

    public Cola() {
     this.dato = null;
        this.sigiente = null;  
    }

    public Cola(Object dato) {
        this.dato = dato;
        this.sigiente = null;
    }
    public void Añadir(Object dat){
        Cola nueva = new Cola(dat);
        if(this.sigiente==null){
        this.sigiente=nueva;
        }else if(this.sigiente.sigiente==null){
          this.sigiente.sigiente=nueva;  
        }else if(this.sigiente.sigiente.sigiente==null){
          this.sigiente.sigiente.sigiente=nueva;  
        }else if(this.sigiente.sigiente.sigiente.sigiente==null){
          this.sigiente.sigiente.sigiente.sigiente=nueva;  
        }else if(this.sigiente.sigiente.sigiente.sigiente.sigiente==null){
          this.sigiente.sigiente.sigiente.sigiente.sigiente=nueva;  
        }
 
        }
    
        public void Mostrar(){
            
            if(this.sigiente==null){
                System.out.println("no hay nada");
            }else{
            Cola it = this.sigiente;
            while(it!=null){
                System.out.println(it.dato);
                it=it.sigiente;
            }
            }
            
        }
        public Object Sacar(){
           Object o = this.sigiente.dato;
           this.sigiente=this.sigiente.sigiente;
           return o;
        }
 
        
    }
    
    
    


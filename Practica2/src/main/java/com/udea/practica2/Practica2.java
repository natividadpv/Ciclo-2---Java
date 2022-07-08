package com.udea.practica2;

public class Practica2 {

    private String[] paginas;//lista con las paginas a visitar
    private int[] paginasFavoritas;//lista con los indices de paginas favoritas
    private boolean desconectado=  false;//estado inicial de desconexion
    private int paginaVisitando= 0;//Paginas que estoy visitando por defecto
    
    
    //Método contructor
    public Practica2(String[] paginas){
        this.paginas=paginas;
        paginasFavoritas=new int[paginas.length];
        //para i que arranca en la posición 0 
        for (int i=0; i<paginasFavoritas.length;i++){
            paginasFavoritas[i]=-1;
        }
    }
    //Metodo para ir la siguiente pagina
    public void proximaPagina(){
        //si pagina visitando es igual a la ultima posición de mi lista,
        if (paginaVisitando==(paginas.length -1)){
        //entonces pagina visitando es igual a 0
        paginaVisitando=0;
        }
        //De lo contrario será la pagina siguiente a la que visité
        else{
        paginaVisitando=paginaVisitando+1;
        }
    }
    //Metodo para devolver a la pagina que estaba
    public void devolverPagina(){
        if (paginaVisitando==0){
            paginaVisitando=paginas.length-1;
        }
        else{
        paginaVisitando=paginaVisitando-1;
        }
    }
    
    public void desconectar(){
        desconectado= true;
    }
    
    public void conectar(){
        desconectado=false;
    }
    
    public void agregarPaginasFavoritas(){
        //para i que arranca en la podición 0, por cada i de la medicion de la lista, sume 1 
        for (int i=0;i<paginas.length;i++){
            if (paginasFavoritas[i]==paginaVisitando){
            return;
            }
            else if(paginasFavoritas[i]==-1){
            paginasFavoritas[i]=paginaVisitando;
            return;
            }
 
            }
        }
    
    }
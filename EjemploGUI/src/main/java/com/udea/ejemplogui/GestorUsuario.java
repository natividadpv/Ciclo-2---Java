package com.udea.ejemplogui;

import java.util.ArrayList;

public class GestorUsuario {
    private ArrayList<Usuario> usuarios;
    public GestorUsuario(){
        
    }
    public boolean addUsuario (Usuario usuario){
    this.usuarios.add(usuario);
    return true;
    
    }
    public Usuario consultarUsuario(Usuario usuario){
    for (Usuario usuarioGuardado: this.usuarios){
        if (usuarioGuardado.getUsuario().equals(usuario.getUsuario())){
            boolean password = true;
            for(int i = 0;i<password && i<usuarioGuardado.getPassword().length;i++){
            
            
            }
        }
    
    }
    }
    
    
}



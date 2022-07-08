package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.BaseDeDatos;
import modelo.modelo;
import vista.vista1;
import vista.vista2;
import vista.vista3;

/*En el controlador, van a ir los atributos de las ventanas de la vista. 
Esto para que cuando cree un objeto de tipo controlador, debe contar con modelo y vista1
para cuando los necesite
*/

//Implementar en su clase y todos los objetos que hagan parte ActionListener

public class controlador implements ActionListener{
//Designación como atributos de la clase controlador
        modelo model;
        vista1 menu; 
        vista2 ingresar;
        vista3 buscar;
        BaseDeDatos bd;
        
    //Ahora a crear el constructor
    public controlador(){//Ventana que visualice el menú
        this.menu = new vista1(); //Nuevo objeto de tipo vista1, ahi veremos el menú
        this.ingresar =new vista2(); //Nuevo objeto de tipo vista2
        this.bd=new BaseDeDatos (); //Nuevo ojeti de tipo BaseDeDatos
        this.buscar=new vista3();// Nuevo objeto de tipo vista3, aqui buscaremos al estudiante 
       
        menu.getBtn_ingresar().addActionListener(this);//sensor de habla del boton ingresar de menú
        menu.getBtn_salir().addActionListener(this);//sensor de habla del boton salir de menú
        menu.getBtn_buscar().addActionListener(this);
        
        ingresar.getBtn_guardar().addActionListener(this);//sensor de habla para el boton Guardar
        ingresar.getBtn_cancelar().addActionListener(this);//sensor de habla para el boton Cancelar
        buscar.getBtn_buscar().addActionListener(this);//sensor de habla para el boton Buscar
    }
        public void iniciar(){
        menu.setVisible(true);
        
        
    }
    
    @Override
    //Con la implementación de ActionEvent, vamos a darle vida a los botones
    public void actionPerformed(ActionEvent e) {
        //Aqui los botones del menú:
        if (e.getSource()==menu.getBtn_ingresar()){
            //JOptionPane.showMessageDialog(menu, "Este botón está funcionando", "MENSAJE EMERGENTE",1);
            ingresar.setVisible(true);
            menu.dispose();//ocultar la ventana menú cuando se abra la de ingresar
        }
        
        if (e.getSource()==menu.getBtn_buscar()){
            buscar.setVisible(true);
            menu.dispose();
        }
        
        if (e.getSource()==menu.getBtn_salir()){
            System.exit(0);
        }
        
        //Aqui los botones de Vista_ingresar
        if (e.getSource()==ingresar.getBtn_guardar()){
            //Ahora se deben capturar los datos
            //Crear la función guardar
            guardar();
        }
        
        //Aqui los botones de Vista_buscar
          if (e.getSource()==buscar.getBtn_buscar()){
            buscar();
          }
        //Aqui los botones de modificar
        
        //Aqui los botones de eliminar
        
        //Aqui los botones de lista
        
        //Aqui los botones en común de todas las vistas
            if (e.getSource()==ingresar.getBtn_cancelar()){
            ingresar.dispose();
            menu.setVisible(true);
        }
    
    
    }
    public void guardar(){//         .traiga el texto   Esto debido a que el objeto es de tipo jtextfield
    String id=ingresar.getTxt_cedula().getText();//del objeto txt_cedula, solo tome el texto (con .getText)
    String nombres=ingresar.getTxt_nombres().getText();  
    String apellidos=ingresar.getTxt_apellidos().getText();  
    String telefono=ingresar.getTxt_telefono().getText();
    String correo=ingresar.getTxt_correo().getText();
    String programa=ingresar.getTxt_programa().getText();
    //Crear objeto de tipo modelo
    modelo nuevoEstudiante=new modelo(id,nombres, apellidos, telefono, correo, programa);
    //Crear objeto de tipo bd
    bd.guardarEstudiante(nuevoEstudiante);
    
    }

    private void buscar() {
        String id=buscar.getTxt_cedula().getText();
        modelo resultado=bd.buscarEstudiante(id);
        buscar.getTxt_nombres().setText(resultado.getNombre());
        buscar.getTxt_apellidos().setText(resultado.getApellido());
        buscar.getTxt_correo().setText(resultado.getCorreo());
        buscar.getTxt_telefono().setText(resultado.getTelefono());
        buscar.getTxt_programa().setText(resultado.getPrograma());
    }
    
    
 }
   
    
  

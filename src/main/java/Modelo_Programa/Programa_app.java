package Modelo_Programa;
public class Programa_app{
    public static void main(String[] args) {
        Usuario usuario1=new Usuario("Lara", "Zatta","Jonathan","72865650","DNI");
        Usuario usuario2=new Usuario("Anampa", "Atocza","Milagros","72855410","DNI");
        Usuario usuario3=new Usuario("Minaya", "Nose","Valeria","98765454","DNI");
        Usuario usuario4=new Usuario("Benites", "Narrea","Elvis","15468540","DNI");
        Usuario usuario5=new Usuario("Sotelo", "Piedra","Claudio","98754217","DNI");
        Usuario usuario6=new Usuario("Perezs", "Perez2","Juan","98754215","DNI");
        Usuario usuario7=new Usuario("Perez", "Perez1","Juan232","98754216","DNI");
        UsuarioArreglo usuarioArreglo=new UsuarioArreglo();
        usuarioArreglo.agregar(usuario1);
        usuarioArreglo.agregar(usuario2);
        usuarioArreglo.agregar(usuario3);
        usuarioArreglo.agregar(usuario4);
        usuarioArreglo.agregar(usuario5);
        System.out.println("Mostrando datos");
        System.out.println(usuarioArreglo);
        System.out.println("Orden paterno");
        usuarioArreglo.ordenarPorPaterno();
        System.out.println(usuarioArreglo);
        System.out.println("Orden materno");
        usuarioArreglo.ordenarPorMaterno();
        System.out.println(usuarioArreglo);
        System.out.println("Orden dni");
        usuarioArreglo.ordenarPorDocumento();
        System.out.println(usuarioArreglo);
        usuarioArreglo.agregar(usuario6);
        usuarioArreglo.agregar(usuario7);
        System.out.println("Mostrando datos 2");
        System.out.println(usuarioArreglo);
        System.out.println("Eliminando datos");
        usuarioArreglo.eliminar(usuario6);
        usuarioArreglo.eliminar("72865650");
        System.out.println(usuarioArreglo);
        
    }
    
}
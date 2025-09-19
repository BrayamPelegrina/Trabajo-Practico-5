package tp5;

public class TP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(() -> new frmMenuPrincipal().setVisible(true));

        DirectorioTelefonico agenda = new DirectorioTelefonico();

        Cliente primero = new Cliente(987456, "roberto", "lucero", "San Juan", "Santa Lucia");
        Cliente segundo = new Cliente(456123, "juana", "Garcia", "Cordoba", "Avenida Colon 567");
        Cliente tercero = new Cliente(123456, "Martin", " Rodriguez", "Santa Fe", "Calle San Martin 890");
        Cliente cuarto = new Cliente(456789, "Ana", "Lopez", "Salta", "Calle Belgrano 321");

        agenda.agregarContacto(123456L, primero);
        agenda.agregarContacto(456789L, segundo);
        agenda.agregarContacto(987456L, tercero);
        agenda.agregarContacto(456123L, cuarto);

        
        System.out.println(agenda.buscarContacto(123456L));
        System.out.println(agenda.buscarTelefono("Garcia"));
        System.out.println(agenda.buscarContactos("Salta"));
        agenda.borrarContacto(456123L);
        agenda.mostrarTodos();
        
        
        
        


    }

}

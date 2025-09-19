/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Ryzen3
 */
public class DirectorioTelefonico {

    private TreeMap<Long, Cliente> contactos;
    
    public DirectorioTelefonico() {
        this.contactos = new TreeMap<>();
    }

    
 

    public void agregarContacto(Long telefono, Cliente c) {
        if (!contactos.containsKey(telefono)) {
            contactos.put(telefono, c);
        } else {
            System.out.println("este telefono ya ah sido registrado");
        }
    }

    public Cliente buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }

    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Cliente> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());

            }
        }
        return telefonos;
    }

public ArrayList<Cliente> buscarContactos(String ciudad) {
    ArrayList<Cliente> agenda = new ArrayList<>();
    Iterator<Map.Entry<Long, Cliente>> iterando = contactos.entrySet().iterator();
    
    while(iterando.hasNext()) {
        Map.Entry<Long, Cliente> entry = iterando.next();
        if (entry.getValue().getCiudad().equalsIgnoreCase(ciudad)) {
            agenda.add(entry.getValue());
        }
    } 
    return agenda;
}

public void borrarContacto(Long telefono) {
    if(contactos.containsKey(telefono)) {
        contactos.remove(telefono);
        System.out.println("telefono eliminado");
    } else {
        System.out.println("telefono no encontrado");
    }
}

public void mostrarTodos() {
    for (Map.Entry<Long, Cliente> entry : contactos.entrySet()) {
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}



}

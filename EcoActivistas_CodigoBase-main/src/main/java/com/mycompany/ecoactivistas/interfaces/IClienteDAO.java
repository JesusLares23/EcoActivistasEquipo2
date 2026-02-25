
package com.mycompany.ecoactivistas.interfaces;

import com.mycompany.ecoactivistas.model.Cliente;
import java.util.List;

/**
 *
 * @author 233383, 
 */
public interface IClienteDAO {
    
    boolean insertar(Cliente cliente);
    
    Cliente obtenerPorId(int idCliente);
    
    List<Cliente> obtenerTodos();
    
    List<Cliente> obtenerTodosPorFiltro(String filtro);
    
    boolean actualizar(Cliente cliente);
    
    boolean eliminar(int idCliente);
}

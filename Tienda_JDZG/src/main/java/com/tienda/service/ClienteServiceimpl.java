/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.dao.CreditoDao;
import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceimpl implements ClienteService{

    @Autowired
    private ClienteDao clienteDao;
     @Autowired
    private CreditoDao creditoDaoDao;
    
    /**
     *
     * @return
     */
    @Override
    @Transitional(readOnly =true)
    
//    public List<Cliente> getClientes() {
//        return(List<Cliente>)clienteDao.findAll();
//    
    
    
    public List<Cliente> getClientes() {
        return(List<Cliente>)clienteDao.findAll();
    }
 @Override
    @Transactional
    public void save(Cliente cliente) {
        Credito credito=cliente.getCredito();
        credito=creditoDaoDao.save(credito);
        cliente.setCredito(credito);
        clienteDao.save(cliente);
        
    }
 @Override
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);

    }
@Transitional(readOnly=true)





 @Override
    public Cliente getCliente(Cliente cliente) {
        return Cliente.findById(cliente.getCodigoPostal()).orElse(null);
    }
    
    
    
}


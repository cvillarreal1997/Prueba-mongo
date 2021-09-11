/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.service;

import ec.edu.espe.distribuidas.villarreal.mongo.model.ATM;
import ec.edu.espe.distribuidas.villarreal.mongo.service.dao.ATMRepository;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author terry
 */
public class ATMService {
      final private ATMRepository atmRepo;

    public ATMService(ATMRepository atmRepo) {
        this.atmRepo = atmRepo;
    }
    
     public List<ATM> findByCantidad(Integer cantidad) {
        return this.atmRepo.findByCantidad(cantidad);
    }
     public List<ATM> listAll(){
        return this.atmRepo.listAll();
    }
    
}

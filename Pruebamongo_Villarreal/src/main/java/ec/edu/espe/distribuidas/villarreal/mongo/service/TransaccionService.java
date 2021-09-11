/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.service;

/**
 *
 * @author terry
 */


import ec.edu.espe.distribuidas.villarreal.mongo.model.ATM;
import ec.edu.espe.distribuidas.villarreal.mongo.model.Transaccion;
import ec.edu.espe.distribuidas.villarreal.mongo.service.dao.ATMRepository;
import ec.edu.espe.distribuidas.villarreal.mongo.service.dao.TransaccionRepository;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransaccionService {
    private final TransaccionRepository transaccionRepo;
    private final ATMRepository cajeroRepo;

    public TransaccionService(TransaccionRepository transaccionRepo, ATMRepository cajeroRepo) {
        this.transaccionRepo = transaccionRepo;
        this.cajeroRepo = cajeroRepo;
    }

    public void crearTransaccion(Transaccion transaccion){
        Optional<ATM> cajeroOpt = this.cajeroRepo.findById(transaccion.getCodigoCajero());
        if(cajeroOpt.isPresent()){
            LocalDateTime fechaTransaccion = LocalDateTime.now(ZoneId.of("America/Chicago")).withNano(0);
            transaccion.setFecha(fechaTransaccion);
            transaccion.setEstado("DEP");
            this.transaccionRepo.save(transaccion);
        }else{
           
        }
    }
}
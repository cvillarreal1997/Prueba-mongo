/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.service.controller;

import ec.edu.espe.distribuidas.villarreal.mongo.model.ATM;
import ec.edu.espe.distribuidas.villarreal.mongo.service.ATMService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author terry
 */
public class ATMController {
    
    
    private final ATMService service;

    public ATMController(ATMService service) {
        this.service = service;
    }

    
    

@GetMapping(value = "{cantidad}")
    @ApiOperation(value = "los cajeros menores acierta cantidado", notes = "Retorna los cajeros ")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Cajeros menores OK"),
        @ApiResponse(code = 404, message = "No existen cajeros menores a esa cantidad")})
    public ResponseEntity getMonto(
            @PathVariable("monto") Integer monto) {
        try {
            List<ATM> cajeros = this.service.listAll();
            List<ATM> cajerosMonto = this.service.findByCantidad(monto);
            for(ATM i: cajeros){
                if(i.getDisponible()< monto ){
                    cajerosMonto.add(i);
                }
            }
            return ResponseEntity.ok(cajerosMonto.toString());
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
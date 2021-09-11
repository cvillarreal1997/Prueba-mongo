/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.mongo.controller;

/**
 *
 * @author terry
 */


import ec.edu.espe.distribuidas.villarreal.mongo.config.dto.TransaccionRQ;
import ec.edu.espe.distribuidas.villarreal.mongo.model.Transaccion;
import ec.edu.espe.distribuidas.villarreal.mongo.service.TransaccionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/transaccion")
public class TransaccionController {
    
    private final TransaccionService service;

    public TransaccionController(TransaccionService service) {
        this.service = service;
    }
    
    @ApiOperation(value = "Crear una transaccion sea retiro o deposito",
            notes = "transaccion")
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Bad"),
        @ApiResponse(code = 500, message = "Error inesperado del sistema")})
    @PostMapping
    public ResponseEntity crearConsulta(@RequestBody TransaccionRQ request) {
        try {
            Transaccion transaccion = new Transaccion();
            transaccion.setCodigoCajero(request.getCodigoCajero());
            transaccion.setTipo(request.getTipo());
            transaccion.setMonto(request.getMonto());
            transaccion.setDinero10(request.getCantidad10());
            transaccion.setDinero20(request.getCantidad20());
            this.service.crearTransaccion(transaccion);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
    
}
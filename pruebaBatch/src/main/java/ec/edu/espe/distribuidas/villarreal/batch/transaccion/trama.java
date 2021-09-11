/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.batch.transaccion;

import java.math.BigDecimal;
import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 *
 * @author terry
 */
public class trama {
     @Id
    private String idCajero;
    private BigDecimal monto;
    private Integer dinerode10;
    private Integer dinerode20;
    private Date timestamp;
    private String estado;

    
}

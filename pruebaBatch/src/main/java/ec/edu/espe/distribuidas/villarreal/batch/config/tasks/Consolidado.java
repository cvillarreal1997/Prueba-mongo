/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.distribuidas.villarreal.batch.config.tasks;

import ec.edu.espe.distribuidas.villarreal.batch.config.ApplicationValues;
import ec.edu.espe.distribuidas.villarreal.batch.transaccion.trama;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 *
 * @author terry
 */
@Slf4j
public class Consolidado  implements Tasklet, StepExecutionListener {

    private final ApplicationValues applicationValues;
    private final MongoTemplate mongoTemplate;
    List<trama> transacciones = new ArrayList<>();

    public Consolidado(ApplicationValues applicationValues, MongoTemplate mongoTemplate) {
        this.applicationValues = applicationValues;
        this.mongoTemplate = mongoTemplate;
    }


    @Override
    public void beforeStep(StepExecution se) {
             ExecutionContext sc = se.getJobExecution().getExecutionContext();
            this.transacciones = (List) sc.get("transacciones");
    }

  

    @Override
    public RepeatStatus execute(StepContribution arg0, ChunkContext arg1) throws Exception {
          for(int i=0;i<=this.transacciones.size();i++){
              
                  
              }
          
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
    }
        
    @Override
    public ExitStatus afterStep(StepExecution arg0) {
       return ExitStatus.COMPLETED;
    }
    

}

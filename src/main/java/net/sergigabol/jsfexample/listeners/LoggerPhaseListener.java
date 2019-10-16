/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.sergigabol.jsfexample.listeners;

import java.util.logging.Logger;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *
 * @author gabalca
 */
public class LoggerPhaseListener implements PhaseListener{

    private static final Logger LOG = Logger.getLogger(LoggerPhaseListener.class.getName());

    @Override
    public void afterPhase(PhaseEvent pe) {
       LOG.info("despres de la fase "+pe.getPhaseId());
    }

    @Override
    public void beforePhase(PhaseEvent pe) {
        LOG.info("abans de la fase "+pe.getPhaseId());
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
    
}

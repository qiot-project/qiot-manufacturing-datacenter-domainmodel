/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.events.production;

import java.util.UUID;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.qiot.manufacturing.datacenter.commons.domain.events.AbstractProductionValidationTelemetryDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class StageProductionValidationTelemetryDTO
        extends AbstractProductionValidationTelemetryDTO {

    public UUID itemId;
    public ProductionChainStageEnum stage;
    public boolean success;
    

}

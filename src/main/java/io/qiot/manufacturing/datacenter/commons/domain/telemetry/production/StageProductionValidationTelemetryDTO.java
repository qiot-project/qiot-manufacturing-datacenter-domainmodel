/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.telemetry.production;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.qiot.manufacturing.datacenter.commons.domain.telemetry.AbstractProductionValidationTelemetryDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class StageProductionValidationTelemetryDTO
        extends AbstractProductionValidationTelemetryDTO {

    public int itemId;
    public ProductionChainStageEnum stage;
    public boolean success;
    

}

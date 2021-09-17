/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.telemetry.production;

import com.influxdb.annotations.Measurement;

import io.qiot.manufacturing.all.commons.domain.production.ProductionChainStageEnum;
import io.qiot.manufacturing.datacenter.commons.domain.telemetry.AbstractProductionValidationTelemetryDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@Measurement(name = "production_stages")
@RegisterForReflection
public class StageProductionValidationTelemetryDTO
        extends AbstractProductionValidationTelemetryDTO {

    public int itemId;
    public ProductionChainStageEnum stage;
    public boolean success;
    

}

/**
 * 
 */
package io.qiot.manufacturing.datacenter.commons.domain.telemetry.production;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.influxdb.annotations.Column;
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

    @JsonProperty(value = "item_id")
    @Column(name = "item_id", tag = true)
    public int itemId;
    @JsonProperty(value = "stage_id")
    @Column(name = "stage_id", tag = true)
    public ProductionChainStageEnum stage;
    @JsonProperty(value = "product_line_id")
    @Column(name = "success")
    public boolean success;
    

}

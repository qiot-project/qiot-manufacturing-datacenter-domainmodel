package io.qiot.manufacturing.datacenter.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MachineryRegisterRequest extends FactoryRegisterRequest {

    @JsonProperty(value = "machineryId")
    @NotNull
    public UUID machineryId;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EdgeRegisterRequest [machineryId=");
        builder.append(machineryId);
        builder.append(", factoryId=");
        builder.append(factoryId);
        builder.append(", serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }

    
}

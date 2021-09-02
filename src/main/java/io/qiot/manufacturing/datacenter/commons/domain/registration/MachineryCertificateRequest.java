package io.qiot.manufacturing.datacenter.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.qiot.manufacturing.all.commons.domain.registration.MachineryRegisterRequest;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class MachineryCertificateRequest extends MachineryRegisterRequest {

    @JsonProperty(value = "machineryId")
    @NotNull
    public UUID machineryId;

}

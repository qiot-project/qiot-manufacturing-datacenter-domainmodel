
package io.qiot.manufacturing.datacenter.commons.domain.registration;

import java.util.UUID;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * Root Type for RegisterRequest
 * <p>
 */
@RegisterForReflection
public class FactoryRegisterRequest {

    @JsonProperty(value = "serial")
    @NotNull
    public String serial;
    
    @JsonProperty(value = "name")
    @NotNull
    @Pattern(regexp = "[a-z0-9]([-a-z0-9]*[a-z0-9])?(\\.[a-z0-9]([-a-z0-9]*[a-z0-9])?)*")
    public String name;
    
    /**
     * KeyStore Password
     * 
     */
    @JsonProperty("keyStorePassword")
    public String keyStorePassword;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FactoryRegisterRequest [serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }


    
}

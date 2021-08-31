
package io.qiot.manufacturing.datacenter.commons.domain.registration;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * 
 */
@RegisterForReflection
public class RegisterResponse {
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("truststore")
    public String truststore;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("keystore")
    public String keystore;
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RegisterResponse [truststore=");
        builder.append(truststore);
        builder.append(", keystore=");
        builder.append(keystore);
        builder.append("]");
        return builder.toString();
    }

}

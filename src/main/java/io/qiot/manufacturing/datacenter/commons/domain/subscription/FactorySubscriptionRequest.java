
package io.qiot.manufacturing.datacenter.commons.domain.subscription;

import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * @author andreabattaglia
 *
 */
@RegisterForReflection
public class FactorySubscriptionRequest extends ServerSubscriptionRequest {

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("FactorySubscriptionRequest [serial=");
        builder.append(serial);
        builder.append(", name=");
        builder.append(name);
        builder.append(", keyStorePassword=");
        builder.append(keyStorePassword);
        builder.append("]");
        return builder.toString();
    }


    
}

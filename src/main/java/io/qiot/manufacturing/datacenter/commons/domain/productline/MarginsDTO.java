package io.qiot.manufacturing.datacenter.commons.domain.productline;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class MarginsDTO {
    public double weaving;
    public int coloring;
    public double printing;
    public double packaging;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("MarginsDTO [weaving=");
        builder.append(weaving);
        builder.append(", coloring=");
        builder.append(coloring);
        builder.append(", printing=");
        builder.append(printing);
        builder.append(", packaging=");
        builder.append(packaging);
        builder.append("]");
        return builder.toString();
    }
}

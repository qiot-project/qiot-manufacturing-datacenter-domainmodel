package io.qiot.manufacturing.datacenter.commons.domain.productline;

import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

import io.qiot.manufacturing.all.commons.domain.productline.ProductLineDTO;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class GlobalProductLineDTO extends ProductLineDTO {
    // public UUID id;
    public boolean active;
    public Instant createdOn;
    // public SizeChartRangesDTO sizeChart;
    // public ColorRangesDTO color;
    // public PrintingRangesDTO print;
    // public PackagingRangesDTO packaging;
    public MarginsDTO margins;

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GlobalProductLineDTO other = (GlobalProductLineDTO) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("GlobalProductLineDTO [id=");
        builder.append(id);
        builder.append(", sizeChart=");
        builder.append(sizeChart);
        builder.append(", color=");
        builder.append(color);
        builder.append(", print=");
        builder.append(print);
        builder.append(", packaging=");
        builder.append(packaging);
        builder.append(", createdOn=");
        builder.append(createdOn);
        builder.append(", margins=");
        builder.append(margins);
        builder.append("]");
        return builder.toString();
    }

}
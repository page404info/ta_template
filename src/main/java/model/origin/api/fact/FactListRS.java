package model.origin.api.fact;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Data;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
@Data
public class FactListRS {
    private List<Fact> items;

    @JsonCreator
    public FactListRS(List<Fact> items) {
        this.items = items;
    }

    public boolean isFactIdNotNull() {
        items.stream().filter(x -> x.getFactId() == null).forEach(x -> log.error("factId is null)"));
        return items.stream().filter(x -> x.getFactId() == null).count() == 0;
    }
}

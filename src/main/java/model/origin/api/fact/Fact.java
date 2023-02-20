package model.origin.api.fact;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigInteger;

@Data
public class Fact {
    @JsonProperty("FactId")
    private BigInteger factId;
}

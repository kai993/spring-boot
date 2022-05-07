package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class Quote {
    private String type;
    private Value value;

    public Quote() {
    }

    @Override
    public String toString() {
        return "Quote{" +
            "type='" + type + '\'' +
            ", value=" + value +
            '}';
    }
}

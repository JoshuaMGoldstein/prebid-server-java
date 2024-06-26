package org.prebid.server.hooks.execution.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.util.List;

@Value(staticConstructor = "of")
public class ExecutionGroup {

    Long timeout;

    @JsonProperty("hook-sequence")
    @JsonAlias("hook_sequence")
    List<HookId> hookSequence;
}


/*
 * Copyright 2015 Ideable Solutions, S.L.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kwido.fiware.android.sdk.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "contextResponses",
    "id",
    "isPattern",
    "type"
})
public class EntityCreateResponse {

    @JsonProperty("contextResponses")
    private List<ContextResponse> contextResponses = new ArrayList<ContextResponse>();
    @JsonProperty("id")
    private String id;
    @JsonProperty("isPattern")
    private String isPattern;
    @JsonProperty("type")
    private String type;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The contextResponses
     */
    @JsonProperty("contextResponses")
    public List<ContextResponse> getContextResponses() {
        return contextResponses;
    }

    /**
     * 
     * @param contextResponses
     *     The contextResponses
     */
    @JsonProperty("contextResponses")
    public void setContextResponses(List<ContextResponse> contextResponses) {
        this.contextResponses = contextResponses;
    }

    public EntityCreateResponse withContextResponses(List<ContextResponse> contextResponses) {
        this.contextResponses = contextResponses;
        return this;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public EntityCreateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The isPattern
     */
    @JsonProperty("isPattern")
    public String getIsPattern() {
        return isPattern;
    }

    /**
     * 
     * @param isPattern
     *     The isPattern
     */
    @JsonProperty("isPattern")
    public void setIsPattern(String isPattern) {
        this.isPattern = isPattern;
    }

    public EntityCreateResponse withIsPattern(String isPattern) {
        this.isPattern = isPattern;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public EntityCreateResponse withType(String type) {
        this.type = type;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public EntityCreateResponse withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}

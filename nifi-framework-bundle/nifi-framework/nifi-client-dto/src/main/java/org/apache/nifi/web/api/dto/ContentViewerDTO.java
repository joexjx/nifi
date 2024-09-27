/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.nifi.web.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

/**
 * Details for the controller configuration.
 */
@XmlType(name = "contentViewer")
public class ContentViewerDTO {

    private String displayName;
    private String uri;
    private List<SupportedMimeTypesDTO> supportedMimeTypes;

    /**
     * @return The display name of the Content Viewer
     */
    @Schema(description = "The display name of the Content Viewer.", accessMode = Schema.AccessMode.READ_ONLY)
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return The uri of the Content Viewer
     */
    @Schema(description = "The uri of the Content Viewer.", accessMode = Schema.AccessMode.READ_ONLY)
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * @return The mime types this Content Viewer supports
     */
    @Schema(description = "The mime types this Content Viewer supports.", accessMode = Schema.AccessMode.READ_ONLY)
    public List<SupportedMimeTypesDTO> getSupportedMimeTypes() {
        return supportedMimeTypes;
    }

    public void setSupportedMimeTypes(List<SupportedMimeTypesDTO> supportedMimeTypes) {
        this.supportedMimeTypes = supportedMimeTypes;
    }
}
/*
 * Copyright (c) 2020 Dzikoysk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.panda_lang.reposilite.repository;

import org.panda_lang.reposilite.metadata.MetadataUtils;

import java.nio.file.Path;

final class Artifact {

    private final Repository repository;
    private final String group;
    private final String artifact;
    private final String version;

    Artifact(Repository repository, String group, String artifact, String version) {
        this.repository = repository;
        this.group = group;
        this.artifact = artifact;
        this.version = version;
    }

    public Path getFile(String fileName) {
        return repository.getFile(getLocalPath() + fileName);
    }

    public String getLocalPath() {
        return getGroupPath() + "/" + artifact + "/" + version + "/";
    }

    private String getGroupPath() {
        return group
                .replaceAll("([^`])\\.([^`])", "$1/$2")
                .replace(MetadataUtils.ESCAPE_DOT, ".");
    }

    public Repository getRepository() {
        return repository;
    }

}

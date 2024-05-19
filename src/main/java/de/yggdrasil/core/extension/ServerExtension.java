package de.yggdrasil.core.extension;

import java.util.List;

public abstract class ServerExtension {

    final String name;
    final List<String> dependencies;

    public ServerExtension(String name, List<String> dependencies) {
        this.name = name;
        this.dependencies = dependencies;
    }

}
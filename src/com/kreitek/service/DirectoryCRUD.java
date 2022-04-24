package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.File;

public class DirectoryCRUD implements CRUD{
    Directory directory;
    private static final String NO_ES_VALIDO_PARA_DIRECTORIOS = "No es válido para directorios";

    public DirectoryCRUD(Directory directory){
        this.directory = directory;
    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);
    }

    @Override
    public void write(byte[] buffer) {
        throw new UnsupportedOperationException(NO_ES_VALIDO_PARA_DIRECTORIOS);

    }
}

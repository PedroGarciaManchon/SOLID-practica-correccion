package com.kreitek.service;

import com.kreitek.files.File;

public class FileCRUD implements CRUD{
    File fichero;

    public FileCRUD(File fichero){
        this.fichero = fichero;
    }

    @Override
    public byte[] read(int numberOfBytesToRead) {
        if (fichero.getPosition() + numberOfBytesToRead > fichero.getSize()) {
            numberOfBytesToRead = fichero.getSize() - fichero.getPosition();
        }
        // Aquí habría lógica que lee el contenido del fichero
        byte[] buffer = new byte[numberOfBytesToRead];
        int newPosition = fichero.getPosition() + numberOfBytesToRead;
        fichero.setPosition(newPosition);
        return buffer;
    }

    @Override
    public void write(byte[] buffer) {
        // Aquí habría lógica que escribiría en el fichero
        int newSize = fichero.getSize() + buffer.length;
        fichero.setSize(newSize);
        int newPosition = fichero.getPosition() + buffer.length;
        fichero.setPosition(newPosition);
    }

}

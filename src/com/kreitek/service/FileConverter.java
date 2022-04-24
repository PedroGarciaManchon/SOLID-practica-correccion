package com.kreitek.service;

import com.kreitek.files.File;
import com.kreitek.files.FileSystemItem;
import com.kreitek.files.error.InvalidFileFormatException;

public class FileConverter {
    FileSystemItem fichero;

    public FileConverter(FileSystemItem fichero){
        this.fichero = fichero;
    }

    public FileSystemItem convertMp3ToWav() {
        if (!"mp3".equalsIgnoreCase(fichero.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser mp3");
        }

        int indexOfLastDot = fichero.getName().lastIndexOf(".");
        String nameWithoutExtension = fichero.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = fichero.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".wav";
        FileSystemItem result = new File(fichero.getParent(), newFileName);
        result.open();
        // Lógica de conversión de mp3 a wav. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }

    public FileSystemItem convertWavToMp3() {
        if (!"wav".equalsIgnoreCase(fichero.getExtension())) {
            throw new InvalidFileFormatException("El fichero debe ser wav");
        }

        int indexOfLastDot = fichero.getName().lastIndexOf(".");
        String nameWithoutExtension = fichero.getName();
        if (indexOfLastDot > 0) {
            nameWithoutExtension = fichero.getName().substring(0, indexOfLastDot);
        }
        String newFileName = nameWithoutExtension + ".mp3";
        FileSystemItem result = new File(fichero.getParent(), newFileName);
        result.open();
        // Lógica de conversión de wav a mp3. Se lee de este fichero y se escribe en result
        result.close();
        return result;
    }
}

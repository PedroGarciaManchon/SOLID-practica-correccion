package com.kreitek.service;

public interface CRUD {
    public abstract byte[] read(int numberOfBytesToRead);

    public abstract void write(byte[] buffer);
}

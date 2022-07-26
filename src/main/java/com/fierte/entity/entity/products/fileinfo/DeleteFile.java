package com.fierte.entity.entity.products.fileinfo;

public class DeleteFile {

    private String[] files;

    public DeleteFile(){}

    public DeleteFile(String[] files){
        this.files = files;
    }

    public String[] getFiles() {
        return files;
    }

    public void setFiles(String[] files) {
        this.files = files;
    }
}

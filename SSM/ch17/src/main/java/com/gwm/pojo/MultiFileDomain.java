package com.gwm.pojo;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class MultiFileDomain {
    private List<String>  description;
    private List<MultipartFile> files;

    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public List<MultipartFile> getFiles() {
        return files;
    }

    public void setFile(List<MultipartFile> file) {
        this.files = file;
    }
}

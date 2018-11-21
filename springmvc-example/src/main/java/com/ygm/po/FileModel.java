package com.ygm.po;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by admin on 2018/11/14.
 */
public class FileModel {
    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    private MultipartFile file;

}

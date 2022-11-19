package com.rentcar.utility.aws.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AwsS3Service {

    String saveFile(MultipartFile file);

    byte[] downloadFile(String filename);

    String deleteFile(String filename);

    List<String> listAllFiles();
}
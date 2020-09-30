package com.upload;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;

import com.upload.controller.FileUploadController;

@SpringBootApplication
public class FileUploadDownloadApplication {

	public static void main(String[] args) {
		//new File(FileUploadController.uploadDirectory).mkdir();
		SpringApplication.run(FileUploadDownloadApplication.class, args);
	}
	@GetMapping("/hey")
	public String hi() {
		return "uploadView.html";
	}

}

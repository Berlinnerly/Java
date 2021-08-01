package com.berlin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Berlin
 * @date 2021/2/6 8:41
 * @description
 */

@Controller
public class Upload {

    @RequestMapping(value = "testupload", method = RequestMethod.POST)
    public String testUpload(@RequestParam(value = "desc", required = false) String desc,
                             @RequestParam("file") MultipartFile multipartFile) throws IOException {
        System.out.println("desc:" + desc);
        System.out.println("OriginalFilename:" + multipartFile.getOriginalFilename());
        InputStream inputStream = multipartFile.getInputStream();
        System.out.println("inputStream.available:" + inputStream.available());
        System.out.println("inputStream" + inputStream);
        return "success";
    }
}

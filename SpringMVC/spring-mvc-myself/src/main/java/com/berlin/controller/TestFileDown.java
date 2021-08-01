package com.berlin.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author Berlin
 * @date 2021/3/9 9:29
 * @description
 */

@Controller
public class TestFileDown {
    @RequestMapping(value="/download/{filename}")
    public ResponseEntity<byte[]> downloadEntity(HttpServletRequest request, @PathVariable("filename") String filename) throws Exception{
        String	path = "C:/";
//        String  fileName = "LOL.xlsx";
        File file=new File(path,filename);
        if(!file.isFile()){
            return null;
        }
        @SuppressWarnings("resource")
        InputStream input=new FileInputStream(file);
        byte[] buff=new byte[input.available()]; // 获取文件大小
        input.read(buff);
        HttpHeaders headers=new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename="+filename);
        HttpStatus status=HttpStatus.OK;
        ResponseEntity<byte[]> entity=new ResponseEntity<byte[]>(buff,headers,status);
        return  entity;
    }
}

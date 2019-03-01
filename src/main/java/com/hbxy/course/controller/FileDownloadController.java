package com.hbxy.course.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
public class FileDownloadController {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request,String filename) throws IOException {
        String path = request.getServletContext().getRealPath("/upload");
        File file = new File(path+File.separator+filename);
        filename = this.getFilename(request,filename);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentDispositionFormData("attachment",filename);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),headers, HttpStatus.OK);
    }

    private String getFilename(HttpServletRequest request, String filename) throws UnsupportedEncodingException {
        String[] IEBrowserKeyWords={"MSIE","Trident","Edge"};
        String userAgent=request.getHeader("User-Agent");
        for (String keyWord : IEBrowserKeyWords) {
            if (userAgent.contains(keyWord)) { //IE内核浏览器，统一为UTF-8编码显示
                return URLEncoder.encode(filename, "UTF-8");
            }
        }

//火狐等其它浏览器统一为ISO-8859-1编码显示
        return new String(filename.getBytes("UTF-8"), "ISO-8859-1");
    }

}

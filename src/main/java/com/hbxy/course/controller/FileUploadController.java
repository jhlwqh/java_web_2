package com.hbxy.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import sun.text.normalizer.NormalizerBase;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
public class FileUploadController {
    //执行上传文件
    @RequestMapping("/fileUpLoad1")
    public String handleFormUpLoad1(@RequestParam("name") String name,
                                    @RequestParam("uploadfile")List<MultipartFile> uploadfile,
                                    HttpServletRequest request, Model model){
        // 判断上传文件是否存在
        if(!uploadfile.isEmpty()&&uploadfile.size()>0){
            //循环输出上传的文件
            for(MultipartFile file : uploadfile){
                //获取上传文件的原始名称
                String originalFilename = file.getOriginalFilename();
                //设置上传文件的保存地址
                String dirPath = request.getServletContext().getRealPath("/upload/");
                File filePath = new File(dirPath);
                if(!filePath.exists()){
                    filePath.mkdir();
                }
                String newFilename = name+"_"+ UUID.randomUUID()+"_"+originalFilename;
                try{

                }
            }
        }

    }
}

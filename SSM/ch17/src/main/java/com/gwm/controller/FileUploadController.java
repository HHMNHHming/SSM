package com.gwm.controller;

import com.gwm.pojo.FileDomain;
import com.gwm.pojo.MultiFileDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class FileUploadController {
    private static final Log logger = LogFactory.getLog(FileUploadController.class);
    @RequestMapping("/onefile")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request){
        System.out.println("进入了onefile的程序··");
        String realPath = request.getServletContext().getRealPath("uploadFiles");
        String fileName = fileDomain.getFile().getOriginalFilename();

        assert fileName != null;
        File targetFile = new File(realPath,fileName);
        if(!targetFile.exists()){
            targetFile.mkdirs();
        }
        try{
            fileDomain.getFile().transferTo(targetFile);
            logger.info("上传成功");
        }catch(Exception e){
            e.printStackTrace();

        }

        return "showOne";
    }
    @RequestMapping("/multiFile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain,HttpServletRequest request){
        //获取webapp下的这个文件路径
        String realPath = request.getServletContext().getRealPath("uploadFiles");
        File targetDir = new File(realPath);
        if(!targetDir.exists()){
            targetDir.mkdirs();
        }
        List<MultipartFile> files =multiFileDomain.getFiles();
        for(int i=0;i<files.size();i++){
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            System.out.println(fileName);
            File targetFile = new File(realPath,fileName);

            try{
                file.transferTo(targetFile);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        logger.info("多文件上传成功");
        return "showMulti";
    }
}

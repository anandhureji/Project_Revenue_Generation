package com.dumping.demo.helper;

import org.springframework.web.multipart.MultipartFile;


public class Helper {





    //check that file is of excel type or not
    public static boolean checkExcelFormat(MultipartFile file) {

        String contentType = file.getContentType();
        if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
   

}

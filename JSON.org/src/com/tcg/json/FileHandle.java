/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PMPAdmin
 */
package com.tcg.json;

import java.io.InputStream;

public class FileHandle {
    
    public static InputStream inputStreamFromFile(String path) {
        try {
            InputStream inputStream = FileHandle.class.getResourceAsStream(path);
            return inputStream;
        }
        catch(Exception e) {
            e.printStackTrace();
        }
       return null; 
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataTypes;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Kailin Huang
 */
public class SimulationResult {
    private String path="";
    private String name="";
    private String type="";
    private final String HB="HB";
    private final String STD="S";
    private final String YAW="Yaw";
    private String year="";
    private int sizeAllPicFiles=0;
    ArrayList<File> allPicFiles = new ArrayList();
    public SimulationResult(String _path){
        path=_path;
        File dir = new File(path);

        File[] fileList =dir.listFiles();
        Arrays.sort(fileList);
        for(File f:fileList){
            if(f.getAbsolutePath().endsWith("png")){
                allPicFiles.add(f);
            }
        }
        String[] splitted = dir.getName().split("_");
        this.year=splitted[0];
        this.type=splitted[1];
        this.name=dir.getName();
        this.sizeAllPicFiles=allPicFiles.size();
        
    }
    
    public ArrayList<File> getListOfFiles(){
        return allPicFiles;
    }
    public String getType(){
        return type;
    }
    public String getName(){
        return name;
    }
    public int getSize(){
        return sizeAllPicFiles;
    }
    
    
}

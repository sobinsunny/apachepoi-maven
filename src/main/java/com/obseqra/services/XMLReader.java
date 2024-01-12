package com.obseqra.services;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public class XMLReader {
     public  void read(String filename) throws IOException {

         InputStream inputStream = XMLReader.class.getResourceAsStream(filename);
         if(inputStream != null){
             XSSFWorkbook workbook = new XSSFWorkbook (inputStream);
             Sheet sheet = workbook.getSheetAt ( 0 );
             for(Row row : sheet){
                for (Cell cell: row){
                    System.out.printf ("\t %s \t",cell.toString ());
                }
                 System.out.println ();
             }
         }
     }
}






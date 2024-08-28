/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem6lab1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import static org.apache.poi.ss.usermodel.CellType.BOOLEAN;
import static org.apache.poi.ss.usermodel.CellType.STRING;
import org.apache.poi.xssf.usermodel.*;

/**
 *
 * @author User
 */
public class ReadFromXlsx {
    
    public HashMap<Integer, ArrayList<Object>> readFromFile(int sheetIndex) {
        
        HashMap<Integer, ArrayList<Object>> map = new HashMap<>();
        try {
            try (InputStream file = getClass().getClassLoader().getResourceAsStream("sem6lab1.xlsx")) {
                XSSFWorkbook workbook = new XSSFWorkbook(file);
                XSSFSheet sheet = workbook.getSheetAt(sheetIndex);
                int columnsCount = sheet.getRow(0).getLastCellNum();
                for (int i = 0; i < columnsCount; i++) {
                    ArrayList<Object> columnData = new ArrayList<>();
                    for (int j = 0; j <= sheet.getLastRowNum(); j++) {
                        XSSFRow row = sheet.getRow(j);
                        if (row != null) {
                            XSSFCell cell = row.getCell(i);
                            if (cell !=null) {
                                switch (cell.getCellType()) {
                                    case BOOLEAN -> columnData.add(cell.getBooleanCellValue());
                                    case STRING -> columnData.add(cell.getStringCellValue());
                                }
                            }
                        }
                    }
                    map.put(i, columnData);
                }
                workbook.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    return map;
    }

}


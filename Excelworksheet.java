package org.excelsheet;
import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.*;

import org.apache.poi.hssf.usermodel.HSSFSheet;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.FormulaEvaluator;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class Excelworksheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// Reading file from local directory

			FileInputStream fis = new FileInputStream("C:\Users\BALAJI S\Desktop\New folder (2)");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Row row = sheet.getRow(2);
            Cell cell = row.getCell(1);
            //System.out.println(cell);
            //System.out.println(sheet.getRow(0).getCell(1));
            for (Row row1 : sheet) {
                for (Cell cell1 : row1) {
                    System.out.println(cell1);
                }
       }
   }
     catch(Exception e) {
   	  e.printStackTrace();
     }
     finally {
   	  System.out.println(" ");


	}

}
}

package com.fanniemae.selenium.grid;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

public class DDT_CSV_Read_2 {
	
	String csvTestDataFilePath ="C:\\Users\\Huser\\Desktop\\AutomationJars\\ShoppingCartTestData.csv";
	String resultsToCSV ="C:\\Users\\Huser\\Desktop\\AutomationJars\\ShoppingCartTestDataRESULTS.csv";
	
	CsvReader testdata = new CsvReader(csvTestDataFilePath);

	
	
    testdata.readHeaders();
    //get total numbers of header column
   int numberOfHeaders=testdata.getHeaderCount();
    //print header column
    for(int i=0;i<numberOfHeaders;i++)
    {
        System.out.print(testdata.getHeader(i)+",  ");
    }
    System.out.println();
	

    
    
    while (testdata.readRecord())
    {
    	
    	item2Search=testdata.get("Item2Search");
		qty=testdata.get("Qty");
		customerName=testdata.get("CustomerName");
		customerCity=testdata.get("CustomerCity");
		customerState=testdata.get("CustomerState");
    	System.out.println("The item to search is :" +Item2Search);
    }
    
    }

}

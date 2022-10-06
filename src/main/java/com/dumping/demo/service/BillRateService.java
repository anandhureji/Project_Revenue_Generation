package com.dumping.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.dumping.demo.entity.Associate;
import com.dumping.demo.entity.BillRate;
import com.dumping.demo.repo.BillRateRepository;


@Service
public class BillRateService {
	
	@Autowired
    private BillRateRepository billRateRepository;

	public void save(MultipartFile file) throws ParseException {

        try {
            InputStream is= file.getInputStream();
            //---------------------------
            Workbook workbook = new XSSFWorkbook(is);
            DataFormatter dataFormatter = new DataFormatter();
            Iterator<Sheet> sheets = workbook.sheetIterator();

            while(sheets.hasNext()) {
                Sheet sh = sheets.next();
                Iterator<Row> iterator = sh.iterator();
                // System.out.println("Sheet name is " + sh.getSheetName());
                // System.out.println("-----------------------------------");
                List<String> lst =  List.of("Project ID","Billable Hours","BillRate");
                List<String> indexes=new ArrayList<String>();

//                Iterator<Row> iterator = sh.iterator();
                int index_no=0;
                while (iterator.hasNext()&&index_no!=1) {
                    index_no++;
                    Row row = iterator.next();
                    Iterator<Cell> cellIterator = row.iterator();



                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
                        indexes.add(cellValue);
                        for (String s:lst) {
                            if (cellValue.equalsIgnoreCase(s)) {


                                System.out.print(cellValue + "\t");
                            }
                        }
                    }
                    System.out.println();
                }
//=========================================



                while (iterator.hasNext()) {
                    Row row = iterator.next();
                    Iterator<Cell> cellIterator = row.iterator();
                    int tmp_index=0;


                    BillRate p = new BillRate();
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        String cellValue = dataFormatter.formatCellValue(cell);
                        for (String s:lst) {
                            if (indexes.get(tmp_index).equalsIgnoreCase(s)) {
                                p.setProperty(s,cellValue);

                                // System.out.print(cellValue + "\t");
                            }
                        }
                        tmp_index++;
                    }

                    this.billRateRepository.save(p);
                    // System.out.println();
                }
            }
            workbook.close();
            // --------------------------
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}

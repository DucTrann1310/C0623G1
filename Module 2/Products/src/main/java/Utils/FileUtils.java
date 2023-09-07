package Utils;


import Models.ECategory;
import Models.Product;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
    public static List<Product> readDataUseFor() {
        List<Product> products =new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File("./data/products.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            // Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            // Lặp qua các hàng (rows), bắt đầu từ hàng thứ 1 (hàng đầu tiên là tiêu đề cột)
            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if (row != null) {
                    int id = (int) row.getCell(0).getNumericCellValue();
                    String name = row.getCell(1).getStringCellValue();
                    String description = row.getCell(2).getStringCellValue();
                    double price = row.getCell(3).getNumericCellValue();
                    String category = row.getCell(4).getStringCellValue();
                    int quantity = (int) row.getCell(5).getNumericCellValue();

                    Product product = new Product(id, name, description, price, ECategory.valueOf(category), quantity);
                    products.add(product);
                }
            }

            file.close();
            FileOutputStream outputStream = new FileOutputStream("./data/products.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
    public static void writeData(List<Product> products){
        Workbook workbook = new XSSFWorkbook();
        // Tạo một sheet mới
        Sheet sheet = workbook.createSheet("Products");

        // Ghi tiêu đề cột
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("ID");
        headerRow.createCell(1).setCellValue("Name");
        headerRow.createCell(2).setCellValue("Description");
        headerRow.createCell(3).setCellValue("Price");
        headerRow.createCell(4).setCellValue("Category");
        headerRow.createCell(5).setCellValue("Quantity");

        // Ghi dữ liệu sản phẩm
        int rowCount = 1;
        for (Product product : products) {
            Row row = sheet.createRow(rowCount++);
            row.createCell(0).setCellValue(product.getId());
            row.createCell(1).setCellValue(product.getName());
            row.createCell(2).setCellValue(product.getDescription());
            row.createCell(3).setCellValue(product.getPrice());
            row.createCell(4).setCellValue(product.getCategory().toString());
            row.createCell(5).setCellValue(product.getQuantity());
        }
        // Tự động điều chỉnh kích thước cột
        for (int i = 0; i < 6; i++) {
            sheet.autoSizeColumn(i);
        }
        // Lưu workbook vào file
        try (FileOutputStream outputStream = new FileOutputStream("./data/products.xlsx")) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FileUtils.readDataUseFor();
    }
}

package View;

import Models.ECategory;
import Models.Product;
import Service.IProductService;
import Service.ProductService;
import Utils.GetValue;
import Utils.ValidateUtils;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private IProductService iProductService;
    public ProductView(){
        iProductService = new ProductService();
    }
    public void launcher(){
        System.out.println("------------ CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM ------------");
        System.out.println("-------- Menu:                                ---------");
        System.out.println("-------- Nhập 1: Xem danh sách                ---------");
        System.out.println("-------- Nhập 2: Thêm mới                     ---------");
        System.out.println("-------- Nhập 3: Cập nhật                     ---------");
        System.out.println("-------- Nhập 4: Xóa                          ---------");
        System.out.println("-------- Nhập 5: Sắp xếp                      ---------");
        System.out.println("-------- Nhập 6: Tìm sản phẩm có giá đắt nhất ---------");
        System.out.println("-------- Nhập 7: Đọc từ file                  ---------");
        System.out.println("-------- Nhập 8: Ghi vào file                 ---------");
        System.out.println("-------- Nhập 9: Thoát                        ---------");
        System.out.println("-------- Chọn:                                ---------");
        int actionMenu = GetValue.getIntOfWithBounds(1,9);
        switch (actionMenu){
            case 1:
                showListProduct();
                launcher();
                break;
            case 2:
                createProduct();
                launcher();
                break;
            case 3:
                updateProduct();
                launcher();
                break;
            case 4:
                deleteProduct();
                break;
            case 5:
                sortProduct();
                launcher();
                break;
            case 6:
                findMaxPriceProduct();
                launcher();
                break;
            case 9:
                System.exit(0);
        }
    }

    private void findMaxPriceProduct() {
        List<Product> products = iProductService.getAll();
        List<Product> product = iProductService.findMaxPriceProduct(products);
        displayProduct(product);
    }

    private void sortProduct() {
        System.out.println("Danh sách sản phẩm sau khi sắp xếp:");
        Comparator<Product> comparator = null;
        List<Product> products = iProductService.getAll();
        products.sort(sortProductByPrice(comparator));
        displayProduct(products);
    }

    private void displayProduct(List<Product> products) {
        System.out.printf("%5s | %20s | %20s | %15s | %15s | %10s\n",
                "ID","NAME","DESCRIPTION","CATEGORY","PRICE","QUANTITY");
        for(Product p : products){
            System.out.printf("%5s | %20s | %20s | %15s | %15s | %10s\n",
                    p.getId(),p.getName(),p.getDescription(),p.getCategory(),p.getPrice(),p.getQuantity());
        }
    }

    private Comparator<Product>sortProductByPrice(Comparator<Product> comparator){
        return Comparator.comparing(Product::getPrice);
    }

    private void deleteProduct() {
        System.out.println("Nhập id muốn sửa: ");
        long idUpdate = Long.parseLong(checkInputValid(ValidateUtils.FIELD_ID, ValidateUtils.FIELD_ID_MESSAGE, ValidateUtils.REGEX_ID));
        Product findProduct = iProductService.findProductById(idUpdate);
        if(findProduct == null){
            System.out.println("Không tìm thấy sản phẩm mới mã sản phẩm trên");
            launcher();
        }else if(findProduct != null) {
            System.out.println("Xác nhận xóa sản phẩm:");
            System.out.println("Nhập 1: Yes");
            System.out.println("Nhập 2: No");
            int action = GetValue.getIntOfWithBounds(1,2);
            switch (action){
                case 1:
                    iProductService.deleteProduct(idUpdate);
                    System.out.println("Xóa sản phẩm thành công");
                    launcher();
                    break;
                case 2:
                    launcher();
                    break;
            }
        }
    }

    private void updateProduct() {
        System.out.println("Nhập id muốn sửa: ");
        long idUpdate = Long.parseLong(checkInputValid(ValidateUtils.FIELD_ID, ValidateUtils.FIELD_ID_MESSAGE, ValidateUtils.REGEX_ID));
        Product findProduct = iProductService.findProductById(idUpdate);
        Product productUpdate = null;
        if (findProduct == null) {
            System.out.println("không tìm thấy product có id " + idUpdate);
        } else if (findProduct != null) {
            productUpdate = getProductBasicInfo();
        }
        iProductService.updateProduct(idUpdate, productUpdate);
        System.out.println("Cập nhật product thành công");
    }

    private void createProduct() {
        Product product =getProductBasicInfo();
        iProductService.createProduct(product);
        System.out.println("Thêm mới thành công");
    }

    private Product getProductBasicInfo() {
        String strId = checkInputValid(ValidateUtils.FIELD_ID,ValidateUtils.FIELD_ID_MESSAGE,ValidateUtils.REGEX_ID);
        String strName = checkInputValid(ValidateUtils.FIELD_NAME,ValidateUtils.FIELD_NAME_MASSAGE,ValidateUtils.REGEX_NAME);
        String strDescription = checkInputValid(ValidateUtils.FIELD_DESCRIPTION,ValidateUtils.FIELD_DESCRIPTION_MESSAGE,ValidateUtils.REGEX_DESCRIPTION);
        String strPrice = checkInputValid(ValidateUtils.FIELD_PRICE,ValidateUtils.FIELD_PRICE_MASSAGE,ValidateUtils.REGEX_PRICE);
        String strQuantity = checkInputValid(ValidateUtils.FIELD_QUANTITY,ValidateUtils.FIELD_QUANTITY_MESSAGE,ValidateUtils.REGEX_QUANTITY);
        System.out.println("Nhập loại: ");
        for(ECategory eCategory : ECategory.values()){
            System.out.println(eCategory.getName() + ": " + eCategory.getId());
        }
        int idCategory = GetValue.getIntOfWithBounds(1,2);
        ECategory category = ECategory.findById(idCategory);

        Product product = new Product(Long.parseLong(strId),strName,strDescription,Double.parseDouble(strPrice),category,Integer.parseInt(strQuantity));
        return product;
    }
    public String  checkInputValid(String fieldName, String  fieldMessage, String fieldPattern){
        String input = null;
        boolean validateInput = false;
        do{
            System.out.printf("Nhập %s: \n", fieldName);
            input = scanner.nextLine();
            if(!ValidateUtils.isValid(fieldPattern,input)){
                System.out.println(fieldMessage);
                validateInput = true;
            }else {
                validateInput = false;
            }
        }while (validateInput);
        return input;
    }

    private void showListProduct() {
        System.out.printf("%5s | %20s | %20s | %15s | %15s | %10s\n",
                "ID","NAME","DESCRIPTION","CATEGORY","PRICE","QUANTITY");
        List<Product>products = iProductService.getAll();
        for(Product p : products){
            System.out.printf("%5s | %20s | %20s | %15s | %15s | %10s\n",
                    p.getId(),p.getName(),p.getDescription(),p.getCategory(),p.getPrice(),p.getQuantity());
        }
    }

    public static void main(String[] args) {
        ProductView productView = new ProductView();
        productView.launcher();
    }
}

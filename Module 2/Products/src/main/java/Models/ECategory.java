package Models;

public enum ECategory {
    PHONE(1, "Đện thoại"), LAPTOP(2, "Máy tính bảng");

    private int id;
    private String name;
    private ECategory(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static ECategory findById(int idCategory) {
        for(ECategory e : values()){
            if(e.getId() == idCategory){
                return e;
            }
        }
        return null;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}


package objects;

public enum AccessType {
    READ("Чтение"),
    WRITE("Запись");
    private String discription;
    AccessType(String discription)
    {
        this.discription = discription;
    }
}

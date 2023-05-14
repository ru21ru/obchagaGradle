package objects;

/*       ·      доступ ко всем данным системы;

               ·      доступ в рамках одного университета;

               ·      доступ в рамках одного общежития.*/

public enum Role {
    ADMIN("Доступ ко всем данным системы"),
    UNIVERSITY("Доступ в рамках одного университета"),
    DORMITORY("Доступ в рамках одного общежития");
    private String dicription;
    Role(String dicription){
        this.dicription = dicription;
    }
}

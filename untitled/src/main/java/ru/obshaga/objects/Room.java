package objects;

/*1.    ID

        2.    Номер

        3.    Общежитие

        4.    Вместимость

        5.    Доступность для проживания

        6.    Пол проживающих*/
public class Room {
    private int id;
    private int number;
    private Dormitory dormitory;
    private int capacity;
    private boolean available;
    private Gender gender;
}

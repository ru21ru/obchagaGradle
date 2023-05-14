package objects;

import java.util.Calendar;

/*1.    ID

        2.    ФИО

        3.    Пол

        4.    Университет

        5.    Общежитие

        6.    Комната

        7.    Год поступления

        8.    Дата отчисления

        9.    Проживает ли в общежитии*/
public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private Gender gender;
    private University university;
    private Dormitory dormitory;
    private Room room;
    private Calendar yearIn;
    private Calendar dateOut;
    private boolean liveInDormitory;

    public Student(StudentBilder studentBilder){
        id = studentBilder.id;
        name = studentBilder.name;
        surname = studentBilder.surname;
        patronymic = studentBilder.patronymic;
        gender = studentBilder.gender;
        university = studentBilder.university;
        dormitory = studentBilder.dormitory;
        room = studentBilder.room;
        yearIn = studentBilder.yearIn;
        dateOut = studentBilder.dateOut;
        liveInDormitory = studentBilder.liveInDormitory;

    }
    public static class StudentBilder{
        private int id;
        private String name;
        private String surname;
        private String patronymic;
        private Gender gender;
        private University university;
        private Dormitory dormitory;
        private Room room;
        private Calendar yearIn;
        private Calendar dateOut;
        private boolean liveInDormitory;
        public StudentBilder id(int id) {
            this.id = id;
            return this;
        }
        public StudentBilder name(String name) {
            this.name = name;
            return this;
        }
        public StudentBilder surname(String surname) {
            this.surname = surname;
            return this;
        }
        public StudentBilder patronymic(String patronymic) {
            this.patronymic = patronymic;
            return this;
        }
        public StudentBilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }
        public StudentBilder university(University university) {
            this.university = university;
            return this;
        }
        public StudentBilder dormitory(Dormitory dormitory) {
            this.dormitory = dormitory;
            return this;
        }
        public StudentBilder room(Room room) {
            this.room = room;
            return this;
        }
        public StudentBilder yearIn(Calendar yearIn) {
            this.yearIn = yearIn;
            return this;
        }
        public StudentBilder dateOut(Calendar dateOut) {
            this.dateOut = dateOut;
            return this;
        }
        public StudentBilder liveInDormitory(boolean liveInDormitory) {
            this.liveInDormitory = liveInDormitory;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}

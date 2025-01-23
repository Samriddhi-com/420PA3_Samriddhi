package com.modelClass;

 class Student {
     private String name;
     private int age;

     // Constructor
     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
     // Getters
     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }
 }
 class Course {
    private String courseName;
    private List<Student> students;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }
}

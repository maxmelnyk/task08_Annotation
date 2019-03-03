package com.melnyk.annotations;

import com.melnyk.reflections.ClassInfo;

public class MyClass {

  @MyAnnotation(name = "Lenovo", age = 15)
  private String name;
  private String model;

  @MyAnnotation(age = 3)
  private int age;
  private int year;

  public MyClass() {
  }

  public MyClass(String name, String model, int age, int year) {
    this.name = name;
    this.model = model;
    this.age = age;
    this.year = year;
  }

  public void getCharacteristics() {
    new ClassInfo().getClassInfo(this);
  }

  @Override
  public String toString() {
    return "My laptop{" +
        "name='" + name + '\'' +
        ", model='" + model + '\'' +
        ", age=" + age +
        ", year=" + year +
        '}';
  }
}

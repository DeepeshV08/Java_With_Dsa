// OOPS (Object-Oriented Programming System) in Java

// OOPS is a programming paradigm based on the concept of objects. It helps organize code into reusable, secure, and maintainable components.

// Think of it like the real world:

// A Car is an object.
// It has properties (data) like color, brand, and model.
// It has behaviors (methods) like start(), stop(), and accelerate().

// In Java, almost everything revolves around objects.

// Why OOPS?

// OOPS helps in:

// ✅ Code Reusability
// ✅ Security (Data Hiding)
// ✅ Easy Maintenance
// ✅ Better Code Organization
// ✅ Faster Development
// Basic Terminologies
// 1. Class

// A class is a blueprint or template for creating objects.

// Example:

// class Car {
//     String brand;
//     String color;

//     void start() {
//         System.out.println("Car Started");
//     }
// }

// Here, Car is a class.

// 2. Object

// An object is an instance of a class.

// Car c1 = new Car();

// c1.brand = "BMW";
// c1.color = "Black";

// c1.start();

// Output:

// Car Started
// Four Pillars of OOPS
// 1. Encapsulation
// Definition

// Encapsulation means wrapping data (variables) and methods together into a single unit (class) and restricting direct access to the data.

// Use private variables and getter/setter methods.

// Example:

// class Student {

//     private int age;

//     public void setAge(int age) {
//         this.age = age;
//     }

//     public int getAge() {
//         return age;
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Student s = new Student();

//         s.setAge(21);

//         System.out.println(s.getAge());
//     }
// }

// Output:

// 21
// Advantages
// Data Security
// Data Hiding
// Controlled Access
// 2. Inheritance
// Definition

// Inheritance allows one class to acquire the properties and methods of another class.

// Keyword:

// extends

// Example:

// class Animal {

//     void sound() {
//         System.out.println("Animal makes sound");
//     }
// }

// class Dog extends Animal {

//     void bark() {
//         System.out.println("Dog Barks");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Dog d = new Dog();

//         d.sound();
//         d.bark();
//     }
// }

// Output:

// Animal makes sound
// Dog Barks
// Advantages
// Code Reusability
// Less Duplicate Code
// 3. Polymorphism
// Definition

// Poly means many and morphism means forms.

// One method can behave differently in different situations.

// There are two types:

// (A) Compile-Time Polymorphism (Method Overloading)

// Same method name but different parameters.

// class Calculator {

//     int add(int a, int b) {
//         return a + b;
//     }

//     int add(int a, int b, int c) {
//         return a + b + c;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Calculator c = new Calculator();

//         System.out.println(c.add(5, 10));
//         System.out.println(c.add(5, 10, 15));
//     }
// }

// Output:

// 15
// 30
// (B) Run-Time Polymorphism (Method Overriding)

// A child class provides its own implementation of a parent class method.

// class Animal {

//     void sound() {
//         System.out.println("Animal Sound");
//     }
// }

// class Dog extends Animal {

//     @Override
//     void sound() {
//         System.out.println("Dog Barks");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Animal a = new Dog();

//         a.sound();
//     }
// }

// Output:

// Dog Barks
// 4. Abstraction
// Definition

// Abstraction means showing only the essential details and hiding the implementation.

// It is achieved using:

// Abstract Class
// Interface
// Abstract Class Example
// abstract class Vehicle {

//     abstract void start();
// }

// class Bike extends Vehicle {

//     void start() {
//         System.out.println("Bike Started");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Vehicle v = new Bike();

//         v.start();
//     }
// }

// Output:

// Bike Started
// Interface Example
// interface Animal {

//     void sound();
// }

// class Dog implements Animal {

//     public void sound() {
//         System.out.println("Dog Barks");
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         Animal a = new Dog();

//         a.sound();
//     }
// }

// Output:

// Dog Barks
// OOPS Diagram
//                OOPS
//                  |
//      -----------------------
//      |     |      |        |
//  Encapsulation Inheritance Polymorphism Abstraction
// Real-Life Example (Bank Account)
// class BankAccount {

//     private double balance;

//     public void deposit(double amount) {
//         balance += amount;
//     }

//     public double getBalance() {
//         return balance;
//     }
// }

// public class Main {

//     public static void main(String[] args) {

//         BankAccount account = new BankAccount();

//         account.deposit(5000);

//         System.out.println(account.getBalance());
//     }
// }

// Output:

// 5000.0

// This demonstrates:

// Encapsulation: balance is private.
// Abstraction: User calls deposit() without knowing the internal logic.
// Interview Questions
// 1. What is OOPS?

// OOPS (Object-Oriented Programming System) is a programming paradigm based on objects that combine data and behavior. Its four pillars are Encapsulation, Inheritance, Polymorphism, and Abstraction.

// 2. What are the four pillars of OOPS?
// Encapsulation
// Inheritance
// Polymorphism
// Abstraction
// 3. What is the difference between Method Overloading and Method Overriding?
// Method Overloading	Method Overriding
// Same method name	Same method name
// Different parameters	Same parameters
// Compile-time polymorphism	Runtime polymorphism
// Usually in the same class	Parent and child classes
// 4. What is the difference between an Abstract Class and an Interface?
// Abstract Class	Interface
// Uses abstract keyword	Uses interface keyword
// Can have abstract and concrete methods	Can declare methods (and, in modern Java, also default and static methods)
// Supports constructors and instance fields	No constructors; fields are public static final constants
// A class can extend only one abstract class	A class can implement multiple interfaces
// 5. What is the difference between a Class and an Object?
// Class	Object
// Blueprint or template	Instance of a class
// Does not occupy memory by itself	Occupies memory when created
// Used to define properties and methods	Used to access those properties and methods
package com.prasad.practice.file.serialization;
import java.io.*;
import java.util.List;
public class SerializationDemo {
    public static final String FILE_PATH="C:\\Users\\prasa\\Downloads\\FileDemo\\";
    public static final String FILE_NAME="student.ser";
    public static void main(String[] args) {
        SerializationDemo serializationDemo = new SerializationDemo();

        Student.Address rohitAddress = new Student.Address("California");
        Student.Address shamAddress = new Student.Address("California");
        // prepare data to serialize
        Student peter = new Student(1 , " Rohit ", rohitAddress);
        Student john = new Student(2 , " Sham ", shamAddress);

        // serialization process
        serializationDemo.serialize(List.of(peter, john));
        System.out.println("------------------------------------");

        // deserialization process
        //List<Student> deserializedStudents = serializationDemo.deserialize();
        //for (Student student : deserializedStudents) {
        for (Student student : serializationDemo.deserialize()) {
            System.out.println(student);
        }

        // advance inline code for above 2 lines
        //serializationDemo.deserialize().forEach(System.out::println);
    }

    private void serialize(List<Student> students) {
        // Serialization
        try {
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(FILE_PATH + FILE_NAME);
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(students);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private List<Student> deserialize() {
        List<Student> students = null;

        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(FILE_PATH + FILE_NAME);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            students = (List<Student>) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized");
            System.out.println("---------------------------");
        } catch (ClassNotFoundException | IOException ex) {
            System.err.println(ex.getMessage());
        }
        return students;
    }

}

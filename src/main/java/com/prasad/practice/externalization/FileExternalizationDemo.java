package com.prasad.practice.externalization;

import java.io.*;

public class FileExternalizationDemo {
    private static final File EMPLOYEE_DATA_FILE = new File("employee-data.txt");

    public static void main(String... args) throws Exception {
//    emplpyee object -we will store this data in above file
        Employee employee = new Employee(1, "Prasad", "pune");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(EMPLOYEE_DATA_FILE));
        outputStream.writeObject(employee);
        outputStream.flush();
        System.out.println("Data store in file..............");


        System.out.println("now, reading data from store file.......");
//        read data from employee-data.txt file
        ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(EMPLOYEE_DATA_FILE));
        Employee readEmployeeObject = (Employee) inStream.readObject();
        System.out.println("After De externalization of Employee: "
                + "\nEmployee Id: " + readEmployeeObject.getEmp_id()
                + "\nName:" + readEmployeeObject.getName()
                + "\nAddress:" + readEmployeeObject.getAddress());
    }

}


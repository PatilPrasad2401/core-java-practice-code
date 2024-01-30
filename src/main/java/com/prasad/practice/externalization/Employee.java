package com.prasad.practice.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
    private int emp_id;
    private String name;
    private String address;

    public int getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public Employee(int emp_id,String name,String address){
        this.emp_id=emp_id;
        this.name=name;
        this.address=address;
    }

    public Employee() {

    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(emp_id);
        out.writeObject(address);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name=(String) in.readObject();
        emp_id=in.readInt();
        address=(String) in.readObject();
    }
}

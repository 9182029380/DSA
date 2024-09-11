package org.example.queue;

public class Customer {
    public String name;
    public int age;
    public int customerid;

    public Customer(String name, int age, int customerid) {
        this.name = name;
        this.age = age;
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", customerid=" + customerid +
                '}';
    }


}

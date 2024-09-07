package org.example.models;

public class Student {

    //added name
    private String name;
    
    private String address;

    public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

}

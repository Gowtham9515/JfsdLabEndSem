package com.klef.jfsd.exam.model;

import java.util.List;

public class Employee {
    private Integer employeeId;
    private String name;
    private Double salary;
    private Boolean isFullTime;
    private List<String> skills;

    // Constructor for Dependency Injection
    public Employee(Integer employeeId, String name, Double salary, Boolean isFullTime, List<String> skills) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.skills = skills;
    }

    // Getters and Setters
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getIsFullTime() {
        return isFullTime;
    }

    public void setIsFullTime(Boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{id=" + employeeId + ", name=" + name + ", salary=" + salary +
                ", isFullTime=" + isFullTime + ", skills=" + skills + "}";
    }
}

package com.cobra.SpringLearning.job;

public class Job {
    private  Long id;
    private String title;
    private String description;
    private Long minSalary;
    private Long manSalary;
    private String location;

    public Job(String description, String title, Long id, Long minSalary, Long manSalary, String location) {
        this.description = description;
        this.title = title;
        this.id = id;
        this.minSalary = minSalary;
        this.manSalary = manSalary;
        this.location = location;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Long minSalary) {
        this.minSalary = minSalary;
    }

    public Long getManSalary() {
        return manSalary;
    }

    public void setManSalary(Long manSalary) {
        this.manSalary = manSalary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

package com.test.object;

public class MovieClass {
    private int id;
    private String name;
    private double price;
    private double score;
    private String diretor;
    private String actor;
    private String info;

    public MovieClass() {
    }

    public MovieClass(int id, String name, double price, double score, String diretor, String actor, String info) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.score = score;
        this.diretor = diretor;
        this.actor = actor;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

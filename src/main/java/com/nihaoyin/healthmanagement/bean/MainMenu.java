package com.nihaoyin.healthmanagement.bean;

import java.util.List;

public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> sMenu;

    public MainMenu(){

    }
    public MainMenu(int id, String title, String path, List<SubMenu> sMenu) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.sMenu = sMenu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setsMenu(List<SubMenu> sMenu) {
        this.sMenu = sMenu;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public List<SubMenu> getsMenu() {
        return sMenu;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", sMenu=" + sMenu +
                '}';
    }
}

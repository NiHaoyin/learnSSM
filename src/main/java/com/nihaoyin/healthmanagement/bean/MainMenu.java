package com.nihaoyin.healthmanagement.bean;

import java.util.List;

public class MainMenu {
    private int id;
    private String title;
    private String path;
    private List<SubMenu> subMenu;

    public MainMenu(){

    }
    public MainMenu(int id, String title, String path, List<SubMenu> sMenu) {
        this.id = id;
        this.title = title;
        this.path = path;
        this.subMenu = sMenu;
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

    public void setSubMenu(List<SubMenu> sMenu) {
        this.subMenu = sMenu;
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

    public List<SubMenu> getSubMenu() {
        return subMenu;
    }

    @Override
    public String toString() {
        return "MainMenu{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", path='" + path + '\'' +
                ", sMenu=" + subMenu +
                '}';
    }
}

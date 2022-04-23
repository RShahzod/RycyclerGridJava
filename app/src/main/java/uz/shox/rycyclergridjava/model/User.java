package uz.shox.rycyclergridjava.model;

public class User {
    private int profileImg;
    private String name;

    public User(int profileImg, String name) {
        this.profileImg = profileImg;
        this.name = name;
    }

    public int getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(int profileImg) {
        this.profileImg = profileImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.javabbs.pojo;

public class User {

    private Integer user_id;
    private String user_name;
    private String user_password;
    private String user_profile_photo;
    private String user_birthday;
    private int user_exp;
    private String user_signature;
    private String user_email;
    private String user_phone_number;
    private String create_time;
    private String update_time;
    private boolean user_if_op;
    private int user_level;
    private String user_sex;
    private boolean user_if_used;
    private int count_of_follow;
    private int count_of_be_follow;
    private int count_of_private_posts;
    private int count_of_posts;
    private int count_of_comments;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_profile_photo() {
        return user_profile_photo;
    }

    public void setUser_profile_photo(String user_profile_photo) {
        this.user_profile_photo = user_profile_photo;
    }

    public String getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(String user_birthday) {
        this.user_birthday = user_birthday;
    }

    public int getUser_exp() {
        return user_exp;
    }

    public void setUser_exp(int user_exp) {
        this.user_exp = user_exp;
    }

    public String getUser_signature() {
        return user_signature;
    }

    public void setUser_signature(String user_signature) {
        this.user_signature = user_signature;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_phone_number() {
        return user_phone_number;
    }

    public void setUser_phone_number(String user_phone_number) {
        this.user_phone_number = user_phone_number;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public boolean isUser_if_op() {
        return user_if_op;
    }

    public void setUser_if_op(boolean user_if_op) {
        this.user_if_op = user_if_op;
    }

    public int getUser_level() {
        return user_level;
    }

    public void setUser_level(int user_level) {
        this.user_level = user_level;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public boolean isUser_if_used() {
        return user_if_used;
    }

    public void setUser_if_used(boolean user_if_used) {
        this.user_if_used = user_if_used;
    }

    public int getCount_of_follow() {
        return count_of_follow;
    }

    public void setCount_of_follow(int count_of_follow) {
        this.count_of_follow = count_of_follow;
    }

    public int getCount_of_be_follow() {
        return count_of_be_follow;
    }

    public void setCount_of_be_follow(int count_of_be_follow) {
        this.count_of_be_follow = count_of_be_follow;
    }

    public int getCount_of_private_posts() {
        return count_of_private_posts;
    }

    public void setCount_of_private_posts(int count_of_private_posts) {
        this.count_of_private_posts = count_of_private_posts;
    }

    public int getCount_of_posts() {
        return count_of_posts;
    }

    public void setCount_of_posts(int count_of_posts) {
        this.count_of_posts = count_of_posts;
    }

    public int getCount_of_comments() {
        return count_of_comments;
    }

    public void setCount_of_comments(int count_of_comments) {
        this.count_of_comments = count_of_comments;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_profile_photo='" + user_profile_photo + '\'' +
                ", user_birthday='" + user_birthday + '\'' +
                ", user_exp=" + user_exp +
                ", user_signature='" + user_signature + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_phone_number='" + user_phone_number + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", user_if_op=" + user_if_op +
                ", user_level=" + user_level +
                ", user_sex='" + user_sex + '\'' +
                ", user_if_used=" + user_if_used +
                ", count_of_follow=" + count_of_follow +
                ", count_of_be_follow=" + count_of_be_follow +
                ", count_of_private_posts=" + count_of_private_posts +
                ", count_of_posts=" + count_of_posts +
                ", count_of_comments=" + count_of_comments +
                '}';
    }
}

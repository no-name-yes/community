package com.javabbs.pojo;

public class Post {
    private Integer post_id;
    private String post_title;
    private String create_time;
    private String update_time;
    private String post_text;
    private int count_of_comments;
    private int count_of_likes;
    private int count_of_private;      //帖子收藏值
    private int count_of_browsers;
    private String category_id;
    private Integer author_id;
    private boolean post_if_visible;

    //新增一个帖子
    public void new_post(Post post){

    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getPost_title() {
        return post_title;
    }

    public void setPost_title(String post_title) {
        this.post_title = post_title;
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

    public String getPost_text() {
        return post_text;
    }

    public void setPost_text(String post_text) {
        this.post_text = post_text;
    }

    public int getCount_of_comments() {
        return count_of_comments;
    }

    public void setCount_of_comments(int count_of_comments) {
        this.count_of_comments = count_of_comments;
    }

    public int getCount_of_likes() {
        return count_of_likes;
    }

    public void setCount_of_likes(int count_of_likes) {
        this.count_of_likes = count_of_likes;
    }

    public int getCount_of_private() {
        return count_of_private;
    }

    public void setCount_of_private(int count_of_private) {
        this.count_of_private = count_of_private;
    }

    public int getCount_of_browsers() {
        return count_of_browsers;
    }

    public void setCount_of_browsers(int count_of_browsers) {
        this.count_of_browsers = count_of_browsers;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public boolean isPost_if_visible() {
        return post_if_visible;
    }

    public void setPost_if_visible(boolean post_if_visible) {
        this.post_if_visible = post_if_visible;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", post_title='" + post_title + '\'' +
                ", create_time='" + create_time + '\'' +
                ", update_time='" + update_time + '\'' +
                ", post_text='" + post_text + '\'' +
                ", count_of_comments=" + count_of_comments +
                ", count_of_likes=" + count_of_likes +
                ", count_of_private=" + count_of_private +
                ", count_of_browsers=" + count_of_browsers +
                ", category_id='" + category_id + '\'' +
                ", author_id=" + author_id +
                ", post_if_visible=" + post_if_visible +
                '}';
    }
}

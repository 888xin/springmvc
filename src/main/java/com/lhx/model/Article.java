package com.lhx.model;

/**
 * Created by xin on 15-1-11 下午6:33
 *
 * @project springmvc
 * @package com.lhx.model
 * @Description
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @github https://github.com/888xin
 */

public class Article {

    private int id ;
    private String title ;
    private String content ;

    public Article(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Article() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

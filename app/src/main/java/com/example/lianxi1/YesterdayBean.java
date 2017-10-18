package com.example.lianxi1;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by 你瞅啥 on 2017/10/12.
 */

@Entity
public class YesterdayBean {
    @Id(autoincrement =true)
    private Long id;
    @Property(nameInDb = "name")
    private String name;
    @Property(nameInDb = "content")
    private String content;
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    @Generated(hash = 702832083)
    public YesterdayBean(Long id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }
    @Generated(hash = 1719795218)
    public YesterdayBean() {
    }
}

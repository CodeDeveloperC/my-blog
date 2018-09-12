package com.my.blog.website.dto;

import com.my.blog.website.model.Vo.MetaVo;

/**
 * Meta 元
 * 数据传输对象 Dto
 */
public class MetaDto extends MetaVo {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

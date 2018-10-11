package com.imooc.form;

import lombok.Data;

/**
 * @author youyusong
 * @date 2018/10/11
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;

}

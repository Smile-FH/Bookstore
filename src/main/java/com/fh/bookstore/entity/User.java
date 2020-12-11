package com.fh.bookstore.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author HueFu
 * @date 2020-12-11 17:16
 * @version 0.0.1
 */
@ApiModel(value="com-fh-bookstore-entity-User")
@Data
public class User {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private Integer age;
}

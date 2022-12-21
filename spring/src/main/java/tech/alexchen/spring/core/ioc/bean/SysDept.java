package tech.alexchen.spring.core.ioc.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 部门类
 *
 * @author alexchen
 */
@Component
public class SysDept implements Serializable {

    private Integer deptId;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 父级部门id
     */
    private Integer parentId;

    /**
     * 是否删除 1：已删除 0：正常
     */
    private String delFlag;
}

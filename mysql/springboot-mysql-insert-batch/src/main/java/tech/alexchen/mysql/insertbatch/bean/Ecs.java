package tech.alexchen.mysql.insertbatch.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author alexchen
 */
@Data
@TableName(value = "ecs")
public class Ecs {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer cpu;

    private Integer memory;

    private LocalDateTime createTime;

    private String createBy;

    private Long tenantId;
}

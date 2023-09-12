package tech.alexchen.mysql.index.bean;

import cn.hutool.core.net.Ipv4Util;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import sun.net.util.IPAddressUtil;

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

    public static Ecs build() {
        Ecs ecs = new Ecs();
        ecs.setName(IdUtil.fastUUID());
        int cpu = 1 << RandomUtil.randomInt(8);
        ecs.setCpu(cpu);
        ecs.setMemory(cpu * 2);
        ecs.setCreateTime(LocalDateTime.now());
        ecs.setCreateBy(RandomUtil.randomString(4));
        ecs.setTenantId(RandomUtil.randomLong(10));
        return ecs;
    }

}

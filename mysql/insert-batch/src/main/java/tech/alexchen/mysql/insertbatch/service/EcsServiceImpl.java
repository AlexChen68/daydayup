package tech.alexchen.mysql.insertbatch.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;
import tech.alexchen.mysql.insertbatch.bean.Ecs;
import tech.alexchen.mysql.insertbatch.mapper.EcsMapper;

/**
 * @author alexchen
 */
@Repository
public class EcsServiceImpl extends ServiceImpl<EcsMapper, Ecs> implements EcsService{


}

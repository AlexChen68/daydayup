package tech.alexchen.mysql.insertbatch.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tech.alexchen.mysql.insertbatch.bean.Ecs;
import tech.alexchen.mysql.insertbatch.mapper.EcsMapper;

/**
 * @author alexchen
 */
@Repository
@Transactional(rollbackFor = Exception.class)
public class EcsServiceImpl extends ServiceImpl<EcsMapper, Ecs> implements EcsService {

}

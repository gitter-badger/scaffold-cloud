package ${package_name}.service.impl;

import ${package_name}.dao.${table_name}Mapper;
import ${package_name}.domain.${table_name};
import ${package_name}.service.${table_name}Service;
import com.cms.scaffold.common.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author zhangjiaheng
*/
@Service
public class ${table_name}ServiceImpl extends BaseServiceImpl<${table_name}Mapper, ${table_name}> implements ${table_name}Service {
}

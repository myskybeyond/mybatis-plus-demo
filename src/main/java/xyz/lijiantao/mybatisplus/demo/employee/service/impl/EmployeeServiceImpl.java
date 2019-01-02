package xyz.lijiantao.mybatisplus.demo.employee.service.impl;

import xyz.lijiantao.mybatisplus.demo.employee.entity.Employee;
import xyz.lijiantao.mybatisplus.demo.employee.mapper.EmployeeMapper;
import xyz.lijiantao.mybatisplus.demo.employee.service.IEmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息表 服务实现类
 * </p>
 *
 * @author Jiantao Li
 * @since 2018-12-29
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}

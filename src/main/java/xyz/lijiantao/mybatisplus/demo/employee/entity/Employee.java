package xyz.lijiantao.mybatisplus.demo.employee.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工信息表
 * </p>
 *
 * @author Jiantao Li
 * @since 2018-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 员工名称
     */
    private String eName;

    /**
     * 员工编号
     */
    private String eId;

    /**
     * 员工手机号
     */
    private String eTel;

    /**
     * 微信唯一号
     */
    private String openid;

    /**
     * 身份证号
     */
    private String eCardid;

    /**
     * 创建者 : 创建者
     */
    private String createBy;

    /**
     * 创建时间 : 创建时间
     */
    private LocalDateTime createDate;

    /**
     * 更新者 : 更新者
     */
    private String updateBy;

    /**
     * 更新时间 : 更新时间
     */
    private LocalDateTime updateDate;

    /**
     * 备注信息 : 备注信息
     */
    private String remarks;

    /**
     * 删除标记 : 删除标记（0：正常；1：删除）
     */
    private String delFlag;


}

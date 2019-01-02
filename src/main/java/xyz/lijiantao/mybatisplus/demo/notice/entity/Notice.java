package xyz.lijiantao.mybatisplus.demo.notice.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 消息通知表
 * </p>
 *
 * @author Jiantao Li
 * @since 2019-01-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 置顶顺序
     */
    private Integer topId;

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

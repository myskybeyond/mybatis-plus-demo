package xyz.lijiantao.mybatisplus.demo.notice.service.impl;

import xyz.lijiantao.mybatisplus.demo.notice.entity.Notice;
import xyz.lijiantao.mybatisplus.demo.notice.mapper.NoticeMapper;
import xyz.lijiantao.mybatisplus.demo.notice.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 消息通知表 服务实现类
 * </p>
 *
 * @author Jiantao Li
 * @since 2019-01-02
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}

package com.zb.studio.service;

import com.ZLHW.base.service.BaseService;
import com.zb.studio.dao.DrawStudioDAO;
import com.zb.studio.dao.NewsDAO;
import com.zb.studio.model.DrawStudio;
import com.zb.studio.model.News;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-30
 * Time: 下午9:37
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class NewsService extends BaseService<NewsDAO,News, Integer> {
}

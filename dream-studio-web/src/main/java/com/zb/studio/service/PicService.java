package com.zb.studio.service;

import com.ZLHW.base.service.BaseService;
import com.zb.studio.dao.DrawStudioDAO;
import com.zb.studio.dao.PicDAO;
import com.zb.studio.model.DrawStudio;
import com.zb.studio.model.Pic;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-30
 * Time: 下午9:38
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class PicService extends BaseService<PicDAO,Pic, Integer> {
}

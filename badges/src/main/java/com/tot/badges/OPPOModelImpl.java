package com.tot.badges;

import android.app.Application;
import android.app.Notification;
import android.support.annotation.NonNull;

/**
 * 以下是oppo客服原文（其中没有说明3.3中日活量和总下载量的标准）
 * <p>
 * 亲，您可以通过邮件的形式提交申请，邮件形式如下：
 * <p>
 * 1.主题：“申请开放OPPO手机应用角标权限——（应用名称）”
 * <p>
 * 2.收件人：devtec@oppo.com
 * <p>
 * 3.正文：应用角标申请所需材料
 * 以下为应用角标申请所需材料：
 * 1.应用方申请人基本信息（姓名、邮箱、手机、微信）；
 * 2.应用方厂商介绍（不少于200字）；
 * 3.申请应用近一个月内IOS与安卓系统的平均日活量及总下载量介绍；
 * 4.申请应用产品主要功能介绍（不少于100字）；
 * 5.申请应用期望角标出现的全部场景。（即哪些类的消息需要出现角标，需全部列出）
 * <p>
 * 您这边以邮件的形式申请接入角标后，OPPO方审核人员将在接收日期10个工作日内给出审核结果。感谢您对OPPO开放平台的关注与信任，还
 * 请您耐心等待的哦~
 */
public class OPPOModelImpl implements IconBadgeNumModel {
    private static final String NOTIFICATION_ERROR = "not support : oppo";

    @Override
    public Notification setIconBadgeNum(@NonNull Application context, Notification notification, int count) throws Exception {
        if (true) {
            throw new Exception(NOTIFICATION_ERROR);
        }
        return null;
    }
}

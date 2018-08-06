package com.tot.badges;

import android.app.Application;
import android.app.Notification;
import android.support.annotation.NonNull;

/**
 * 网上查到了此段代码，但在vivo X21A[android-8.1.0/Funtouch OS_4.0]真机上并未测试成功。
 * 在vivo开发者平台上与人工客服联系后，对方回复暂时没有公开的方法可以设置，也没有渠道可以申请，只有vivo特别指定的应用可以实现（微信、微博等）
 */
public class VIVOModelImpl implements IconBadgeNumModel {
    private static final String NOTIFICATION_ERROR = "not support : vivo";

    @Override
    public Notification setIconBadgeNum(@NonNull Application context, Notification notification, int count) throws Exception {
        if (true) {
            throw new Exception(NOTIFICATION_ERROR);
        }
        return null;
    }
}

package com.tot.badges;

import android.app.Application;
import android.app.Notification;
import android.content.Intent;
import android.support.annotation.NonNull;

import static com.tot.badges.Utils.UNABLE_TO_RESOLVE_INTENT_ERROR_;

/**
 * 没有找到官方文档说明，只有网上的方法
 * <p>
 * Galaxy S8/SM-G9500/android 8.0
 * Galaxy Galaxy Note8/SM-N9500/android 8.0
 */
public class SamsungModelImpl implements IconBadgeNumModel {
    private static final String NOTIFICATION_ERROR = "not support : samsung";

    @Override
    public Notification setIconBadgeNum(@NonNull Application context, Notification notification, int count) throws Exception {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", count);
        intent.putExtra("badge_count_package_name", context.getPackageName());
        intent.putExtra("badge_count_class_name", Utils.getInstance().getLaunchIntentForPackage(context));

        if (Utils.getInstance().canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            throw new Exception(UNABLE_TO_RESOLVE_INTENT_ERROR_ + intent.toString());
        }
        return notification;
    }
}

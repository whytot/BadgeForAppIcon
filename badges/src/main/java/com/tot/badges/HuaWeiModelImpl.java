package com.tot.badges;

import android.app.Application;
import android.app.Notification;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;

/**
 * https://developer.huawei.com/consumer/cn/devservice/doc/30802
 * <p>
 * max:99
 */
public class HuaWeiModelImpl implements IconBadgeNumModel {
    @Override
    public Notification setIconBadgeNum(@NonNull Application context, Notification notification, int count) throws Exception {
        Bundle bunlde = new Bundle();
        bunlde.putString("package", context.getPackageName()); // com.test.badge is your package name
        bunlde.putString("class", Utils.getInstance().getLaunchIntentForPackage(context)); // com.test. badge.MainActivity is your apk main activity
        bunlde.putInt("badgenumber", count);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bunlde);
        return notification;
    }
}

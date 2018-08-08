package com.tot.badges;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.HashMap;
import java.util.Map;

public class LauncherHelper {
    public final static String GOOGLE = "google";
    public final static String HUAWEI = "huawei";
    public final static String MEIZU = "meizu";
    public final static String XIAOMI = "xiaomi";
    public final static String OPPO = "oppo";
    public final static String VIVO = "vivo";
    public final static String SAMSUNG = "samsung";

    private static Map<String, String> launcherMap;

    static {
        launcherMap = new HashMap<>();
        launcherMap.put("com.huawei.android.launcher", HUAWEI);
        launcherMap.put("com.miui.home", XIAOMI);
        launcherMap.put("com.sec.android.app.launcher", SAMSUNG);
        launcherMap.put("com.google.android.apps.nexuslauncher", GOOGLE);
    }

    @Nullable
    public String getLauncherTypeByName(@NonNull String launcherName) {
        return launcherMap.get(launcherName);
    }

    @Nullable
    public String getLauncherPackageName(@NonNull Context context) {
        final Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        final ResolveInfo res = context.getPackageManager().resolveActivity(intent, 0);
        if (res.activityInfo == null) {
            // should not happen. A home is always installed, isn't it?
            return null;
        }
        if (res.activityInfo.packageName.equals("android")) {
            return null;
        } else {
            return res.activityInfo.packageName;
        }
    }
}

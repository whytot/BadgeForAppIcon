package com.tot.badges;

import android.app.Application;
import android.app.Notification;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;

public class IconBadgeNumManager implements IconBadgeNumModel {
    private static final String NOT_SUPPORT_PHONE = "not support your phone [ Build.MANUFACTURER is null ]";
    private static final String NOT_SUPPORT_MANUFACTURER_ = "not support ";
    private IconBadgeNumModel currentModel;

    @Override
    public Notification setIconBadgeNum(@NonNull Application context, Notification notification, int count) throws Exception {
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            throw new Exception(NOT_SUPPORT_PHONE);
        }
        String currentManufacturer = Build.MANUFACTURER.toLowerCase();
        IconBadgeNumModel iconBadgeNumModel = getSetIconBadgeNumModel(currentManufacturer);
        if (iconBadgeNumModel == null) {
            throw new Exception(NOT_SUPPORT_MANUFACTURER_ + currentManufacturer);
        }
        return iconBadgeNumModel.setIconBadgeNum(context, notification, count);
    }

    @Nullable
    private IconBadgeNumModel getSetIconBadgeNumModel(@NonNull String currentManufacturer) {
        if (currentModel != null) {
            return currentModel;
        } else {
            switch (currentManufacturer) {
                case MobileBrand.HUAWEI:
                    currentModel = new HuaWeiModelImpl();
                    break;
                case MobileBrand.XIAOMI:
                    currentModel = new XiaoMiModelImpl();
                    break;
                case MobileBrand.VIVO:
                    currentModel = new VIVOModelImpl();
                    break;
                case MobileBrand.OPPO:
                    currentModel = new OPPOModelImpl();
                    break;
                case MobileBrand.SAMSUNG:
                    currentModel = new SamsungModelImpl();
                    break;
                case MobileBrand.MEIZU:
                    currentModel = new MeizuModelImpl();
                    break;
                case MobileBrand.GOOGLE:
                    currentModel = new GoogleModelImpl();
                    break;
            }

            return currentModel;
        }
    }
}

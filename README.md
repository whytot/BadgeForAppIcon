# BadgeForAppIcon

[![](https://jitpack.io/v/whytot/BadgeForAppIcon.svg)](https://jitpack.io/#whytot/BadgeForAppIcon)</br>

The unread badges of the android launcher icon.

### 1  Add BadgeForAppIcon to your project

#### 1.1  gradle

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.whytot:BadgeForAppIcon:v1.0.0-beta.2'
	}
	
### 2  How to use

#### 2.1  code

	new IconBadgeNumManager().setIconBadgeNum(getApplication(), notification, count);

#### 2.2  MIUI(xiaomi)
	
	* -notification cannot be null
	* -notification must be sent
	
### 3  Support List

#### 3.1 	Huawei (Support)

Launcher : com.huawei.android.launcher

https://developer.huawei.com/consumer/cn/devservice/doc/30802</br>

#### 3.2 	Xiaomi (Support *)

Launcher : com.miui.home

https://dev.mi.com/console/doc/detail?pId=939</br>
*:  Notifications must be sent simultaneously, but the Numbers can be customized.</br>
*:  When app have been open, the indicator disappears.(So when the app is in the foreground, you can't see badge)</br>
*:  Only for MIUI6-10.</br>

#### 3.3 	OPPO (Support *)

*:  Support , but need apply</br>
Please contact the customer service staff on the OPPO developer platform by yourself. He will explain how to apply for this function.</br>
<font color='red'>*:  I am currently in the application stage. If I succeed, I will update this method.</font></br>

#### 3.4 	VIVO(Not Support)

No support and no channels to apply.</br>
This feature must be specifically supported by VIVO.</br>

#### 3.5 	Samsung (Support *)

Launcher : com.sec.android.app.launcher

*:  Support, but no official statement </br>

#### 3.6 	Meizu(Not Support)

#### 3.7 	Google(Support *)

Launcher : com.google.android.apps.nexuslauncher pixel 2(Pixel Launcher)

https://developer.android.com/training/notify-user/badges</br>
*:  Support(Starting with 8.0 (API level 26)),but the number cannot be displayed on the corner mark, and you need to press the icon for a long time.</br>
*:  Color is not red.</br>

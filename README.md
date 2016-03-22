![这是预览图](https://github.com/heshiweij/CycleViewPager/blob/master/sample.png?raw=true)

## 使用方法

### 权限

```
<uses-permission  android:name="android.permission.INTERNET"/>
<uses-permission  android:name="android.permission.WRITE_EXTERNAL_STORAGE"/>
<uses-permission  android:name="android.permission.READ_EXTERNAL_STORAGE"/>
```

### 布局

```xml
<cn.ifavor.cycleviewpager.view.CycleViewPager
  android:id="@+id/cvp_main"
  android:layout_width="match_parent"
  android:layout_height="100dip" />
```

## 代码

```
cycleViewPager = (CycleViewPager) findViewById(R.id.cvp_main);

cycleViewPager.setURLMap(map);
// 设置轮播时间间隔
cycleViewPager.setDuration(3000);
// 设置红点显示位置
cycleViewPager.setIndicatorDirection(IndicatorDirection.RIGHT);
// 设置红点大小
cycleViewPager.setIndicatorPointSize(12);
// 设置是否显示标题
cycleViewPager.setShowTitle(false);
// 开启自动轮播
cycleViewPager.start();
```


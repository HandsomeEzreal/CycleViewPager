package cn.ifavor.cycleviewpager;

import java.util.LinkedHashMap;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import cn.ifavor.cycleviewpager.view.CycleViewPager;
import cn.ifavor.cycleviewpager.view.CycleViewPager.IndicatorDirection;


public class MainActivity extends Activity {

    private CycleViewPager mCycleViewPager;;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

	private void init() {
		mCycleViewPager = (CycleViewPager) findViewById(R.id.cvp_main);
		
//		Map<String, Integer> map = new TreeMap<String, Integer>();
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
//		map.put("1", R.drawable.a);
//		map.put("2", R.drawable.b);
//		map.put("3", R.drawable.c);
//		map.put("4", R.drawable.d);
//		map.put("5", R.drawable.e);
//		mCycleViewPager.setResIdMap(map);
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("我是标题 1", "http://www.2cto.com/meinv/uploads/131124/1-1311242143022C.jpg");
		map.put("我是标题 2", "http://www.2cto.com/meinv/uploads/131124/1-131124214242c7.jpg");
		map.put("我是标题 3", "http://www.2cto.com/meinv/uploads/131124/1-131124214135a6.jpg");
		map.put("我是标题 4", "http://www.2cto.com/meinv/uploads/131124/1-1311242141135E.jpg");
		map.put("我是标题 5", "http://www.2cto.com/meinv/uploads/131124/1-13112421404R17.jpg");
		mCycleViewPager.setURLMap(map);
		mCycleViewPager.setDuration(1000);
		mCycleViewPager.start();
		
//		setBottomBackgroundColor 设置底部背景颜色
//		setIndicatorRadius 设置指示器的圆角值
//		setUnSelectedColor 设置指示器未选中的颜色
//		setSelectedColor 设置指示器选中的颜色
//		setDuration 设置轮播器执行时间间隔
//		setIndicatorDirection 设置指示器显示位置
//		setIndicatorPointSize 设置指示器点的尺寸
//		setIndicatorPointMargin 设置指示器间隔距离
//		setShowTitle 设置是否显示标题
//		setTitleTextSize 设置标题字体大小
//		setTitleTextColor 设置标题字体颜色
//		setHandler 设置 handler
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mCycleViewPager != null){
			// 取消轮播定时器
			mCycleViewPager.cancel();
		}
	}
}

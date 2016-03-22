package cn.ifavor.cycleviewpager;

import java.util.LinkedHashMap;

import android.app.Activity;
import android.os.Bundle;
import cn.ifavor.cycleviewpager.view.CycleViewPager;
import cn.ifavor.cycleviewpager.view.CycleViewPager.IndicatorDirection;


public class MainActivity extends Activity {

    private CycleViewPager cycleViewPager;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

	private void init() {
		cycleViewPager = (CycleViewPager) findViewById(R.id.cvp_main);
		
		
//		Map<String, Integer> map = new TreeMap<String, Integer>();
//		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
//		map.put("1", R.drawable.a);
//		map.put("2", R.drawable.b);
//		map.put("3", R.drawable.c);
//		map.put("4", R.drawable.d);
//		map.put("5", R.drawable.e);
//		cycleViewPager.setResIdMap(map);
		
		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("1", "http://gtb.baidu.com/HttpService/get?p=dHlwZT1pbWFnZS9qcGVnJm49dmlzJnQ9YWRpbWcmYz10YjppZyZyPTgzOTUxNzY0Miw0NzM0Njk0NTkAMQA&gp=0.jpg");
		map.put("2", "http://img3.imgtn.bdimg.com/it/u=2320326258,4071616861&fm=11&gp=0.jpg");
		map.put("3", "http://img2.imgtn.bdimg.com/it/u=143502629,680691207&fm=11&gp=0.jpg");
		map.put("4", "http://img0.imgtn.bdimg.com/it/u=4002501043,3685512765&fm=11&gp=0.jpg");
		map.put("5", "http://img1.imgtn.bdimg.com/it/u=2294736753,1257721804&fm=15&gp=0.jpg");
		
		cycleViewPager.setURLMap(map);
		// 设置轮播时间间隔
		cycleViewPager.setDuration(3000);
		cycleViewPager.setIndicatorDirection(IndicatorDirection.RIGHT);
		cycleViewPager.setIndicatorPointSize(12);
		cycleViewPager.setShowTitle(false);
		// 开启自动轮播
		cycleViewPager.start();
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (cycleViewPager != null){
			cycleViewPager.cancel();
		}
	}
}

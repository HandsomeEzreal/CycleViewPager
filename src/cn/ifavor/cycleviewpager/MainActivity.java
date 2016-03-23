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
		map.put("���Ǳ��� 1", "http://www.2cto.com/meinv/uploads/131124/1-1311242143022C.jpg");
		map.put("���Ǳ��� 2", "http://www.2cto.com/meinv/uploads/131124/1-131124214242c7.jpg");
		map.put("���Ǳ��� 3", "http://www.2cto.com/meinv/uploads/131124/1-131124214135a6.jpg");
		map.put("���Ǳ��� 4", "http://www.2cto.com/meinv/uploads/131124/1-1311242141135E.jpg");
		map.put("���Ǳ��� 5", "http://www.2cto.com/meinv/uploads/131124/1-13112421404R17.jpg");
		mCycleViewPager.setURLMap(map);
		mCycleViewPager.setDuration(1000);
		mCycleViewPager.start();
		
//		setBottomBackgroundColor ���õײ�������ɫ
//		setIndicatorRadius ����ָʾ����Բ��ֵ
//		setUnSelectedColor ����ָʾ��δѡ�е���ɫ
//		setSelectedColor ����ָʾ��ѡ�е���ɫ
//		setDuration �����ֲ���ִ��ʱ����
//		setIndicatorDirection ����ָʾ����ʾλ��
//		setIndicatorPointSize ����ָʾ����ĳߴ�
//		setIndicatorPointMargin ����ָʾ���������
//		setShowTitle �����Ƿ���ʾ����
//		setTitleTextSize ���ñ��������С
//		setTitleTextColor ���ñ���������ɫ
//		setHandler ���� handler
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		if (mCycleViewPager != null){
			// ȡ���ֲ���ʱ��
			mCycleViewPager.cancel();
		}
	}
}

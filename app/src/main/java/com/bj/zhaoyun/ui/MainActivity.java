package com.bj.zhaoyun.ui;


import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bj.qrcodelibrary.CaptureActivity;
import com.bj.zhaoyun.BaseActivity;
import com.bj.zhaoyun.adapter.MyRecyclerAdapter;
import com.bj.zhaoyun.R;
import com.bj.zhaoyun.util.ReyclerViewUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends BaseActivity {
    @BindView(R.id.rv_container)
    RecyclerView rv_container;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
        ReyclerViewUtil.setLinearLayoutManager(rv_container, mContext, LinearLayoutManager.VERTICAL);
        List<String> mDatas = new ArrayList<>();
        mDatas.add("字符侧滑栏");
        mDatas.add("遥控器小布局");
        mDatas.add("扇形图");
        mDatas.add("折线图");
        mDatas.add("图片手势识别");
        mDatas.add("计算器");
        mDatas.add("QRCode");
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(mDatas, mContext);
        rv_container.setAdapter(adapter);
        adapter.setItemClickListener(new MyRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                switch (position) {
                    case 0:
                        startActivity(new Intent(mContext, SlideLetterActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(mContext, TelecontrollerActivity.class));
                        break;
                    case 2:
                        startActivity(new Intent(mContext, PieChartActivity.class));
                        break;
                    case 3:
                        startActivity(new Intent(mContext, LineChartActivity.class));
                        break;
                    case 4:
                        startActivity(new Intent(mContext, GestureImageActivity.class));
                        break;
                    case 5:
                        startActivity(new Intent(mContext, CalculatorActivity.class));
                        break;
                    case 6:
                        startActivity(new Intent(mContext, CaptureActivity.class));
                        break;
                    default:
                        break;
                }
            }
        });
    }
}

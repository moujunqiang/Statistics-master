package experment.zju.statistics;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HistoryTodayActivity extends AppCompatActivity {
    /**
     * 历史上的今天
     */
    private RecyclerView mRvHistory;
    private HistoryAdapter adapter;
    private List<HistoryDaysBean.ResultBean> historyBeans = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_today);
        initView();
    }

    private void initView() {
        mRvHistory = (RecyclerView) findViewById(R.id.rv_history);
        findViewById(R.id.iv_back).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mRvHistory.setLayoutManager(new LinearLayoutManager(this));
        adapter = new HistoryAdapter();
        adapter.setHistoryDaysBeans(historyBeans);
        mRvHistory.setAdapter(adapter);
        getData();
    }

    public void getData() {
        Calendar instance = Calendar.getInstance();
        String date =( instance.get(Calendar.MONTH)+1) + "/" + instance.get(Calendar.DAY_OF_MONTH);
        String url = "http://v.juhe.cn/todayOnhistory/queryEvent.php?date=" + date + "&key=bf6360c9e4616ac8587de727d3e48015";
        OkHttpClient okHttpClient = new OkHttpClient();
        final Request request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                Gson gson = new Gson();
                HistoryDaysBean historyDaysBean = gson.fromJson(response.body().string(), HistoryDaysBean.class);
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (historyDaysBean!=null&&historyDaysBean.getResult()!=null){
                            historyBeans.clear();
                            historyBeans.addAll(historyDaysBean.getResult());
                            adapter.setHistoryDaysBeans(historyBeans);
                            adapter.notifyDataSetChanged();
                        }
                        }

                });
            }
        });
    }
}
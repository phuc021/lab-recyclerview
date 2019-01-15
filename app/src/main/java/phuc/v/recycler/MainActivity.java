package phuc.v.recycler;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    RecyclerViewAdapter mRcvAdapter;
    List<String> data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        data = new ArrayList<>();
        data.add("Hoàng Minh Lợi");
        data.add("Nguyễn Duy Bảo");
        data.add("Nguyễn Ngọc Doanh");
        data.add("Nguyễn Phạm Thế Hà");
        data.add("Trần Anh Đức");
        data.add("Trần Minh Hải");
        mRcvAdapter = new RecyclerViewAdapter(this,data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRcvAdapter);

    }
}
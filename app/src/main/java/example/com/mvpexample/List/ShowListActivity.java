package example.com.mvpexample.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import example.com.mvpexample.R;

/**
 * Created by Chirag Chaudhari on 15,September,2017
 */
public class ShowListActivity extends Activity implements ShowListView {

    @BindView(R.id.recyeview)
    RecyclerView mRecyclview;

    ShowListAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showlist);
        ButterKnife.bind(this);
        ShowListPresenter  mShowListPresenter = new ShowListPresenterImpl(this);

        initRecyclerView();
        mShowListPresenter.loadData();
    }

    private void initRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclview.setLayoutManager(linearLayoutManager);
        adapter = new ShowListAdapter();
        mRecyclview.setAdapter(adapter);

    }

    @Override
    public void showWeathers(List<Movie> moviesList) {
        adapter.setListAdapter(moviesList);
    }
}

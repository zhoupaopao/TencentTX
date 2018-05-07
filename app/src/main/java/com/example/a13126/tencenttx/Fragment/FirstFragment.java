package com.example.a13126.tencenttx.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a13126.tencenttx.R;

/**
 * Created by 13126 on 2018/5/7.
 */

public class FirstFragment extends Fragment {
    private static final String EXTRA_CONTENT = "content";
    public static  FirstFragment newInstance(String content){
        Bundle arg=new Bundle();
        arg.putString(EXTRA_CONTENT,content);
        FirstFragment firstFragment=new FirstFragment();
        firstFragment.setArguments(arg);
        return firstFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView=inflater.inflate(R.layout.fragment_first,null);
        ((TextView)contentView.findViewById(R.id.tv_content)).setText(getArguments().getString(EXTRA_CONTENT));
        return contentView;

    }
}

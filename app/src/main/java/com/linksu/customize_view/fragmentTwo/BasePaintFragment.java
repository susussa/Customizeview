package com.linksu.customize_view.fragmentTwo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.linksu.customize_view.R;

/**
 * ================================================
 * 作    者：linksus
 * 版    本：1.0
 * 创建日期：8/21 0021
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class BasePaintFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_basepaint, container, false);
        return inflate;
    }
}

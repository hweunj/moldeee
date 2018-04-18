package com.limefriends.molde.menu_mypage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.alexzh.circleimageview.CircleImageView;
import com.limefriends.molde.R;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MoldeMyPageFragment2 extends Fragment {

    @BindView(R.id.fragment_2_setting) ImageView fragment_2_setting;
    @BindView(R.id.my_image)    CircleImageView my_image;
    @BindView(R.id.myReportB) ImageView myReportB;
    @BindView(R.id.myCommentB) ImageView myCommentB;
    @BindView(R.id.myScrapB) ImageView myScrapB;
    @BindView(R.id.fragment_ask) TextView fragment_ask;
    @BindView(R.id.login_out) TextView login_out;


    public static MoldeMyPageFragment2 newInstance() {
        MoldeMyPageFragment2 fragment = new MoldeMyPageFragment2();

        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view =  inflater.inflate(R.layout.fragment_molde_my_page_fragment2, container, false);
        ButterKnife.bind(this, view);


        //설정
        fragment_2_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), settings.class);
                startActivity(intent);
            }
        });

       //프로필사진(앨범, 카메라)
//        settingB.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity().getBaseContext(), camera_app.class);
//                startActivity(intent);
//            }
//        });




        //내 신고 내역
        myReportB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), my_report.class);
                startActivity(intent);
            }
        });

        //내 댓글
        myCommentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), my_comment.class);
                startActivity(intent);
            }
        });

        //스크랩
        myScrapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), my_scrap.class);
                startActivity(intent);
            }
        });

        //문의하기
        fragment_ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), inquiry.class);
                startActivity(intent);
            }
        });

        /*
        //로그인/로그아웃
        login_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getBaseContext(), my_favorite.class);
                startActivity(intent);
            }
        });
*/

        return view;
    }
}

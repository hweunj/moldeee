package com.limefriends.molde.menu_mypage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.limefriends.molde.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class settings extends AppCompatActivity  implements View.OnClickListener {

    @BindView(R.id.toolbar) android.support.v7.widget.Toolbar toolbar;
    @BindView(R.id.toolbar_title) TextView toolbar_title;
    @BindView(R.id.toolbarBackBtn) ImageView toolbarBackBtn;

    @BindView(R.id.madeBy) TextView madeBy;
    @BindView(R.id.madeBy_Answer) TextView madeBy_Answer;
    @BindView(R.id.terms) TextView terms;
    @BindView(R.id.terms_Answer) TextView terms_Answer;
    @BindView(R.id.license) TextView license;
    @BindView(R.id.license_Answer) TextView license_Answer;

    @BindView(R.id.map_push_btn) ImageView map_push_btn;
    @BindView(R.id.favorite_push_btn) ImageView favorite_push_btn;

    int i = 0;
    int j =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage_settings);

        ButterKnife.bind(this);

        toolbar_title.setText("설정");

        toolbarBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.madeBy).setOnClickListener(this);
        findViewById(R.id.terms).setOnClickListener(this);
        findViewById(R.id.license).setOnClickListener(this);

        map_push_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i = 1 - i;
                if ( i == 0 ){
                    map_push_btn.setImageResource(R.drawable.switch_off);
                }
                else{
                    map_push_btn.setImageResource(R.drawable.switch_on_copy);
                }
            }
        });

        favorite_push_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                j = 1 - j;
                if ( j == 0 ){
                    favorite_push_btn.setImageResource(R.drawable.switch_off);
                }
                else{
                    favorite_push_btn.setImageResource(R.drawable.switch_on_copy);
                }
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.madeBy:
                madeBy_Answer.setVisibility(View.VISIBLE);
                terms_Answer.setVisibility(View.GONE);
                license_Answer.setVisibility(View.GONE);
                break;

            case R.id.terms:
                madeBy_Answer.setVisibility(View.GONE);
                terms_Answer.setVisibility(View.VISIBLE);
                license_Answer.setVisibility(View.GONE);
                break;

            case R.id.license:
                madeBy_Answer.setVisibility(View.GONE);
                terms_Answer.setVisibility(View.GONE);
                license_Answer.setVisibility(View.VISIBLE);
                break;


        }
    }
}

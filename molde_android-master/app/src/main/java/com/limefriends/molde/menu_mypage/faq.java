package com.limefriends.molde.menu_mypage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.limefriends.molde.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class faq extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.faq1) TextView faq1;
    @BindView(R.id.faq2) TextView faq2;
    @BindView(R.id.faq3) TextView faq3;
    @BindView(R.id.faq4) TextView faq4;
    @BindView(R.id.faq5) TextView faq5;
    @BindView(R.id.answer1) TextView answer1;
    @BindView(R.id.answer2) TextView answer2;
    @BindView(R.id.answer3) TextView answer3;
    @BindView(R.id.answer4) TextView answer4;
    @BindView(R.id.answer5) TextView answer5;
    @BindView(R.id.toolbar) android.support.v7.widget.Toolbar toolbar;
    @BindView(R.id.toolbar_title) TextView toolbar_title;
    @BindView(R.id.toolbarBackBtn) ImageView toolbarBackBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        ButterKnife.bind(this);

        toolbarBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        toolbar_title.setText("FAQ");

        findViewById(R.id.faq1).setOnClickListener(this);
        findViewById(R.id.faq2).setOnClickListener(this);
        findViewById(R.id.faq3).setOnClickListener(this);
        findViewById(R.id.faq4).setOnClickListener(this);
        findViewById(R.id.faq5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.faq1:
                answer1.setVisibility(View.VISIBLE);
                answer2.setVisibility(View.GONE);
                answer3.setVisibility(View.GONE);
                answer4.setVisibility(View.GONE);
                answer5.setVisibility(View.GONE);
                break;

            case R.id.faq2:
                answer1.setVisibility(View.GONE);
                answer2.setVisibility(View.VISIBLE);
                answer3.setVisibility(View.GONE);
                answer4.setVisibility(View.GONE);
                answer5.setVisibility(View.GONE);
                break;

            case R.id.faq3:
                answer1.setVisibility(View.GONE);
                answer2.setVisibility(View.GONE);
                answer3.setVisibility(View.VISIBLE);
                answer4.setVisibility(View.GONE);
                answer5.setVisibility(View.GONE);
                break;

            case R.id.faq4:
                answer1.setVisibility(View.GONE);
                answer2.setVisibility(View.GONE);
                answer3.setVisibility(View.GONE);
                answer4.setVisibility(View.VISIBLE);
                answer5.setVisibility(View.GONE);
                break;

            case R.id.faq5:
                answer1.setVisibility(View.GONE);
                answer2.setVisibility(View.GONE);
                answer3.setVisibility(View.GONE);
                answer4.setVisibility(View.GONE);
                answer5.setVisibility(View.VISIBLE);
                break;

        }
    }
}

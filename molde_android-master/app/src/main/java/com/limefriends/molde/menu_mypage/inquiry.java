package com.limefriends.molde.menu_mypage;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.limefriends.molde.R;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;

public class inquiry extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.faqB) Button faqB;
    @BindView(R.id.toolbar) android.support.v7.widget.Toolbar toolbar;
    @BindView(R.id.toolbar_title) TextView toolbar_title;
    @BindView(R.id.toolbarBackBtn) ImageView toolbarBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inquiry);

        ButterKnife.bind(this);

        faqB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), faq.class);
                startActivity(intent);
            }
        });


        toolbarBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        findViewById(R.id.emailSelect).setOnClickListener(this);
        findViewById(R.id.emailEnter).setOnClickListener(this);

        toolbar_title.setText("문의하기");
    }

    PopupMenu.OnMenuItemClickListener listener = new PopupMenu.OnMenuItemClickListener() {

        @Override
        public boolean onMenuItemClick(MenuItem item) {

            switch (item.getItemId()) {
                case R.id.naver:
                    Toast.makeText(inquiry.this, "Naver", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.hanmail:
                    Toast.makeText(inquiry.this, "Hanmail", Toast.LENGTH_SHORT).show();
                    break;

                case R.id.gmail:
                    Toast.makeText(inquiry.this, "Gmail", Toast.LENGTH_SHORT).show();
                    break;
            }

            return false;
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.emailSelect:
                PopupMenu popup = new PopupMenu(this, v);
                getMenuInflater().inflate(R.menu.emailmenu, popup.getMenu());
                popup.setOnMenuItemClickListener(listener);
                popup.show();//Popup Menu 보이기
                break;

            case R.id.emailEnter:
                Toast.makeText(inquiry.this, "전송되었습니다", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}


//android.support.v7.widget.Toolbar

// app:popupTheme="@style/ThemeOverlay.AppCompat.Light"
//app:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar"
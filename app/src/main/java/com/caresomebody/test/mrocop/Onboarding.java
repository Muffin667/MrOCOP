package com.caresomebody.test.mrocop;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class Onboarding extends AppCompatActivity {

    private ViewPager screenPager;
    OnboardViewPagerAdapter onboardViewPagerAdapter;
    Button masuk;
    TabLayout Indikator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        masuk= (Button) findViewById(R.id.masuk);
        Indikator= findViewById(R.id.indikator);

        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent masuk= new Intent(Onboarding.this,Home.class);
                startActivity(masuk);
            }
        });


        List<OnboardItem> mList= new ArrayList<>();
        mList.add(new OnboardItem("welkam","uwu bat ga?",R.drawable.uwu));
        mList.add(new OnboardItem("Aktor Pertanian","aku gatau mau nulis apa",R.drawable.farmer2));
        mList.add(new OnboardItem("Investor","aku gatau mau nulis apa",R.drawable.business));
        mList.add(new OnboardItem("Supplier","aku gatau mau nulis apa",R.drawable.inventory));

        screenPager = findViewById(R.id.viewPager);
        onboardViewPagerAdapter = new OnboardViewPagerAdapter(this,mList);
        screenPager.setAdapter(onboardViewPagerAdapter);
        Indikator.setupWithViewPager(screenPager);
    }
}

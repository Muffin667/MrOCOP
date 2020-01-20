package com.caresomebody.test.mrocop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class OnboardViewPagerAdapter extends PagerAdapter {
    Context mContext;
    List<OnboardItem> mListonboard;

    public OnboardViewPagerAdapter(Context mContext, List<OnboardItem> mListonboard) {
        this.mContext = mContext;
        this.mListonboard = mListonboard;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layoutOnboard= inflater.inflate(R.layout.onboard_screen, null);
        // = (ViewPager) layoutOnboard.findViewById(R.id.viewPager);

        ImageView imgSlide = layoutOnboard.findViewById(R.id.foto_onboard);
        TextView judul = layoutOnboard.findViewById(R.id.judul_onboard);
        TextView deskripsi= layoutOnboard.findViewById(R.id.isi_onboard);

        judul.setText(mListonboard.get(position).getJudul());
        deskripsi.setText(mListonboard.get(position).getDeskripsi());
        imgSlide.setImageResource(mListonboard.get(position).getOnboardImage());

        container.addView(layoutOnboard);
        return layoutOnboard;
    }

    @Override
    public int getCount() {
        return mListonboard.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }
}

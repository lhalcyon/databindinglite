package com.example.lite;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.lite.databinding.ActivityImageViewUsageBinding;
import com.example.lite.event.ChangeEvent;
import com.example.lite.model.User;

public class ImageViewUsageActivity extends AppCompatActivity {

    public static final String res[] = new String[]{
            "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=7&spn=0&di=208062058380&pi=0&rn=1&tn=baiduimagedetail&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=819201812%2C3553302270&os=4058329962%2C3718712582&simid=3386491690%2C470645892&adpicid=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fm2.quanjing.com%2F2m%2Falamyrf005%2Fb1fw89.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bq7wg3tg2_z%26e3Bv54AzdH3Ffiw6jAzdH3Fk8uobl_z%26e3Bip4s&gsm=0",
            "http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&hs=0&pn=1&spn=0&di=71007564430&pi=0&rn=1&tn=baiduimagedetail&ie=utf-8&oe=utf-8&cl=2&lm=-1&cs=4155302816%2C1201715785&os=159233822%2C272436753&simid=3235028088%2C3077875656&adpicid=0&ln=30&fr=ala&fm=&sme=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic33.nipic.com%2F20130916%2F3420027_192919547000_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Fzi7wgptAzdH3Fb80b88_8l_z%26e3Bip4s&gsm=0"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityImageViewUsageBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_image_view_usage);
        User user = new User("Arthas", res[0]);
        ChangeEvent event = new ChangeEvent(user);
        binding.setUser(user);
        binding.setEvent(event);

    }
}

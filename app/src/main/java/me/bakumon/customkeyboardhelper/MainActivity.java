package me.bakumon.customkeyboardhelper;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.bakumon.customkeyboardhelper.databinding.ActivityMainBinding;
import me.bakumon.customkeyboardhelper.utils.CustomKeyboardHelper;

/**
 * demo 主页
 *
 * @author 马飞
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    private void init() {
        // 传入 EditText
        CustomKeyboardHelper.with(getWindow(), binding.editText)
                // 设置所有可输入按钮控件
                .setInputTextViews(binding.numKeyboard.keyboardSevenTextview, binding.numKeyboard.keyboardEightTextview, binding.numKeyboard.keyboardNineTextview
                        , binding.numKeyboard.keyboardFourTextview, binding.numKeyboard.keyboardFiveTextview, binding.numKeyboard.keyboardSixTextview
                        , binding.numKeyboard.keyboardOneTextview, binding.numKeyboard.keyboardTwoTextview, binding.numKeyboard.keyboardThreeTextview
                        , binding.numKeyboard.keyboardDotTextview, binding.numKeyboard.keyboardZeroTextview)
                // 设置删除按钮
                .setDeleteView(binding.numKeyboard.keyboardDeleteTextview);
    }
}

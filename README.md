# CustomKeyboardHelper

自定义键盘帮助类：

支持中间选中删除和输入

## 用法：

```java
// 传入 EditText
CustomKeyboardHelper.with(getWindow(), binding.editText)
    // 设置所有可输入按钮控件
    .setInputTextViews(binding.numKeyboard.keyboardSevenTextview, binding.numKeyboard.keyboardEightTextview, binding.numKeyboard.keyboardNineTextview
        , binding.numKeyboard.keyboardFourTextview, binding.numKeyboard.keyboardFiveTextview, binding.numKeyboard.keyboardSixTextview
        , binding.numKeyboard.keyboardOneTextview, binding.numKeyboard.keyboardTwoTextview, binding.numKeyboard.keyboardThreeTextview
        , binding.numKeyboard.keyboardDotTextview, binding.numKeyboard.keyboardZeroTextview)
    // 设置删除按钮
    .setDeleteView(binding.numKeyboard.keyboardDeleteTextview);
```
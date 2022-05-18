package com.harmony.alliance.jnidemo.slice;

import com.harmony.alliance.jnidemo.JNITools;
import com.harmony.alliance.jnidemo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.PositionLayout;
import ohos.agp.components.Text;
import ohos.agp.utils.Color;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.components.ComponentContainer.LayoutConfig;
import ohos.global.resource.RawFileEntry;
import ohos.global.resource.Resource;

public class MainAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        setUIContent(ResourceTable.Layout_ability_main);
        Text text= (Text) findComponentById(ResourceTable.Id_result);
        text.setText(JNITools.addNumber(40,25)+"");
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}

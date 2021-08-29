package com.waylau.hmos.pageandabilityslicelifecycle.slice;

import com.waylau.hmos.pageandabilityslicelifecycle.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Text;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class MainAbilitySlice extends AbilitySlice {
    private static final String TAG = MainAbilitySlice.class.getSimpleName();
    private static final HiLogLabel LABEL_LOG =
            new HiLogLabel(HiLog.LOG_APP, 0x00001, TAG);

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);

        // UI界面内容引用了布局文件ability_main.xml
        super.setUIContent(ResourceTable.Layout_ability_main);

        // 添加点击事件来触发导航到PayAbilitySlice
        Text text = (Text) findComponentById(ResourceTable.Id_text_helloworld);
        text.setClickedListener(listener ->
                present(new PayAbilitySlice(), new Intent()));

        HiLog.info(LABEL_LOG, "onStart");
    }

    @Override
    public void onActive() {
        super.onActive();
        HiLog.info(LABEL_LOG, "onActive");
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
        HiLog.info(LABEL_LOG, "onForeground");
    }

    @Override
    public  void onInactive() {
        HiLog.info(LABEL_LOG, "onInactive");
    }

    @Override
    public  void onBackground() {
        HiLog.info(LABEL_LOG, "onBackground");
    }

    @Override
    public  void onStop() {
        HiLog.info(LABEL_LOG, "onStop");
    }
}

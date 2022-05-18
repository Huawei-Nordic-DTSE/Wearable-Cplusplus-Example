package com.harmony.alliance.jnidemo.slice;

import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

public class HiLogUtils {
    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.LOG_APP, 0, "#######");
    public static void  PrintLog(String content){
        HiLog.error(LABEL, content);
    }
}

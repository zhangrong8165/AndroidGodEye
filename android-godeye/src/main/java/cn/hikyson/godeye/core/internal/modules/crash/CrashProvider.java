package cn.hikyson.godeye.core.internal.modules.crash;

import java.util.List;

/**
 * Created by kysonchao on 2017/12/18.
 */
public interface CrashProvider {
    void storeCrash(CrashInfo crashInfo) throws Throwable;

    List<CrashInfo> restoreCrash() throws Throwable;
}

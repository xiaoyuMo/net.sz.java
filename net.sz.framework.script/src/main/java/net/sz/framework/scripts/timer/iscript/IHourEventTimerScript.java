package net.sz.framework.scripts.timer.iscript;

import net.sz.framework.scripts.IBaseScript;

/**
 * 每小时执行
 * <br>
 * author 失足程序员<br>
 * blog http://www.cnblogs.com/ty408/<br>
 * mail 492794628@qq.com<br>
 * phone 13882122019<br>
 */
public interface IHourEventTimerScript extends IBaseScript {

    void run(int hour);
}

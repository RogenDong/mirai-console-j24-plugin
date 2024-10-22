package top.jie65535.j24

import net.mamoe.mirai.console.data.AutoSavePluginConfig
import net.mamoe.mirai.console.data.value

object PluginConfig : AutoSavePluginConfig("config") {
    val enabledGroups: MutableSet<Long> by value()

    /** 安静模式 */
    val quietGroups: MutableSet<Long> by value()
}
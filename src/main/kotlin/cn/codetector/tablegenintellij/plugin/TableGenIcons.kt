package cn.codetector.tablegenintellij.plugin

import javax.swing.Icon
import javax.swing.ImageIcon

class TableGenIcons {
    companion object {
        @JvmField
        val FILEICON: Icon = ImageIcon(TableGenIcons::class.java.getResource("/cn/codetector/tablegenintellij/icons/llvm16.png"))
    }
}

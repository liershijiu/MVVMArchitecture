package com.imyyq.mvvm.base

import com.imyyq.mvvm.R

/**
 * 对话框接口
 */
interface IDialog {
    fun showDialog(msg: String?)

    fun dismissDialog()

    fun dialogLayout() = R.layout.dlg_loading

    /**
     * 页面在显示数据时需要时间，因此显示对话框，如果不需要，可以设置为 false，以免创建不必要的对象
     */
    fun isNeedDialog() = true
}
package com.mxsl.sophon.registry

import java.net.URL

/**
 * Created by gengrong on 01/12/2016.
 */
interface Registry {

    var address: URL

    fun register(url: URL)

    fun unregister(url: URL)

    fun subscribe(listener: NotifyListener)

    fun unsubscribe(listener: NotifyListener)

}
package com.mxsl.sophon.registry.consul

import com.mxsl.sophon.registry.NotifyListener
import com.mxsl.sophon.registry.Registry
import java.net.URL

/**
 * Created by gengrong on 01/12/2016.
 */
class ConsulRegistry : Registry {
    override var address: URL
        get() = throw UnsupportedOperationException()
        set(value) {
        }

    override fun register(url: URL) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unregister(url: URL) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun subscribe(listener: NotifyListener) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsubscribe(listener: NotifyListener) {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
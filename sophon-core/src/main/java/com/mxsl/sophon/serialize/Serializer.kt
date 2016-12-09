package com.mxsl.sophon.serialize

/**
 * Created by gengrong on 01/12/2016.
 */
interface Serializer {

    fun serialize(obj: Any): String

    fun serialize(obj: Any, type: Class<Any>): String

    fun <T> deserialize(string: String, type: Class<T>): T
}
package com.mxsl.sophon.serialize.gson

import com.google.gson.Gson
import com.mxsl.sophon.serialize.Serializer

/**
 * Created by gengrong on 01/12/2016.
 */
class GsonSerializer : Serializer {

    private val gson = Gson()

    override fun serialize(obj: Any) = gson.toJson(obj)!!

    override fun serialize(obj: Any, type: Class<Any>) = gson.toJson(obj, type)!!

    override fun <T> deserialize(string: String, type: Class<T>) = gson.fromJson(string, type)!!

}
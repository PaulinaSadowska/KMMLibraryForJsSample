package org.jetbrains.base64

import kotlin.js.JsExport

interface Base64Encoder {
    fun encode(src: ByteArray): ByteArray
}

expect object Base64Factory {
    fun createEncoder(): Base64Encoder
}

interface Greeter {
    fun sayHelloFromKMM(): String
}

@JsExport
fun sayHello() = "Hello from the KMM side! (func)"

object HelloWorld : Greeter {
    override fun sayHelloFromKMM() = "Hello from the KMM side!"
}
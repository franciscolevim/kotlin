interface A {
    fun foo(): String
}

class B : A {
    override fun foo() = "OK"
}

fun box() = B().(A::foo)()

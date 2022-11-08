package brincandoInterfacePOO.ChangeColor

class Red() : SwitchColor {
    override fun colorSelect(): String {
        return "#FF0000"
    }
}

class Green() : SwitchColor {
    override fun colorSelect(): String {
        return "#008000"
    }
}

class Blue() : SwitchColor {
    override fun colorSelect(): String {
        return "#0000FF"
    }
}

class OtherColor(private val colorHx: String, private val nameColor: String) : SwitchColor {
    override fun colorSelect(): String {
        println("Cor: $nameColor")
        return colorHx
    }
}

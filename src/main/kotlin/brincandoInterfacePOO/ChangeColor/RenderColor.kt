package brincandoInterfacePOO.ChangeColor

class RenderColor(selColor: SwitchColor) {

    private val selectColor = selColor

    fun pictureScreen(){
        val color = selectColor.colorSelect()
        println(color)
    }



}
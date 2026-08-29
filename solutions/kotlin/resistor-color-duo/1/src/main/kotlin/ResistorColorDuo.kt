object ResistorColorDuo {
    fun value(vararg colors: Color) = require(colors.size >= 2).run { colors[0].ordinal*10 + colors[1].ordinal }
}
package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        val res = mutableListOf<Any>()
        for (new in blockA) {
            if (new!!::class == blockB) {
                res.add(new)
            }
        }
        return when (blockB) {
            Int::class -> res.sumBy { it as Int }
            String::class -> res.joinToString("")
            LocalDate::class -> res.map { it as LocalDate }
                .reduce { x, y -> if (x.isAfter(y)) x else y }.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            else -> ""
        }
    }
}

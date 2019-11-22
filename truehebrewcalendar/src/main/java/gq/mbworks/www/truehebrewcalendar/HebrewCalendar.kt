package gq.mbworks.www.truehebrewcalendar

import java.util.*
import kotlin.math.abs

class HebrewCalendar private constructor(
    val luazitTimeInMills: Long?,
    val luazitDate: Date?
){

    private var year: Long? = null

    data class Builder(
        var luazitTimeInMills: Long? =null,
        var luazitDate: Date? = null
    ){
        fun build() = HebrewCalendar(luazitTimeInMills, luazitDate)
    }

    fun getHebreDateString(): Long{
        year = luazitTimeInMills?.div((24*60*60*1000*7))?.let { result -> abs(result) }
        year?.let { return (5000+ it - 1240) }
        return 0
    }

}
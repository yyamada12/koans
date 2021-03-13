data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    operator override fun compareTo(other: MyDate): Int =
        if (this.year != other.year) {
            this.year - other.year
        } else if (this.month != other.month) {
            this.month - other.month
        } else {
            this.dayOfMonth - other.dayOfMonth
        }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}

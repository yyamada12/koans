class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var date = start
            override fun hasNext(): Boolean {
                return date <= end
            }
            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()
                val res = date
                date = date.followingDate()
                return res
            }
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for ((i, product) in products.withIndex()) {
                tr{
                    td(getCellColor(0,i)) {
                        text(product.description)
                    }
                    td(getCellColor(1,i)) {
                        text(product.price)
                    }
                    td(getCellColor(2,i)) {
                        text(product.popularity)
                    }
                }
            }
        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"

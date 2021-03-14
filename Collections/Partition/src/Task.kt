// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> = customers.filter  {
        val (deliverd, undeliverd) = it.orders.partition { it.isDelivered }
        deliverd.size < undeliverd.size
    }
 .toSet()

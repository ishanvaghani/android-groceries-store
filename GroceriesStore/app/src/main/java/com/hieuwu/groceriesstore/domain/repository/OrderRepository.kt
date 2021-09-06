package com.hieuwu.groceriesstore.domain.repository

import androidx.lifecycle.LiveData
import com.hieuwu.groceriesstore.data.utils.OrderStatus
import com.hieuwu.groceriesstore.domain.entities.LineItem
import com.hieuwu.groceriesstore.domain.entities.Order
import com.hieuwu.groceriesstore.domain.entities.OrderWithLineItems
import com.hieuwu.groceriesstore.domain.entities.ProductAndLineItem
import kotlinx.coroutines.flow.Flow

interface OrderRepository {
    fun hasCart(): Flow<Boolean>?
    suspend fun insert(order: Order)
    suspend fun addLineItem(lineItem: LineItem)
    fun getOrderById(id: String): Flow<OrderWithLineItems>
    fun getOrderInCart(status: OrderStatus): Order
    fun getOrderWithLineItems(): List<OrderWithLineItems>
    fun getCurrentCartId(status: OrderStatus): LiveData<String>
}
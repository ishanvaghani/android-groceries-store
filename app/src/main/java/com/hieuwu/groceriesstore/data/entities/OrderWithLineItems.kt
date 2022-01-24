package com.hieuwu.groceriesstore.data.entities

import androidx.room.Embedded
import androidx.room.Relation

data class OrderWithLineItems(
    @Embedded var order: Order,
    @Relation(
        parentColumn = "orderId",
        entityColumn = "orderId",
        entity = LineItem::class
    )
    val lineItemList: MutableList<ProductAndLineItem>
)
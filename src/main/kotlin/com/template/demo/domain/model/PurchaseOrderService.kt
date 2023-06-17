package com.template.demo.domain.model

import com.template.demo.infrastructure.persistence.purchaseorder.PurchaseOrder

interface PurchaseOrderService {

    fun insert(purchaseOrder: PurchaseOrder): Long

    fun findById(id: Long): PurchaseOrder
}
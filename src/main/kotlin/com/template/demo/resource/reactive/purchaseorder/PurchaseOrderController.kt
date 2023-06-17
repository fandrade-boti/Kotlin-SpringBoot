package com.template.demo.resource.reactive.purchaseorder

import com.template.demo.domain.model.PurchaseOrderService
import com.template.demo.infrastructure.persistence.purchaseorder.PurchaseOrder
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.*

@Validated
@RestController
@RequestMapping("/purchase-orders")
class PurchaseOrderController(
    private val purchaseOrderService: PurchaseOrderService
) {
    @GetMapping("/{id}")
    fun getOrder(@PathVariable id: Long): ResponseEntity<PurchaseOrder> {
        return ResponseEntity.ok(purchaseOrderService.findById(id))
    }

    @PostMapping
    fun insertOrder(@RequestBody purchaseOrder: PurchaseOrder): Long {
        return purchaseOrderService.insert(purchaseOrder)
    }
}
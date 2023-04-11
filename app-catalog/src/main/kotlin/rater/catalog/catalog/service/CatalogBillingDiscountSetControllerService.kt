package rater.catalog.catalog.service

import rater.catalog.catalog.domain.CatalogBillingDiscountSet
import java.util.UUID
import rater.catalog.catalog.repository.CatalogBillingDiscountSetControllerRepository
import rater.catalog.service.AbstractService
import org.springframework.stereotype.Service

@javax.annotation.Generated(value = ["org.openapitools.codegen.CodeCodegen"])

@Service
class CatalogBillingDiscountSetControllerService(
    repository: CatalogBillingDiscountSetControllerRepository
) : AbstractService<CatalogBillingDiscountSet, CatalogBillingDiscountSetControllerRepository>(repository)

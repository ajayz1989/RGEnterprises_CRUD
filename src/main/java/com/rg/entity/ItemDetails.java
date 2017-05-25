package com.rg.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Item_Details")
public class ItemDetails {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long itemId;
	private int containerNo;
	private String kindOfPackaging;
	private String descOfGood;
	private int quantity;
	private Double pricePerUnit;
	private Double taxInclusive;
	private Double totalAmount;
	private int netWeight;
	private int grossWeight;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="invoiceNo")
	private OrderDetails orderDetails;

	public Long getItemId() {
		return itemId;
	}

	/*public void setItemId(Long itemId) {
		this.itemId = itemId;
	}*/

	public int getContainerNo() {
		return containerNo;
	}

	public void setContainerNo(int containerNo) {
		this.containerNo = containerNo;
	}

	public String getKindOfPackaging() {
		return kindOfPackaging;
	}

	public void setKindOfPackaging(String kindOfPackaging) {
		this.kindOfPackaging = kindOfPackaging;
	}

	public String getDescOfGood() {
		return descOfGood;
	}

	public void setDescOfGood(String descOfGood) {
		this.descOfGood = descOfGood;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPricePerUnit() {
		return pricePerUnit;
	}

	public void setPricePerUnit(Double pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public Double getTaxInclusive() {
		return taxInclusive;
	}

	public void setTaxInclusive(Double taxInclusive) {
		this.taxInclusive = taxInclusive;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getNetWeight() {
		return netWeight;
	}

	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}

	public int getGrossWeight() {
		return grossWeight;
	}

	public void setGrossWeight(int grossWeight) {
		this.grossWeight = grossWeight;
	}

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + containerNo;
		result = prime * result + ((descOfGood == null) ? 0 : descOfGood.hashCode());
		result = prime * result + grossWeight;
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((kindOfPackaging == null) ? 0 : kindOfPackaging.hashCode());
		result = prime * result + netWeight;
		result = prime * result + ((orderDetails == null) ? 0 : orderDetails.hashCode());
		result = prime * result + ((pricePerUnit == null) ? 0 : pricePerUnit.hashCode());
		result = prime * result + quantity;
		result = prime * result + ((taxInclusive == null) ? 0 : taxInclusive.hashCode());
		result = prime * result + ((totalAmount == null) ? 0 : totalAmount.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemDetails other = (ItemDetails) obj;
		if (containerNo != other.containerNo)
			return false;
		if (descOfGood == null) {
			if (other.descOfGood != null)
				return false;
		} else if (!descOfGood.equals(other.descOfGood))
			return false;
		if (grossWeight != other.grossWeight)
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (kindOfPackaging == null) {
			if (other.kindOfPackaging != null)
				return false;
		} else if (!kindOfPackaging.equals(other.kindOfPackaging))
			return false;
		if (netWeight != other.netWeight)
			return false;
		if (orderDetails == null) {
			if (other.orderDetails != null)
				return false;
		} else if (!orderDetails.equals(other.orderDetails))
			return false;
		if (pricePerUnit == null) {
			if (other.pricePerUnit != null)
				return false;
		} else if (!pricePerUnit.equals(other.pricePerUnit))
			return false;
		if (quantity != other.quantity)
			return false;
		if (taxInclusive == null) {
			if (other.taxInclusive != null)
				return false;
		} else if (!taxInclusive.equals(other.taxInclusive))
			return false;
		if (totalAmount == null) {
			if (other.totalAmount != null)
				return false;
		} else if (!totalAmount.equals(other.totalAmount))
			return false;
		return true;
	}
	
	
	
}

package com.rg.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Order_Details")
public class OrderDetails {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Long orderId;
	@Column(unique=true)
	private String invoiceNo;
	private String supplier;
	private String consignee;
	private String consigneePO;
	private Date orderDate;
	private String terms;
	
	@OneToMany(mappedBy="orderDetails",cascade=CascadeType.ALL,orphanRemoval=true)
	private Set<ItemDetails> itemDetails=new HashSet<>();
	
	public Long getOrderId() {
		return orderId;
	}
	/*public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}*/
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getConsigneePO() {
		return consigneePO;
	}
	public void setConsigneePO(String consigneePO) {
		this.consigneePO = consigneePO;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getTerms() {
		return terms;
	}
	public void setTerms(String terms) {
		this.terms = terms;
	}
	public Set<ItemDetails> getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(Set<ItemDetails> itemDetails) {
		this.itemDetails = itemDetails;
	}

	public void addItem(ItemDetails item) {
		itemDetails.add(item);
		item.setOrderDetails(this);
	}
	
	public void removeItem(ItemDetails item) {
		itemDetails.remove(item);
		item.setOrderDetails(null);
	}
	
	
}

package in.ashokit.entity;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="ORDER_DTLS")
@Data

public class OrderDetailsEntity {
	
	@Id
	@Column(name="Order_id")
    @GenericGenerator(
            name = "order_id_gen",
            strategy = "in.ashokit.generator.OrderIdGenerator"
        )
	
	@GeneratedValue(generator = "order_id_gen")
	private String orderId;
	
	@Column(name="Order_by")
	private String orderBy;
	
	@Column(name="Order_Placed_Date")
	@Temporal(TemporalType.DATE)
	private Date orderPlacedDate;
	
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public Date getOrderPlacedDate() {
		return orderPlacedDate;
	}
	public void setOrderPlacedDate(Date orderPlacedDate) {
		this.orderPlacedDate = orderPlacedDate;
	}
	@Override
	public String toString() {
		return "OrderDetailsEntity [orderId=" + orderId + ", orderBy=" + orderBy + ", orderPlacedDate="
				+ orderPlacedDate + "]";
	}
	
	

}

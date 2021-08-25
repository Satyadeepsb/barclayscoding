package com.barclays.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass
public class AbstractEntity implements Serializable{

	private static final long serialVersionUID = 4453274873749334950L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	
	@Column(name = "updated_on", columnDefinition = "TIMESTAMP")
    @UpdateTimestamp
    private LocalDateTime updatedOn;
	
	@Column(name = "created_on", columnDefinition = "TIMESTAMP")
    @UpdateTimestamp
    private LocalDateTime createdOn;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

}

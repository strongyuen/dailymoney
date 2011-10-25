/**
 * 
 */
package com.bottleworks.dailymoney.data;

import java.io.Serializable;

/**
 * 账户 包括银行
 * 
 * @author dennis
 */
public class Account implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * 账户id
	 */
	private String id;
	/**
	 * 账户名称
	 */
	private String name;
	/**
	 * 账户类型 支出 收入 债务
	 */
	private String type;
	/**
	 * 账户初始值
	 */
	private double initialValue;
	/**
	 * 是否是现金账户
	 */
	// is cash account;
	private boolean cashAccount;

	Account() {
	}

	public Account(String type, String name, Double initialValue) {
		this.type = type;
		this.name = name == null ? "" : name.trim();
		this.initialValue = initialValue;
		id = this.name;
	}

	public String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? "" : name.trim();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(boolean cashAccount) {
		this.cashAccount = cashAccount;
	}

	public double getInitialValue() {
		return initialValue;
	}

	public void setInitialValue(double initialValue) {
		this.initialValue = initialValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}

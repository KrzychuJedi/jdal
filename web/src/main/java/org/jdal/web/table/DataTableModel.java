package org.jdal.web.table;

import info.joseluismartin.dao.Page;

import java.util.Collection;


/**
 * TableModel bean for exchange table model with YUI DataTable
 * 
 * @author Jose Luis Martin
 */
public class DataTableModel {
	
	/** number of records */
	private int totalRecords;
	/** startIndex */
	private int startIndex;
	/** sort order */
	private String sort;
	/** the page size */
	private int pageSize;
	/** sort order dir (asc, des) */
	private String dir;
	/** List with model records */
	private Collection<?> records;

	/**
	 * @return the totalRecords
	 */
	public int getTotalRecords() {
		return totalRecords;
	}
	
	/**
	 * @param totalRecords the totalRecords to set
	 */
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	
	/**
	 * @return the startIndex
	 */
	public int getStartIndex() {
		return startIndex;
	}
	
	/**
	 * @param startIndex the startIndex to set
	 */
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	
	/**
	 * @return the sort
	 */
	public String getSort() {
		return sort;
	}
	
	/**
	 * @param sort the sort to set
	 */
	public void setSort(String sort) {
		this.sort = sort;
	}
	
	/**
	 * @return the dir
	 */
	public String getDir() {
		return dir;
	}
	
	/**
	 * @param dir the dir to set
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}
	
	/**
	 * @return the records
	 */
	public Collection<?> getRecords() {
		return records;
	}
	
	/**
	 * @param records the records to set
	 */
	public void setRecords(Collection<?> records) {
		this.records = records;
	}
	
	/**
	 * Create a page definition from request data
	 * @return a pageDefinition 
	 */
	public Page<Object> getPage() {
		return new Page<Object>();
	}

	/**
	 * @return the pageSize
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * @param pageSize the pageSize to set
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}


/**
 * 
 */
package com.maxicrop.lottery.services;

import java.util.List;

import com.maxicrop.lottery.model.Above;

/**
 * @author Apichai.T
 * 
 */
public interface AddNumberService {

	/**
	 * Retrieve all cars in the catalog.
	 * 
	 * @return all cars
	 */
	public List<Above> findAll();

	/**
	 * search cars according to keyword in model and make.
	 * 
	 * @param keyword
	 *            for search
	 * @return list of car that match the keyword
	 */
	public List<Above> search(String keyword);

}

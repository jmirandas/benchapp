/**
 * 
 */
package com.benchapp.dao;

/**
 * @author eduardo.bran
 *
 */

import com.benchapp.models.Area;

import org.springframework.stereotype.Repository;

@Repository("areaImplDAO")
public class AreaImpDAO  extends GenericImplDao<Area> implements AreaDAO{
}
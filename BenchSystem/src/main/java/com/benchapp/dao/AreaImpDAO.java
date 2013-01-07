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
import org.springframework.stereotype.Service;

//@Service("areaImplDAO")
@Repository("areaImplDAO")
public class AreaImpDAO  extends GenericImplDao<Area> implements AreaDAO{
}